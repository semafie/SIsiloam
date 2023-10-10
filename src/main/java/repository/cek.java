
package repository;

import com.mysql.cj.xdevapi.Result;
import entity.data_dokter;
import entity.data_master;
import entity.user;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import util.Conn;

public class cek {
    public static void main(String[] args) {
        data_masterRepository masterRepository = new data_masterRepository();
        data_dokterRepository dokterRepository = new data_dokterRepository();
        userRepository userRepository = new userRepository();
        data_master ass = new data_master(2, "debby",32020392,"jl apayaa","jember, 23/02/2004","Laki - laki");  
        user ass1 = new user(4 , "anakmu", "ibuku", "sayang", 1);
        Date apa = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggalHariIni = dateFormat.format(apa);
        System.out.println(apa);
        data_dokter ass2 = new data_dokter(2, "restu", 8777766, "ppoli gigi", "apa hayoo", 1, apa);
        
        if (dokterRepository.delete(ass2)) {
            System.out.println("berhasil");
        } else{
            System.out.println("gagal");
        }

        
//        String sql = "select * from user";
//        try {
//            Connection koneksi = (Connection)Conn.configDB();
//            Statement stm = koneksi.createStatement();
//            ResultSet res = stm.executeQuery(sql);
//           if (res.next()) {
//        String email = res.getString("email");
//        System.out.println(email);
//    } else {
//        System.out.println("Email dengan ID 1 tidak ditemukan.");
//    }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        
        
    }
}
