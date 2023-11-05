package repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import entity.data_master;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import util.Conn;

public class data_masterRepository implements Repository<data_master> {
    private static String tableName = data_master.tableName;
    
    @Override
    public List<data_master> get() {
        String sql = "select * from "+tableName;
        List<data_master> master = new ArrayList<>();
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
    public data_master get(Integer id) {
        String sql = "Select * from "+tableName+" where id = ?";
        data_master master = new data_master();
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
    
    public data_master getbyno_rm(String id) {
        String sql = "Select * from "+tableName+" where no_rm = ?";
        data_master master = new data_master();
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setString(1, id);
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
    
    public data_master getlastid() {
        String sql = "SELECT * FROM "+tableName+" ORDER BY no_rm DESC LIMIT 1;";
        data_master master = new data_master();
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
    public boolean add(data_master master) {
    String sql = "insert into "+tableName+ " (`no_rm`,`nama1`,`nik`,`alamat`,`ttl`,`jenis_kelamin1`, `status_Pembayaran`) values (?,?,?,?,?,?,?)";
        try {
            Connection koneksi =(Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareCall(sql);
            pst.setString(1, master.getNo_rm());
            pst.setString(2, master.getNama());
            pst.setString(3, master.getNik());
            pst.setString(4, master.getAlamat());
            pst.setString(5, master.getTtl());
            pst.setString(6, master.getJenis_kelamin());
            pst.setString(7, master.getStatus_pembayaran());
            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(data_master master) {
        String sql = "update "+tableName+" set nama1 = ?, nik = ?, alamat = ?, ttl = ?, jenis_kelamin1 = ?, status_Pembayaran = ? where id = ?";
        try {
            Connection koneksi =(Connection)Conn.configDB();
            PreparedStatement pst =koneksi.prepareStatement(sql);
            pst.setString(1, master.getNama());
            pst.setString(2, master.getNik());
            pst.setString(3, master.getAlamat());
            pst.setString(4, master.getTtl());
            pst.setString(5, master.getJenis_kelamin());
            pst.setString(6, master.getStatus_pembayaran());
            pst.setInt(7, master.getId());
            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean updatebynorm(data_master master) {
        String sql = "update "+tableName+" set nama1 = ?, nik = ?, alamat = ?, ttl = ?, jenis_kelamin1 = ?, status_Pembayaran = ? where no_rm = ?";
        try {
            Connection koneksi =(Connection)Conn.configDB();
            PreparedStatement pst =koneksi.prepareStatement(sql);
            pst.setString(1, master.getNama());
            pst.setString(2, master.getNik());
            pst.setString(3, master.getAlamat());
            pst.setString(4, master.getTtl());
            pst.setString(5, master.getJenis_kelamin());
            pst.setString(6, master.getStatus_pembayaran());
            pst.setString(7, master.getNo_rm());
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
    
    public boolean deletebyno_rm(String id) {
    String sql = "delete from "+tableName+" where no_rm = ?";
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        }
    }

    private data_master mapToEntity(ResultSet res)throws SQLException {
        data_master master = new data_master(
                res.getString("no_rm"),
            res.getString("nama1"),
            res.getString("nik"),
            res.getString("alamat"),
            res.getString("ttl"),
            res.getString("jenis_kelamin1"),
            res.getString("status_pembayaran")
        );
        master.setId(res.getInt("id"));
        return master;
    }
    

}
