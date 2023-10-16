/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.swing;

import entity.data_dokter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import repository.data_dokterRepository;

/**
 *
 * @author RESCOM-1
 */
public class itemdokter_tampilan extends javax.swing.JFrame {
    private String nomorpanel;
    public String nomorpanel1;
    private JPanel container;
    private List<JPanel> panellist;
    data_dokterRepository dokter = new data_dokterRepository();
    private String namapaket11;
    
    
    public itemdokter_tampilan() {
        initComponents();
        panellist = new ArrayList<>();
        getpanel();
    }
    
    public void getpanel(){
        try{
            String sql = "Select * from data_dokter";
            Connection con =(Connection)util.Conn.configDB();
            PreparedStatement psw = con.prepareStatement(sql);
            ResultSet res = psw.executeQuery();
            int marginKiri = 10;
            int baris = 0;
            int kolom = 0;
            int dimensi = baris + 1;
            container = new JPanel();
            
                
            for(data_dokter p:dokter.get()){
                    String id_barang = String.valueOf(p.getId());
                   namapaket11 = p.getNama();
//                   String lamapaket = String.valueOf(p.getNama());
//                   String hargaa = String.valueOf("Rp. "+p.getHarga());
                   System.out.println(namapaket11);
//                   System.out.println(lamapaket);
                   
                itemdokter pnn = new itemdokter();
//                pnn.namapaket123.setText(namapaket11);
//                   pnn.infopaket.setText(lamapaket);
//                   pnn.harga.setText(lamapaket);
                int index = panellist.size() + 1;
                pnn.setIndex(index);
                container.setLayout(null);
                pnn.setSize(451, 188);
                container.add(pnn);
                container.setPreferredSize(new Dimension(1000, 250 + (212 * baris)));
                container.setBackground(Color.WHITE);
//                container.setBorder(null);
                jScrollPane1.setPreferredSize(new Dimension(910, 220 * dimensi));
                
                jScrollPane1.setViewportView(container);
                jScrollPane1.setVerticalScrollBar(scrollBarCustom1);
                if (kolom <= 2) {
                pnn.setLocation(kolom * 450, baris * 200);
                    } else {
                baris++;
                kolom = 0;
                pnn.setLocation(kolom * 450, baris * 200);
                
                    }
                kolom ++;
                container.revalidate();
                container.repaint();
                pnn.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mouseEntered(MouseEvent e){
                        super.mouseEntered(e);
                        
//                        PaketForm.id = p.getId();  
                        
                    }
                });
                pnn.addEvent(new EventMenuSelected() {
                    @Override
                    public void selected(int index) {
                        clearMenu(index);
//                        PaketForm.id = p.getId();   
//                        DialogEditPaket.idPak = p.getId();
                        System.out.println(p.getId());
                    }
                });
                panellist.add(pnn); 
            }
//            while(res.next()){
//                final String id_barang = res.getString(1);
//                ItemPaket pnn = new ItemPaket();
//                int index = panellist.size() + 1;
//                pnn.setIndex(index);
//                container.setLayout(null);
//                pnn.setSize(290, 188);
//                container.add(pnn);
//                container.setPreferredSize(new Dimension(920, 250 + (250 * baris)));
//                container.setBackground(Color.WHITE);
////                container.setBorder(null);
//                jScrollPane1.setPreferredSize(new Dimension(1000, 300 * dimensi));
//                
//                jScrollPane1.setViewportView(container);
//                jScrollPane1.setVerticalScrollBar(scrollBarCustom1);
//                if (kolom <= 2) {
//                pnn.setLocation(kolom * 290, baris * 200);
//                    } else {
//                baris++;
//                kolom = 0;
//                pnn.setLocation(kolom * 290, baris * 200);
//                
//                    }
//                kolom ++;
//                container.revalidate();
//                container.repaint();
//                pnn.addMouseListener(new MouseAdapter(){
//                    @Override
//                    public void mouseEntered(MouseEvent e){
//                        super.mouseEntered(e);
//                        nomorpanel = id_barang;                   
//                        
//                    }
//                });
//                pnn.addEvent(new EventMenuSelected() {
//                    @Override
//                    public void selected(int index) {
//                        clearMenu(index);
//                        nomorpanel1 = id_barang;
//                        System.out.println(nomorpanel);
//                    }
//                });
//                panellist.add(pnn);
//            }
            
        }catch( Exception e ){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    private void clearMenu(int exceptIndex) {
        for (Component com : container.getComponents()) {
            itemdokter item = (itemdokter) com;
            if (item.getIndex() != exceptIndex) {
                item.setSelected(false);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        scrollBarCustom1 = new view.swing.ScrollBarCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scrollBarCustom1.setForeground(new java.awt.Color(95, 193, 193));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollBarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollBarCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(itemdokter_tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(itemdokter_tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(itemdokter_tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(itemdokter_tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new itemdokter_tampilan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private view.swing.ScrollBarCustom scrollBarCustom1;
    // End of variables declaration//GEN-END:variables
}
