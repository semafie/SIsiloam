
package repository;

import com.mysql.cj.xdevapi.Result;
import entity.data_dokter;
import entity.data_master;
import entity.pasienbaru_sementara;
import entity.rekap_harian;
import entity.user;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import util.Conn;

public class cek {
    public static void main(String[] args) {
        data_masterRepository masterRepository = new data_masterRepository();
        pasienbaru_sementaraRepository master11Repository = new pasienbaru_sementaraRepository();
        data_dokterRepository dokterRepository = new data_dokterRepository();
        userRepository userRepository = new userRepository();
        data_dokter aaaa = new data_dokter();
        data_master ass = new data_master("4sdadas", "restuuu",32020392,"jl apayaa","jember, 23/02/2004","Laki - laki");  
        pasienbaru_sementara apo = new pasienbaru_sementara(1, "restuuu",32020392,"jl apayaa","jember, 23/02/2004","Laki - laki");
        Date pp = new Date();
        Timestamp timestamp = new Timestamp(new Date().getTime());
        rekap_harianRepository apa = new rekap_harianRepository();
        rekap_harian apa1 = new rekap_harian(timestamp,pp,aaaa,ass);
//        apa.add(apa1);
        data_dokter ass1S = new data_dokter( "Dr gagah", "432423432", "Poli gigi", "dsadasddsada", "Laki - Laki", 1, pp);
//        dokterRepository.add(ass1S);
        masterRepository.add(ass);
//        rekap_harianRepository a = new rekap_harianRepository();
        pasienbaru_sementaraRepository aaaa2 = new pasienbaru_sementaraRepository();
        System.out.println(aaaa2.get(1).getNama());
//        System.out.println(apa.getlastid().getId());
//        master11Repository.update(apo);

//        user ass1 = new user(4 , "anakmu", "ibuku", "sayang", 1);
//            dokterRepository.add(ass1);
//        System.out.println(masterRepository.get(1).getNama());
//         String[] holla = {"doni", "haji slamet", "bagus"};
//
//        // Menggunakan perulangan for untuk menampilkan setiap nama dalam array
//        for (String nama : holla) {
//            System.out.println(nama);
//        }
//        for(int index = 0; index < holla.length; index++){
//    String hayo = holla[index]; 
//            System.out.println(hayo);
//        }
//        masterRepository.add(ass);

        
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
        
        AutoIDGenerator generator = new AutoIDGenerator();

        
//            String autoID = generator.generateAutoID();
//            System.out.println(autoID);
            String lastID = "99-02-03"; // Ganti dengan ID terakhir dari database
        String[] parts = lastID.split("-");
        generator.left = Integer.parseInt(parts[2]);
        generator.middle = Integer.parseInt(parts[1]);
        generator.right = Integer.parseInt(parts[0]);

        String autoID = generator.generateAutoID();
        System.out.println("Auto-generated ID: " + autoID);
                
    }
    

}
class AutoIDGenerator {
    int left = 0;
    int middle = 0;
    int right = 0;

    public String generateAutoID() {
        if (right < 99) {
            right++;
        } else {
            right = 0;
            if (middle < 99) {
                middle++;
            } else {
                middle = 0;
                if (left < 99) {
                    left++;
                } else {
                    // Reset ke 0 jika semua sudah mencapai 99
                    left = 0;
                }
            }
        }

        String leftStr = String.format("%02d", left);
        String middleStr = String.format("%02d", middle);
        String rightStr = String.format("%02d", right);

        return rightStr+ "-" + middleStr + "-" + leftStr ;
    }

    
    }