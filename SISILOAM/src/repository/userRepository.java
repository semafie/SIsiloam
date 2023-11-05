
package repository;

import entity.Entity;
import entity.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.Conn;

public class userRepository implements Repository<user>{
    private String tableName = user.tableName;
    
    @Override
    public List<user> get() {
        String sql = "Select * from "+ tableName+" where level = 2";
        List<user> user = new ArrayList<>();
        try {
            Connection koneksi = (Connection)Conn.configDB();
            Statement stm = koneksi.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                user.add(mapToEntity(res));
            }
        } catch (Exception e) {
        e.printStackTrace();
        }
        return user;
    }
    public user getlastid() {
        String sql = "SELECT * FROM "+tableName+" ORDER BY id DESC LIMIT 1;";
        user master = new user();
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            ResultSet res = pst.executeQuery();
            while (res.next()) {                
                return mapToEntity(res);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return master;
    }
    
    @Override
    public user get(Integer id) {
        String sql = "select * from "+tableName+" where id = ?";
        user us = new user();
        
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                return mapToEntity(res);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return us;
    }

    @Override
    public boolean add(user us)  {
        String sql = "Insert into "+tableName+" (`id`,`username`, `password`, `email`, `level`,`token` ) values (?,?,?,?,?,?)";
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            
            pst.setInt(1, us.getId());
            pst.setString(2, us.getUsername());
            pst.setString(3, us.getPassword());
            pst.setString(4, us.getEmail());
            pst.setInt(5, us.getLevel());
            pst.setInt(6, us.getToken());
            pst.execute();
            return  true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(user us) {
        String sql = "update "+tableName+" set username = ?, password = ?, email = ? where id = ?";
        try {
            Connection koneksi =(Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setString(1, us.getUsername());
            pst.setString(2, us.getPassword());
            pst.setString(3, us.getEmail());
            pst.setInt(4, us.getId());
            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        String sql = "delete from "+tableName+" where id = ?";
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    

    private user mapToEntity(ResultSet res) throws SQLException{
        user us = new user(
        res.getString("username"),
        res.getString("password"),
        res.getString("email"),
        res.getInt("level"),
        res.getInt("token")
        );
        us.setId(res.getInt("id"));
        
        return us;
    }
    
}
