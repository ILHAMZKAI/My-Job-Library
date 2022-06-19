package MJL.tampilan;

import MJL.data.Perusahaan;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class GTampilanInformasi extends javax.swing.JFrame {

    public GTampilanInformasi() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        Border label_border = BorderFactory.createMatteBorder(1, 3, 1, 3,new Color(0,0,153));
        LabelMinimize.setBorder(label_border);
        LabelExit.setBorder(label_border);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon img = new ImageIcon("src/main/java/MJL/gambar/Gambar7.jpg");
                Image i = img.getImage();
                g.drawImage(i, 0, 0, this);
            }
        }
        ;
        Panel3 = new javax.swing.JPanel();
        LabelJudul = new javax.swing.JLabel();
        LabelMinimize = new javax.swing.JLabel();
        LabelExit = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelInformasi = new javax.swing.JTable();
        TombolKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(616, 274));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel3.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(Panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 361));

        LabelJudul.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        LabelJudul.setForeground(new java.awt.Color(0, 0, 153));
        LabelJudul.setText("INFORMASI LOWONGAN KERJA");
        LabelJudul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelJudulMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelJudulMouseExited(evt);
            }
        });
        jPanel2.add(LabelJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 29));

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
        jPanel2.add(LabelMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 5, 27, 25));

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
        jPanel2.add(LabelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 5, 28, 25));

        TabelInformasi.setModel(new javax.swing.table.DefaultTableModel(
            perusahaan.get_data_perusahaan(),
            new String [] {"Id", "Nama", "Status", "Informasi"}) {
            boolean[] canEdit = new boolean [] {false, false, false, false};
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        }
        );
        TabelInformasi.getTableHeader().setResizingAllowed(false);
        TabelInformasi.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TabelInformasi);
        if (TabelInformasi.getColumnModel().getColumnCount() > 0) {
            TabelInformasi.getColumnModel().getColumn(0).setMinWidth(50);
            TabelInformasi.getColumnModel().getColumn(0).setPreferredWidth(50);
            TabelInformasi.getColumnModel().getColumn(0).setMaxWidth(50);
            TabelInformasi.getColumnModel().getColumn(2).setMinWidth(150);
            TabelInformasi.getColumnModel().getColumn(2).setPreferredWidth(150);
            TabelInformasi.getColumnModel().getColumn(2).setMaxWidth(150);
            TabelInformasi.getColumnModel().getColumn(3).setMinWidth(100);
            TabelInformasi.getColumnModel().getColumn(3).setPreferredWidth(100);
            TabelInformasi.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 61, 533, 264));

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
        jPanel2.add(TombolKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelMinimizeMouseClicked
        this.setState(GTampilanInformasi.ICONIFIED);
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

    private void TombolKembaliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolKembaliMouseEntered
        // TODO add your handling code here:
        TombolKembali.setBackground(Color.yellow);
        TombolKembali.setForeground(Color.black);
    }//GEN-LAST:event_TombolKembaliMouseEntered

    private void TombolKembaliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolKembaliMouseExited
        // TODO add your handling code here:
        TombolKembali.setBackground(new Color(0,0,153));
        TombolKembali.setForeground(Color.white);
    }//GEN-LAST:event_TombolKembaliMouseExited

    private void TombolKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolKembaliActionPerformed
        FTampilanMenu tm = new FTampilanMenu();
        tm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TombolKembaliActionPerformed

    private void LabelJudulMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelJudulMouseEntered
        LabelJudul.setForeground(Color.YELLOW);
    }//GEN-LAST:event_LabelJudulMouseEntered

    private void LabelJudulMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelJudulMouseExited
        LabelJudul.setForeground(new Color(0,0,153));
    }//GEN-LAST:event_LabelJudulMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    Perusahaan perusahaan = new Perusahaan();
    private javax.swing.JLabel LabelExit;
    private javax.swing.JLabel LabelJudul;
    private javax.swing.JLabel LabelMinimize;
    private javax.swing.JPanel Panel3;
    private javax.swing.JTable TabelInformasi;
    private javax.swing.JButton TombolKembali;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
