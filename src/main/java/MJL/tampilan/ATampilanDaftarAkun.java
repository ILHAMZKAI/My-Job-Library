/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MJL.tampilan;

import MJL.data.DaftarAkun;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author WHOAMI
 */
public class ATampilanDaftarAkun extends javax.swing.JFrame {
    public ATampilanDaftarAkun() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(Rpria);
        bg.add(Rwanita);
        
        Border label_border = BorderFactory.createMatteBorder(1, 3, 1, 3,new Color(0,0,153));
        LabelMinimize.setBorder(label_border);
        LabelExit.setBorder(label_border);
        
        Border label_regist = BorderFactory.createMatteBorder(0, 0, 1, 0,Color.WHITE);
        Disini.setBorder(label_regist);
        
        Border field_border = BorderFactory.createMatteBorder(1, 5, 1, 5,new Color(0,0,153));
        Tnama.setBorder(field_border);
        Talamat.setBorder(field_border);
        Ttelepon.setBorder(field_border);
        Tsandi.setBorder(field_border);
        Tusandi.setBorder(field_border);
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon img = new ImageIcon("src/main/java/MJL/gambar/Gambar5.jpg");
                Image i = img.getImage();
                g.drawImage(i, 0, 0, this);
            }
        }
        ;
        LabelJudul = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Tnama = new javax.swing.JTextField();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Rpria = new javax.swing.JRadioButton();
        Talamat = new javax.swing.JTextField();
        Ttelepon = new javax.swing.JTextField();
        Tsandi = new javax.swing.JPasswordField();
        Note1 = new javax.swing.JLabel();
        TombolDaftar = new javax.swing.JButton();
        CBV = new javax.swing.JCheckBox();
        TombolBersihkan = new javax.swing.JButton();
        TombolBatal = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Rwanita = new javax.swing.JRadioButton();
        Label6 = new javax.swing.JLabel();
        Tusandi = new javax.swing.JPasswordField();
        LabelExit = new javax.swing.JLabel();
        LabelMinimize = new javax.swing.JLabel();
        Note2 = new javax.swing.JLabel();
        Disini = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        Label8 = new javax.swing.JLabel();
        Label9 = new javax.swing.JLabel();
        Label10 = new javax.swing.JLabel();
        Label11 = new javax.swing.JLabel();
        Label12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelJudul.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        LabelJudul.setForeground(new java.awt.Color(0, 0, 153));
        LabelJudul.setText("DAFTAR AKUN");
        LabelJudul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelJudulMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelJudulMouseExited(evt);
            }
        });
        jPanel4.add(LabelJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        Label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label1.setText("Pengguna");
        jPanel4.add(Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 66, -1, -1));
        jPanel4.add(Tnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 66, 226, -1));

        Label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label2.setText("Jenil Kelamin");
        jPanel4.add(Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 106, -1, -1));

        Label3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label3.setText("Alamat");
        jPanel4.add(Label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 146, -1, -1));

        Label4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label4.setText("Telepon");
        jPanel4.add(Label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 186, -1, -1));

        Label5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label5.setText("Sandi");
        jPanel4.add(Label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 226, -1, -1));

        Rpria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Rpria.setText("Pria");
        Rpria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(Rpria, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 107, -1, -1));
        jPanel4.add(Talamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 146, 226, -1));

        Ttelepon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TteleponKeyTyped(evt);
            }
        });
        jPanel4.add(Ttelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 186, 226, -1));
        jPanel4.add(Tsandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 226, 226, -1));

        Note1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Note1.setForeground(new java.awt.Color(255, 255, 255));
        Note1.setText("Kata sandi minimal harus 8 karakter");
        jPanel4.add(Note1, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 254, -1, -1));

        TombolDaftar.setBackground(new java.awt.Color(0, 0, 153));
        TombolDaftar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolDaftar.setForeground(new java.awt.Color(255, 255, 255));
        TombolDaftar.setText("DAFTAR");
        TombolDaftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TombolDaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TombolDaftarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TombolDaftarMouseExited(evt);
            }
        });
        TombolDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolDaftarActionPerformed(evt);
            }
        });
        jPanel4.add(TombolDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 106, 84, -1));

        CBV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CBV.setText("Lihat Kata Sandi");
        CBV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CBV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBVActionPerformed(evt);
            }
        });
        jPanel4.add(CBV, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 227, -1, -1));

        TombolBersihkan.setBackground(new java.awt.Color(0, 0, 153));
        TombolBersihkan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolBersihkan.setForeground(new java.awt.Color(255, 255, 255));
        TombolBersihkan.setText("BERSIHKAN");
        TombolBersihkan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TombolBersihkan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TombolBersihkanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TombolBersihkanMouseExited(evt);
            }
        });
        TombolBersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolBersihkanActionPerformed(evt);
            }
        });
        jPanel4.add(TombolBersihkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 66, -1, -1));

        TombolBatal.setBackground(new java.awt.Color(0, 0, 153));
        TombolBatal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolBatal.setForeground(new java.awt.Color(255, 255, 255));
        TombolBatal.setText("BATAL");
        TombolBatal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TombolBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TombolBatalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TombolBatalMouseExited(evt);
            }
        });
        TombolBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolBatalActionPerformed(evt);
            }
        });
        jPanel4.add(TombolBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 146, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 362));

        Rwanita.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Rwanita.setText("Wanita");
        Rwanita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(Rwanita, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 107, -1, -1));

        Label6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label6.setText("Ulangi Sandi");
        jPanel4.add(Label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 282, -1, -1));
        jPanel4.add(Tusandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 282, 226, -1));

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
        jPanel4.add(LabelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 6, 29, 25));

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
        jPanel4.add(LabelMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 6, 25, 25));

        Note2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Note2.setForeground(new java.awt.Color(255, 255, 255));
        Note2.setText("Sudah memiliki akun ? klik");
        jPanel4.add(Note2, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 310, -1, -1));

        Disini.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Disini.setForeground(new java.awt.Color(255, 255, 255));
        Disini.setText("di sini");
        Disini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Disini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisiniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DisiniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DisiniMouseExited(evt);
            }
        });
        jPanel4.add(Disini, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 310, -1, -1));

        Label7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label7.setText(":");
        jPanel4.add(Label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 66, -1, -1));

        Label8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label8.setText(":");
        jPanel4.add(Label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 106, -1, -1));

        Label9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label9.setText(":");
        jPanel4.add(Label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 146, -1, -1));

        Label10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label10.setText(":");
        jPanel4.add(Label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 186, -1, -1));

        Label11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label11.setText(":");
        jPanel4.add(Label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 226, 5, -1));

        Label12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label12.setText(":");
        jPanel4.add(Label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 282, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void CBVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBVActionPerformed
        if (CBV.isSelected()) {
            Tsandi.setEchoChar((char)0);
            Tusandi.setEchoChar((char)0);
        }
        else{
            Tsandi.setEchoChar('*');
            Tusandi.setEchoChar('*');
        }
    }//GEN-LAST:event_CBVActionPerformed

    private void TombolBersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolBersihkanActionPerformed
        ButtonGroup bg = new ButtonGroup();
        bg.add(Rpria);
        bg.add(Rwanita);
        bg.clearSelection();
        
        Tnama.setText("");
        Talamat.setText("");
        Ttelepon.setText("");
        Tsandi.setText("");
        Tusandi.setText("");
    }//GEN-LAST:event_TombolBersihkanActionPerformed

    private void TombolDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolDaftarActionPerformed
        String gender = null;
        if(Rwanita.isSelected()){
            gender = "Wanita";
        } else if (Rpria.isSelected()) {
            gender = "Pria";
        }
        if (DaftarAkun.Register(Tnama.getText(), Talamat.getText(), Ttelepon.getText(), Tsandi.getText(), Tusandi.getText(), gender)){
            BTampilanGabung tampilan = new BTampilanGabung();
            tampilan.setVisible(true);
            tampilan.setLocationRelativeTo(null);
            close();
        }

    }//GEN-LAST:event_TombolDaftarActionPerformed

    public void close(){
        this.dispose();
    }


    private void TteleponKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TteleponKeyTyped
        if(Character.isLetter(evt.getKeyChar())){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Harus dalam format angka","Perhatian",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_TteleponKeyTyped

    private void TombolDaftarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolDaftarMouseEntered
        TombolDaftar.setBackground(new Color(255,255,51));
        TombolDaftar.setForeground(Color.black);
    }//GEN-LAST:event_TombolDaftarMouseEntered

    private void TombolDaftarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolDaftarMouseExited
        TombolDaftar.setBackground(new Color(0,0,153));
        TombolDaftar.setForeground(Color.white);
    }//GEN-LAST:event_TombolDaftarMouseExited

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

    private void TombolBersihkanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolBersihkanMouseEntered
        TombolBersihkan.setBackground(new Color(255,255,51));
	TombolBersihkan.setForeground(Color.black);
    }//GEN-LAST:event_TombolBersihkanMouseEntered

    private void TombolBersihkanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolBersihkanMouseExited
        TombolBersihkan.setBackground(new Color(0,0,153));
        TombolBersihkan.setForeground(Color.white);
    }//GEN-LAST:event_TombolBersihkanMouseExited

    private void TombolBatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolBatalMouseExited
        TombolBatal.setBackground(new Color(0,0,153));
        TombolBatal.setForeground(Color.white);
    }//GEN-LAST:event_TombolBatalMouseExited

    private void TombolBatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolBatalMouseEntered
        TombolBatal.setBackground(new Color(255,255,51));
	TombolBatal.setForeground(Color.black);
    }//GEN-LAST:event_TombolBatalMouseEntered

    private void LabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelMinimizeMouseClicked
        this.setState(ATampilanDaftarAkun.ICONIFIED);
    }//GEN-LAST:event_LabelMinimizeMouseClicked

    private void LabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_LabelExitMouseClicked

    private void DisiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisiniMouseClicked
        BTampilanGabung tg = new BTampilanGabung();
        tg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DisiniMouseClicked

    private void DisiniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisiniMouseEntered
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0,Color.YELLOW);
        Disini.setBorder(label_border);
        Disini.setForeground(Color.YELLOW);
    }//GEN-LAST:event_DisiniMouseEntered

    private void DisiniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisiniMouseExited
        Border label_regist = BorderFactory.createMatteBorder(0, 0, 1, 0,Color.WHITE);
        Disini.setBorder(label_regist);
        Disini.setForeground(Color.WHITE);
    }//GEN-LAST:event_DisiniMouseExited

    private void TombolBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolBatalActionPerformed
        int opsi = JOptionPane.showConfirmDialog(null, "Apa kamu yakin ?", "Perhatian",JOptionPane.ERROR_MESSAGE);
        if(opsi == JOptionPane.YES_OPTION){
            BTampilanGabung tg = new BTampilanGabung();
            tg.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_TombolBatalActionPerformed

    private void LabelJudulMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelJudulMouseEntered
        LabelJudul.setForeground(Color.YELLOW);
    }//GEN-LAST:event_LabelJudulMouseEntered

    private void LabelJudulMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelJudulMouseExited
        LabelJudul.setForeground(new Color(0,0,153));
    }//GEN-LAST:event_LabelJudulMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    DaftarAkun DaftarAkun = new DaftarAkun();
    private javax.swing.JCheckBox CBV;
    private javax.swing.JLabel Disini;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label10;
    private javax.swing.JLabel Label11;
    private javax.swing.JLabel Label12;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JLabel Label8;
    private javax.swing.JLabel Label9;
    private javax.swing.JLabel LabelExit;
    private javax.swing.JLabel LabelJudul;
    private javax.swing.JLabel LabelMinimize;
    private javax.swing.JLabel Note1;
    private javax.swing.JLabel Note2;
    private javax.swing.JRadioButton Rpria;
    private javax.swing.JRadioButton Rwanita;
    private javax.swing.JTextField Talamat;
    private javax.swing.JTextField Tnama;
    private javax.swing.JButton TombolBatal;
    private javax.swing.JButton TombolBersihkan;
    private javax.swing.JButton TombolDaftar;
    private javax.swing.JPasswordField Tsandi;
    private javax.swing.JTextField Ttelepon;
    private javax.swing.JPasswordField Tusandi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}