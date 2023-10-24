/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.swing;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static view.swing.itempoli.txtpoli;

/**
 *
 * @author RESCOM-1
 */
public class itemdokter extends javax.swing.JPanel {
    private final List<EventMenuSelected> events = new ArrayList<>();
    private int index;
    private boolean selected;
    private boolean mouseOver;
    private JPanel containerPanel;
    
    
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        itemdokter.setVisible(!selected);
        itemdokter1.setVisible(selected);
        repaint();
    }
    public itemdokter() {
        initComponents();
        Font font = new Font("Quicksand", Font.BOLD, 22);
        txtjadwal.setFont(font);
        txtnamadokter.setFont(font);
        itemdokter1.setVisible(false);
        setOpaque(false);
        this.index = index;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mouseOver = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseOver = false;
                repaint();
            }
            @Override
            public void mouseReleased(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    if (mouseOver) {
                        setSelected(true);
                        repaint();
                        runEvent();
                    }
                }
            }
        });
    }
    
    private void runEvent() {
        for (EventMenuSelected event : events) {
            event.selected(index);
        }
    }

    public void addEvent(EventMenuSelected event) {
        events.add(event);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtjadwal = new javax.swing.JLabel();
        txtnamadokter = new javax.swing.JLabel();
        itemdokter = new javax.swing.JLabel();
        itemdokter1 = new javax.swing.JLabel();

        setLayout(null);
        add(txtjadwal);
        txtjadwal.setBounds(40, 110, 360, 40);
        add(txtnamadokter);
        txtnamadokter.setBounds(70, 30, 300, 40);

        itemdokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/bgitemdokter1.png"))); // NOI18N
        add(itemdokter);
        itemdokter.setBounds(0, 0, 451, 177);

        itemdokter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/bgitemdokter2.png"))); // NOI18N
        add(itemdokter1);
        itemdokter1.setBounds(0, 0, 451, 177);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel itemdokter;
    private javax.swing.JLabel itemdokter1;
    public static javax.swing.JLabel txtjadwal;
    public static javax.swing.JLabel txtnamadokter;
    // End of variables declaration//GEN-END:variables
}