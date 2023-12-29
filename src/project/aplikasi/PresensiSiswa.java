/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.aplikasi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tamar
 */
public class PresensiSiswa extends javax.swing.JFrame {

    /**
     * Creates new form PresensiSiswa
     */
    private Timer timer;
    
    public PresensiSiswa() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
         timer = new Timer (1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 showDayDateTime();
            }
        });
        
        timer.start();
    }
    
    private void showDayDateTime(){
        Date now = new Date();
        SimpleDateFormat dateFormat =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = dateFormat.format(now);
        lb_tanggal.setText(dateTime);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bodyPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_tanggal = new javax.swing.JLabel();
        txtNis = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtWaktu = new javax.swing.JTextField();
        txtKelas = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        rbHadir = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtKeluar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bodyPanel.setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AbsensiDuls");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Presensi Kehadiran Kalian Dulu Yuk!");

        lb_tanggal.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        lb_tanggal.setForeground(new java.awt.Color(255, 255, 255));
        lb_tanggal.setText("Tanggal & Waktu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 579, Short.MAX_VALUE)
                .addComponent(lb_tanggal)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lb_tanggal))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        txtNis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNisActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("NIS");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("Nama");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Kelas");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setText("Waktu Hadir");

        txtWaktu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtWaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWaktuActionPerformed(evt);
            }
        });

        txtKelas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtNama.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIS", "Nama", "Kelas", "Waktu Hadir", "Waktu Keluar"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbHadir);
        rbHadir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbHadir.setSelected(true);
        rbHadir.setText("Hadir");
        rbHadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHadirActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton2.setText("Keluar");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setText("Waktu Keluar");

        txtKeluar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(txtKelas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWaktu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNis)
                    .addComponent(txtKeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addComponent(rbHadir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addComponent(jScrollPane1)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNis, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(rbHadir)
                    .addComponent(jRadioButton2))
                .addGap(29, 29, 29)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtWaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWaktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWaktuActionPerformed

    private void txtNisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNisActionPerformed
        // TODO add your handling code here:
        DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
        String NIS = txtNis.getText();
        String Query = "SELECT * FROM `tbl_siswa`" 
                + "WHERE" 
                + "`nis`="+NIS+"";
       
        Connection k = Koneksi.sambung_ke_db();
        try {
            Statement stat = k.createStatement();
            ResultSet rs = stat.executeQuery(Query);
            while (rs.next()) {
                if(rbHadir.isSelected()){
                String nama = rs.getString("nama");
                String kelas = rs.getString("kelas");
                txtNama.setText(nama);
                txtKelas.setText(kelas); 
                
                Date now = new Date();
                SimpleDateFormat dateFormat =  new SimpleDateFormat("yyyy-MM-dd HH:mm");
                String dateTime = dateFormat.format(now);
                txtWaktu.setText(dateTime);
                
                String q = "INSERT INTO tbl_kehadiran (nama, kelas, nis, waktu_hadir) VALUES ('" + txtNama.getText() + "' , " + txtKelas.getText()
                + " , " + txtNis.getText() + " , CURRENT_TIMESTAMP )";
                
                stat.executeUpdate(q);
                
                txtNis.setText("");
                txtNis.requestFocus();
                
                Object[] data = {NIS,nama,kelas,dateTime};  
                m.addRow(data);
                
                }else {
                    Date now = new Date ();
                    SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd HH:mm");
                    String waktu_Keluar = dateFormat.format(now);
                    txtKeluar.setText(waktu_Keluar);
                    
                    String s = "INSERT INTO tbl_kehadiran (nama, kelas, nis, waktu_keluar) VALUES ('" + txtNama.getText() + "' , " + txtKelas.getText()
                    + " , " + txtNis.getText() + " , CURRENT_TIMESTAMP )";
                
                    stat.executeUpdate(s);
                    
                
                    // Find the index of the last added row
                    int lastIndex = m.getRowCount() - 1;

                    // Update the last added row with txtKeluar data
                    m.setValueAt(waktu_Keluar, lastIndex, 4);

                    txtNis.setText("");
                    txtNis.requestFocus();
                    
                }
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }//GEN-LAST:event_txtNisActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Admin AdminFrame = new Admin();
        AdminFrame.setVisible(true);    
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void rbHadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHadirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rbHadirActionPerformed

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
            java.util.logging.Logger.getLogger(PresensiSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PresensiSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PresensiSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PresensiSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PresensiSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_tanggal;
    private javax.swing.JRadioButton rbHadir;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtKeluar;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNis;
    private javax.swing.JTextField txtWaktu;
    // End of variables declaration//GEN-END:variables
}
