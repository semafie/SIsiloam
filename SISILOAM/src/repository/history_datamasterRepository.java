
package repository;


import entity.history_datamaster;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import util.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

public class history_datamasterRepository implements Repository<history_datamaster>{
    private static String tableName = history_datamaster.tableName;

    @Override
    public List<history_datamaster> get() {
      String sql = "select * from "+tableName;
        List<history_datamaster> master = new ArrayList<>();
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
    public history_datamaster get(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(history_datamaster entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(history_datamaster entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private history_datamaster mapToEntity(ResultSet res)throws SQLException {
        history_datamaster master = new history_datamaster(
            res.getString("nama"),
            res.getInt("nik"),
            res.getString("alamat"),
            res.getString("ttl"),
            res.getString("jenis_kelamin"),
            res.getString("status"),
            res.getString("nama_user")
        );
        master.setId(res.getInt("id"));
        return master;
    }
}
