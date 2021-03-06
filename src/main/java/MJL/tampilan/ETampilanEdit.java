/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MJL.tampilan;

import MJL.data.Admin;
import MJL.data.Perusahaan;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author WHOAMI
 */
public class ETampilanEdit extends javax.swing.JFrame {

    /**
     * Creates new form EditData
     */
    public ETampilanEdit() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Border label_border = BorderFactory.createMatteBorder(1, 3, 1, 3,new Color(0,0,153));
        LabelMinimize.setBorder(label_border);
        LabelExit.setBorder(label_border);
        
        Border ids = BorderFactory.createMatteBorder(2, 2, 2, 2,new Color(0,0,153));
        Tnomorpendaftaran.setBorder(ids);
        
        Border field_border = BorderFactory.createMatteBorder(1, 5, 1, 5,new Color(0,0,153));
        Tnama.setBorder(field_border);
        TextPhone.setBorder(field_border);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon img = new ImageIcon("src/main/java/MJL/gambar/Gambar3.jpg");
                Image i = img.getImage();
                g.drawImage(i, 0, 0, this);
            }
        }
        ;
        Panel3 = new javax.swing.JPanel();
        LabelJudul = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label10 = new javax.swing.JLabel();
        Tnomorpendaftaran = new javax.swing.JTextField();
        Tnama = new javax.swing.JTextField();
        TextPhone = new javax.swing.JTextField();
        LabelMinimize = new javax.swing.JLabel();
        LabelExit = new javax.swing.JLabel();
        TombolSimpan = new javax.swing.JButton();
        TombolCek = new javax.swing.JButton();
        TombolKembali = new javax.swing.JButton();
        Label5 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        Label8 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        Pilihan1 = new javax.swing.JComboBox<>();
        Label9 = new javax.swing.JLabel();
        Label11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        Panel1.setBackground(new java.awt.Color(0, 0, 153));

        Panel2.setBackground(new java.awt.Color(204, 204, 204));
        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel3.setBackground(new java.awt.Color(0, 0, 153));
        Panel3.setPreferredSize(new java.awt.Dimension(20, 228));

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );

        Panel2.add(Panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 241));

        LabelJudul.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        LabelJudul.setForeground(new java.awt.Color(0, 0, 153));
        LabelJudul.setText("EDIT DATA");
        LabelJudul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelJudulMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelJudulMouseExited(evt);
            }
        });
        Panel2.add(LabelJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        Label1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Label1.setText("Nomor Pendaftaran");
        Panel2.add(Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 52, -1, -1));

        Label2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Label2.setText("Nama");
        Panel2.add(Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        Label3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Label3.setText("Telepon");
        Panel2.add(Label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        Label10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Label10.setText("Status");
        Panel2.add(Label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 174, -1, -1));
        Panel2.add(Tnomorpendaftaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 40, -1));
        Panel2.add(Tnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 226, -1));

        TextPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextPhoneKeyTyped(evt);
            }
        });
        Panel2.add(TextPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 226, -1));

        LabelMinimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelMinimize.setForeground(new java.awt.Color(0, 0, 153));
        LabelMinimize.setText(" -");
        LabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelMinimizeMouseExited(evt);
            }
        });
        Panel2.add(LabelMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 6, 25, 25));

        LabelExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelExit.setForeground(new java.awt.Color(0, 0, 153));
        LabelExit.setText(" X");
        LabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelExitMouseExited(evt);
            }
        });
        Panel2.add(LabelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 6, 29, 25));

        TombolSimpan.setBackground(new java.awt.Color(0, 0, 153));
        TombolSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolSimpan.setForeground(new java.awt.Color(255, 255, 255));
        TombolSimpan.setText("SIMPAN");
        TombolSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TombolSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TombolSimpanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TombolSimpanMouseExited(evt);
            }
        });
        TombolSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolSimpanActionPerformed(evt);
            }
        });
        Panel2.add(TombolSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        TombolCek.setBackground(new java.awt.Color(0, 0, 153));
        TombolCek.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolCek.setForeground(new java.awt.Color(255, 255, 255));
        TombolCek.setText("CEK");
        TombolCek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TombolCek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TombolCekMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TombolCekMouseExited(evt);
            }
        });
        TombolCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolCekActionPerformed(evt);
            }
        });
        Panel2.add(TombolCek, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 75, -1));

        TombolKembali.setBackground(new java.awt.Color(0, 0, 153));
        TombolKembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolKembali.setForeground(new java.awt.Color(255, 255, 255));
        TombolKembali.setText("KEMBALI");
        TombolKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TombolKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TombolKembaliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TombolKembaliMouseExited(evt);
            }
        });
        TombolKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolKembaliActionPerformed(evt);
            }
        });
        Panel2.add(TombolKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 200, -1, -1));

        Label5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label5.setText(":");
        Panel2.add(Label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        Label6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label6.setText(":");
        Panel2.add(Label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        Label7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label7.setText(":");
        Panel2.add(Label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        Label8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label8.setText(":");
        Panel2.add(Label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Berkas diterima", "Berkas diinterview", "Diterima", "Ditolak"}));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        Panel2.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 226, -1));

        Pilihan1.setModel(new javax.swing.DefaultComboBoxModel<>(perusahaan.get_nama_perusahaan()));
        Panel2.add(Pilihan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 226, -1));

        Label9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Label9.setText("Nama Perusahaan");
        Panel2.add(Label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        Label11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label11.setText(":");
        Panel2.add(Label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelMinimizeMouseClicked
        this.setState(ATampilanDaftarAkun.ICONIFIED);
    }//GEN-LAST:event_LabelMinimizeMouseClicked

    private void LabelMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelMinimizeMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 3, 1, 3, Color.yellow);
        LabelMinimize.setBorder(label_border);
        LabelMinimize.setForeground(Color.yellow);
    }//GEN-LAST:event_LabelMinimizeMouseEntered

    private void LabelMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelMinimizeMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 3, 1, 3,new Color(0,0,153));
        LabelMinimize.setBorder(label_border);
        LabelMinimize.setForeground(new Color(0,0,153));
    }//GEN-LAST:event_LabelMinimizeMouseExited

    private void LabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_LabelExitMouseClicked

    private void LabelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 3, 1, 3, Color.yellow);
        LabelExit.setBorder(label_border);
        LabelExit.setForeground(Color.yellow);
    }//GEN-LAST:event_LabelExitMouseEntered

    private void LabelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 3, 1, 3,new Color(0,0,153));
        LabelExit.setBorder(label_border);
        LabelExit.setForeground(new Color(0,0,153));
    }//GEN-LAST:event_LabelExitMouseExited

    private void TombolSimpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolSimpanMouseEntered
        TombolSimpan.setBackground(new Color(255,255,51));
        TombolSimpan.setForeground(Color.black);
    }//GEN-LAST:event_TombolSimpanMouseEntered

    private void TombolSimpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolSimpanMouseExited
        TombolSimpan.setBackground(new Color(0,0,153));
        TombolSimpan.setForeground(Color.white);
    }//GEN-LAST:event_TombolSimpanMouseExited

    private void TombolCekMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolCekMouseEntered
        TombolCek.setBackground(new Color(255,255,51));
        TombolCek.setForeground(Color.black);
    }//GEN-LAST:event_TombolCekMouseEntered

    private void TombolCekMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolCekMouseExited
        TombolCek.setBackground(new Color(0,0,153));
        TombolCek.setForeground(Color.white);
    }//GEN-LAST:event_TombolCekMouseExited

    private void TombolCekActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Object[] data = admin.cek_pendaftar(Tnomorpendaftaran.getText());
        if ((Boolean) data[0]) {
            TombolSimpan.setEnabled(true);
            Tnomorpendaftaran.setText((String) data[1]);
            Tnama.setText((String) data[2]);
            TextPhone.setText((String) data[3]);
            status.setSelectedItem(data[4]);
            TombolSimpan.isCursorSet();
        } else {
            TombolSimpan.setEnabled(false);
            Tnomorpendaftaran.setText("");
            Tnama.setText("");
            TextPhone.setText("");
            status.setSelectedItem("Choose...");
        }

    }
    
    private void TombolSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolSimpanActionPerformed
        String vname = Tnama.getText();
        String vphone = TextPhone.getText();
        String vstatus = (String) status.getSelectedItem();
        String pilihan = (String) Pilihan1.getSelectedItem();
        String vcomp = Tnomorpendaftaran.getText();
        admin.update_status_pendaftar(vname, vphone, vstatus, vcomp, pilihan);
    }//GEN-LAST:event_TombolSimpanActionPerformed

    private void TombolKembaliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolKembaliMouseEntered
        TombolKembali.setBackground(new Color(255,255,51));
        TombolKembali.setForeground(Color.black);
    }//GEN-LAST:event_TombolKembaliMouseEntered

    private void TombolKembaliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolKembaliMouseExited
        TombolKembali.setBackground(new Color(0,0,153));
        TombolKembali.setForeground(Color.white);
    }//GEN-LAST:event_TombolKembaliMouseExited

    private void TombolKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolKembaliActionPerformed
        this.dispose();
    }//GEN-LAST:event_TombolKembaliActionPerformed

    private void TextPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextPhoneKeyTyped
        if(Character.isLetter(evt.getKeyChar())){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Harus dalam format angka","Perhatian",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_TextPhoneKeyTyped

    private void LabelJudulMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelJudulMouseEntered
        LabelJudul.setForeground(Color.YELLOW);
    }//GEN-LAST:event_LabelJudulMouseEntered

    private void LabelJudulMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelJudulMouseExited
        LabelJudul.setForeground(new Color(0,0,153));
    }//GEN-LAST:event_LabelJudulMouseExited

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    Admin admin = new Admin();
    Perusahaan perusahaan = new Perusahaan();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label10;
    private javax.swing.JLabel Label11;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JLabel Label8;
    private javax.swing.JLabel Label9;
    private javax.swing.JLabel LabelExit;
    private javax.swing.JLabel LabelJudul;
    private javax.swing.JLabel LabelMinimize;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JComboBox<String> Pilihan1;
    private javax.swing.JTextField TextPhone;
    private javax.swing.JTextField Tnama;
    private javax.swing.JTextField Tnomorpendaftaran;
    private javax.swing.JButton TombolCek;
    private javax.swing.JButton TombolKembali;
    private javax.swing.JButton TombolSimpan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}