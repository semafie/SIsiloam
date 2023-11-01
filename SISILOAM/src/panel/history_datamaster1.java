
package panel;


import entity.history_datamaster;
import javax.swing.table.DefaultTableModel;
import repository.history_datamasterRepository;

public class history_datamaster1 extends javax.swing.JPanel {
    history_datamasterRepository datamaster = new history_datamasterRepository();
    history_datamaster aaa= new history_datamaster();
    public history_datamaster1() {
        initComponents();
        load_tabel();
    }
    public void load_tabel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID_HISTORY");
        model.addColumn("NO_RM");
        model.addColumn("NAMA");
        model.addColumn("NIK");
        model.addColumn("ALAMAT");
        model.addColumn("TTL");
        model.addColumn("JENIS_KELAMIN");
        model.addColumn("STATUS");
        model.addColumn("AKSI_USER");
        
        try {
            for(history_datamaster apa: datamaster.get()){
                model.addRow(new Object[]{
                    apa.getId(),
                    apa.getNo_rm(),
                    apa.getNama(),
                    apa.getNik(),
                    apa.getAlamat(),
                    apa.getTtl(),
                    apa.getJenis_kelamin(),
                    apa.getStatus(),
                    apa.getNama_user()
                    
                });
            }
            table.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new view.swing.Table();
        bg = new javax.swing.JLabel();

        setLayout(null);

        jScrollPane1.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        add(jScrollPane1);
        jScrollPane1.setBounds(90, 182, 1200, 480);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/bg history_datamaster.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JScrollPane jScrollPane1;
    private view.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
