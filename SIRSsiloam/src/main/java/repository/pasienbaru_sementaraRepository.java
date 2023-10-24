        package repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import entity.data_master;
import entity.pasienbaru_sementara;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import util.Conn;

public class pasienbaru_sementaraRepository implements Repository<pasienbaru_sementara> {
    private static String tableName = pasienbaru_sementara.tableName;
    
    @Override
    public List<pasienbaru_sementara> get() {
        String sql = "select * from "+tableName;
        List<pasienbaru_sementara> master = new ArrayList<>();
        try {
            Connection koneksi = (Connection)Conn.configDB();
            Statement stm = koneksi.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                master.add(mapToEntity(res));
            }
        } catch (Exception e) {
        e.printStackTrace();
        }
        return master;
    }

    @Override
    public pasienbaru_sementara get(Integer id) {
        String sql = "Select * from "+tableName+" where id = ?";
        pasienbaru_sementara master = new pasienbaru_sementara();
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
            System.out.println(e.getMessage());
        }
        return master;
    }

    @Override
    public boolean add(pasienbaru_sementara master) {
    String sql = "insert into "+tableName+ " values (?,?,?,?,?,?)";
        try {
            Connection koneksi =(Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareCall(sql);
            pst.setInt(1, master.getId());
            pst.setString(2, master.getNama());
            pst.setInt(3, master.getNik());
            pst.setString(4, master.getAlamat());
            pst.setString(5, master.getTtl());
            pst.setString(6, master.getJenis_kelamin());
            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(pasienbaru_sementara master) {
        String sql = "update "+tableName+" set nama = ?, nik = ?, alamat = ?, ttl = ?, jenis_kelamin = ? where id = ?";
        try {
            Connection koneksi =(Connection)Conn.configDB();
            PreparedStatement pst =koneksi.prepareStatement(sql);
            pst.setString(1, master.getNama());
            pst.setInt(2, master.getNik());
            pst.setString(3, master.getAlamat());
            pst.setString(4, master.getTtl());
            pst.setString(5, master.getJenis_kelamin());
            pst.setInt(6, master.getId());
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
            System.out.println(e.getMessage());
            return false;
        }
    }

    private pasienbaru_sementara mapToEntity(ResultSet res)throws SQLException {
        pasienbaru_sementara master = new pasienbaru_sementara(
            res.getString("nama"),
            res.getInt("nik"),
            res.getString("alamat"),
            res.getString("ttl"),
            res.getString("jenis_kelamin")
        );
        master.setId(res.getInt("id"));
        return master;
    }
    

}
