package repository;

import entity.data_dokter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.Conn;

public class data_dokterRepository implements Repository<data_dokter>{
    private static String tableName = data_dokter.tableName;
    
    @Override
    public List<data_dokter> get() {
        String sql = "select * from "+tableName;
        List<data_dokter> data_dokter = new ArrayList<>();
        try {
            Connection koneksi =(Connection)Conn.configDB();
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

    @Override
    public data_dokter get(Integer id) {
         String sql = "select * from "+tableName+" where id = ?";
        data_dokter datadokter = new data_dokter();
        
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setInt(0, id);
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                return mapToEntity(res);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return datadokter;

    }

    @Override
    public boolean add(data_dokter entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public boolean update(data_dokter dokter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(data_dokter dokter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     private data_dokter mapToEntity(ResultSet res) throws SQLException{
        data_dokter us = new data_dokter(
        res.getString("nama"),
        res.getInt("no_hp"),
        res.getString("jenis_poli"),
        res.getString("jadwal"),
        res.getInt("no_antrian"),
        res.getDate("tanggal")
        );
        us.setId(res.getInt("id"));
        return us;
    }
}
