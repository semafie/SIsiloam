/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import entity.rekap_harian;
import panel.Dasboard;
import panel.Dasboardowner;
import panel.Login;
import panel.buatpasswordbaru;
import panel.daftarakun;
import panel.datadokter;
import panel.datadokter_edit;
import panel.datadokter_tambah;
import panel.datamaster;
import panel.datamaster_edit;
import panel.kirimkode;
import panel.pasienbaru;
import panel.pasienbaru1;

import panel.pasienbaru_pilihdokter;
import panel.pasienbaru_pilihdokter1;
import panel.pasienbaru_pilihpoli;
import panel.pasienbaru_pilihpoli1;
import panel.pasienbaru_tambahdaftar;
import panel.pasienbaru_tambahdaftar1;
import panel.pasienlama;
import panel.rekapharian1;
import panel.verifikasi;

/**
 *
 * @author semafie
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public main() {
        initComponents();
        showlogin();
    }
public void showlogin(){
        Login apa = new Login();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showdasboard(){
        Dasboard apa = new Dasboard();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showdasboardowner(){
        Dasboardowner apa = new Dasboardowner();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showkode(){
        kirimkode apa = new kirimkode();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showver(){
        verifikasi apa = new verifikasi();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showpass(){
        buatpasswordbaru apa = new buatpasswordbaru();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showdatamaster(){
        datamaster apa = new datamaster();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showdatamaster_edit(){
        datamaster_edit apa = new datamaster_edit();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showdatadokter(){
        datadokter apa = new datadokter();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showdatadokter_tambah(){
        datadokter_tambah apa = new datadokter_tambah();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showdatadokter_edit(){
        datadokter_edit apa = new datadokter_edit();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showpasienbaru(){
        pasienbaru apa = new pasienbaru();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showpasienbaru1(){
        pasienbaru1 apa = new pasienbaru1();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    
    public void showpasienbaru_pilihpoli(){
        pasienbaru_pilihpoli apa = new pasienbaru_pilihpoli();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showpasienbaru_pilihdokter(){
        pasienbaru_pilihdokter apa = new pasienbaru_pilihdokter();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showpasienbaru_pilihpoli1(){
        pasienbaru_pilihpoli1 apa = new pasienbaru_pilihpoli1();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showpasienbaru_pilihdokter1(){
        pasienbaru_pilihdokter1 apa = new pasienbaru_pilihdokter1();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showpasienbaru_tambahdaftar(){
        pasienbaru_tambahdaftar apa = new pasienbaru_tambahdaftar();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showpasienbaru_tambahdaftar1(){
        pasienbaru_tambahdaftar1 apa = new pasienbaru_tambahdaftar1();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showpasienlama(){
        pasienlama apa = new pasienlama();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showrekapharian(){
        rekapharian1 apa = new rekapharian1();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showdaftar_akun(){
        daftarakun apa = new daftarakun();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
