
package repository;

import entity.Entity;
import entity.user;
import java.sql.Connection;
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
        String sql = "Select * from "+ tableName;
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

    
    @Override
    public user get(Integer id) {
        String sql = "select * from "+tableName+" where id = ?";
        user us = new user();
        
        try {
            
        } catch (Exception e) {
        }
        return us;
    }
    

    private user mapToEntity(ResultSet res) throws SQLException{
        user us = new user(
        res.getString("username"),
        res.getString("username"),
        res.getString("username"),
        res.getInt("level")
        );
        us.setId(res.getInt("id"));
        return us;
    }
    
}
