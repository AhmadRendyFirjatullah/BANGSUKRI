/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bangsukri.frames;

import com.mycompany.bangsukri.db.Basisdata;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author USER
 */
public class KaryawanViewFrame extends javax.swing.JFrame {

    /**
     * Creates new form KaryawanViewFrame
     */
    public KaryawanViewFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cariTextField = new javax.swing.JTextField();
        cariButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        tambahButton = new javax.swing.JButton();
        ubahButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        tutupButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Data Karyawan");

        jLabel2.setText("Cari Karyawan");

        cariButton.setText("Cari");
        cariButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariButtonActionPerformed(evt);
            }
        });

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nama Karyawan", "Nomor HP", "Alamat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewTable);

        tambahButton.setText("Tambah");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        ubahButton.setText("Ubah");
        ubahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahButtonActionPerformed(evt);
            }
        });

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        tutupButton.setText("Tutup");
        tutupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutupButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cariTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 234, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(326, 326, 326))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cariButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tambahButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ubahButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hapusButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tutupButton)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cariTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cariButton)
                    .addComponent(tambahButton)
                    .addComponent(ubahButton)
                    .addComponent(hapusButton)
                    .addComponent(resetButton)
                    .addComponent(tutupButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cariButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariButtonActionPerformed
        try {
            String kataKunci = cariTextField.getText();
            Connection koneksi = Basisdata.getConnection();
            String selectSQL = "SELECT * FROM karyawan WHERE nama_karyawan like '%"+kataKunci+"%' ";
            Statement statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(selectSQL);

            Object[] row = new Object[4];
            DefaultTableModel model = (DefaultTableModel) viewTable.getModel();
            model.setRowCount(0);

            while(resultSet.next()){
                row[0] = resultSet.getInt("id");
                row[1] = resultSet.getString("nama_karyawan");
                row[2] = resultSet.getString("nomor_hp");
                row[3] = resultSet.getString("alamat");
                model.addRow(row);
            }
            koneksi.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        };
        // TODO add your handling code here:
    }//GEN-LAST:event_cariButtonActionPerformed

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        KaryawanAddFrame f = new KaryawanAddFrame();
        f.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void ubahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahButtonActionPerformed
        int barisTerpilih = viewTable.getSelectedRow();
        if(barisTerpilih >= 0){
            TableModel model = viewTable.getModel();
            int id = (int) model.getValueAt(barisTerpilih, 0);
            KaryawanAddFrame f = new KaryawanAddFrame(id);
            f.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Pilih data");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ubahButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        int barisTerpilih = viewTable.getSelectedRow();
        if(barisTerpilih >= 0){
            int pilihan = JOptionPane.showConfirmDialog(null,
                "Yakin hapus?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION);

            if(pilihan == 0){
                try {
                    TableModel model = viewTable.getModel();
                    int id = (int) model.getValueAt(barisTerpilih, 0);
                    Connection koneksi = Basisdata.getConnection();
                    String deleteSQL = "DELETE FROM karyawan WHERE id="+id;
                    Statement statement = koneksi.createStatement();
                    statement.executeUpdate(deleteSQL);
                    koneksi.close();
                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih data");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        formWindowActivated(null);        // TODO add your handling code here:
    }//GEN-LAST:event_resetButtonActionPerformed

    private void tutupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutupButtonActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_tutupButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);
        try {
            Connection koneksi = Basisdata.getConnection();
            String selectSQL = "SELECT * FROM karyawan";
            Statement statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(selectSQL);
            Object[] row = new Object[4];
            DefaultTableModel model = (DefaultTableModel) viewTable.getModel();
            model.setRowCount(0);
            
            while(resultSet.next()){
         	row[0] = resultSet.getInt("id");
              	row[1] = resultSet.getString("nama_karyawan");
                row[2] = resultSet.getString("nomor_hp");
                row[3] = resultSet.getString("alamat");
              	model.addRow(row);
         }

            koneksi.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(KaryawanViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KaryawanViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KaryawanViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KaryawanViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KaryawanViewFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cariButton;
    private javax.swing.JTextField cariTextField;
    private javax.swing.JButton hapusButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton tambahButton;
    private javax.swing.JButton tutupButton;
    private javax.swing.JButton ubahButton;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables
}
