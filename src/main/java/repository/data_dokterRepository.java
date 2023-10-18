package repository;

import entity.data_dokter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.Conn;
import view.swing.itempoli_tampilan;

public class data_dokterRepository implements Repository<data_dokter> {
    private static String tableName = data_dokter.tableName;
    

    @Override
    public List<data_dokter> get() {
        String sql = "select * from " + tableName;
        List<data_dokter> data_dokter = new ArrayList<>();
        try {
            Connection koneksi = (Connection) Conn.configDB();
            Statement stm = koneksi.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                data_dokter.add(mapToEntity(res));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data_dokter;
    }
    
    
    public List<data_dokter> get(String jenispoli) {
        String sql = "select * from " + tableName + " where jenis_poli = ?";
        List<data_dokter> data_dokter = new ArrayList<>();
        try {
            Connection koneksi = (Connection) Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setString(1, jenispoli);
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                data_dokter.add(mapToEntity(res));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data_dokter;
    }

    @Override
    public data_dokter get(Integer id) {
        String sql = "select * from " + tableName + " where id = ?";
        data_dokter datadokter = new data_dokter();

        try {
            Connection koneksi = (Connection) Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                return mapToEntity(res);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return datadokter;

    }
    public data_dokter getlastid() {
        String sql = "SELECT * FROM "+tableName+" ORDER BY id DESC LIMIT 1;";
        data_dokter master = new data_dokter();
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
    public boolean add(data_dokter dokter) {
    String sql = "insert into "+tableName+ " (`nama`,`no_hp`,`jenis_poli`,`jadwal`,`jenis_kelamin`,`no_antrian`,`tanggal`) value (?,?,?,?,?,?,?)";
        try {
            Connection koneksi =(Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            
            pst.setString(1, dokter.getNama());
            pst.setString(2, dokter.getNo_hp());
            pst.setString(3, dokter.getJenis_poli());
            pst.setString(4, dokter.getJadwal());
            pst.setString(5, dokter.getJenis_kelamin());
            pst.setInt(6, dokter.getNo_antrian());
            pst.setDate(7, new Date(dokter.getTanggal().getTime()));
            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


        
    @Override
    public boolean update(data_dokter dokter) {
    String sql = "update "+tableName+" set nama = ?, no_hp = ?, jenis_poli =?, jadwal = ?, jenis_kelamin = ?, no_antrian = ?, tanggal = ? where id = ?";    
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setString(1, dokter.getNama());
            pst.setString(2, dokter.getNo_hp());
            pst.setString(3, dokter.getJenis_poli());
            pst.setString(4, dokter.getJadwal());
            pst.setString(5, dokter.getJenis_kelamin());
            pst.setInt(6, dokter.getNo_antrian());
            pst.setDate(7, new Date(dokter.getTanggal().getTime()));
            pst.setInt(8, dokter.getId());
            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
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

    private data_dokter mapToEntity(ResultSet res) throws SQLException {
        data_dokter us = new data_dokter(
                res.getString("nama"),
                res.getString("no_hp"),
                res.getString("jenis_poli"),
                res.getString("jadwal"),
                res.getString("jenis_kelamin"),
                res.getInt("no_antrian"),
                res.getDate("tanggal"));
        us.setId(res.getInt("id"));
        return us;
    }
}
