
package repository;

import com.mysql.cj.xdevapi.Result;
import entity.user;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import util.Conn;

public class cek {
    public static void main(String[] args) {
        userRepository userRepository = new userRepository();
        user ass = new user(6,"debby chan","zahro chan","firda chan , daus chan",2);  
        userRepository.add(ass);
//        if () {
//            System.out.println("berhasil");
//        } else{
//            System.out.println("gagal");
//        }

        
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
