/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.poly.ui;

import com.poly.utils.XDialog;
import com.poly.utils.XShare;

/**
 *
 * @author CuongNX
 */
public class DocSachUI extends javax.swing.JFrame {

    /**
     * Creates new form DocSachUI
     */
    public DocSachUI() {
        initComponents();
        setLocationRelativeTo(null);
        simpleTitleBar1.init(this);

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
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        pnlSach = new javax.swing.JPanel();
        lblBooks = new javax.swing.JLabel();
        pnlThongTin = new javax.swing.JPanel();
        lblThongTin = new javax.swing.JLabel();
        pnlLogout = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        deskop = new javax.swing.JDesktopPane();
        simpleTitleBar1 = new javaswingdev.SimpleTitleBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(205, 240, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 198, 234));

        pnlSach.setBackground(new java.awt.Color(246, 198, 234));
        pnlSach.setLayout(new java.awt.BorderLayout());

        lblBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icons/icons8_books_36px.png"))); // NOI18N
        lblBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBooksMouseClicked(evt);
            }
        });
        pnlSach.add(lblBooks, java.awt.BorderLayout.CENTER);

        pnlThongTin.setBackground(new java.awt.Color(246, 198, 234));
        pnlThongTin.setLayout(new java.awt.BorderLayout());

        lblThongTin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblThongTin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icons/icons8_manager_36px_1.png"))); // NOI18N
        lblThongTin.setText("Reader Information");
        lblThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongTinMouseClicked(evt);
            }
        });
        pnlThongTin.add(lblThongTin, java.awt.BorderLayout.CENTER);

        pnlLogout.setBackground(new java.awt.Color(246, 198, 234));
        pnlLogout.setLayout(new java.awt.BorderLayout());

        lblLogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icons/icons8_Logout_36px_1.png"))); // NOI18N
        lblLogout.setText("Log Out");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        pnlLogout.add(lblLogout, java.awt.BorderLayout.CENTER);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlThongTin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(pnlSach, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pnlSach, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 431, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        deskop.setBackground(new java.awt.Color(205, 240, 234));

        javax.swing.GroupLayout deskopLayout = new javax.swing.GroupLayout(deskop);
        deskop.setLayout(deskopLayout);
        deskopLayout.setHorizontalGroup(
            deskopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );
        deskopLayout.setVerticalGroup(
            deskopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(deskop);

        jPanel1.add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 950, -1));
        jPanel1.add(simpleTitleBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        logoff();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongTinMouseClicked
        // TODO add your handling code here:
        ThongTinDocGiaUI dg = new ThongTinDocGiaUI();
        deskop.removeAll();
        dg.setSize(1200, 1200);
        deskop.add(dg);
        deskop.revalidate();
        deskop.repaint();
    }//GEN-LAST:event_lblThongTinMouseClicked

    private void lblBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBooksMouseClicked
        // TODO add your handling code here:
        SachUI s = new SachUI();
        deskop.removeAll();
        s.setSize(1200, 1200);
        deskop.add(s);
        deskop.revalidate();
        deskop.repaint();
    }//GEN-LAST:event_lblBooksMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DocSachUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocSachUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocSachUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocSachUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocSachUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane deskop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblBooks;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblThongTin;
    private javax.swing.JPanel pnlLogout;
    private javax.swing.JPanel pnlSach;
    private javax.swing.JPanel pnlThongTin;
    private javaswingdev.SimpleTitleBar simpleTitleBar1;
    // End of variables declaration//GEN-END:variables

    /**
     * Mo form login Loi: Sau khi login thanh cong, se mo them 1 form polyPro ->
     * Bi thanh 2 form Khac phuc: Sau khi dang nhap thanh cong, quay tro lai
     * form cu hoac tat form cu va mo form moi Trang thai: Hoan thanh
     */
    private void openLogin() {
        if (XShare.authenticatedd()) {
            XDialog.alert(this, "You has login");
        } else {
            new DangNhapJDialog(this, true).setVisible(true);
            this.dispose();
        }
    }

    /**
     * Dang xuat khoi tai khoan -> mo form dang nhap
     */
    private void logoff() {
        if (XShare.authenticatedd()) {
            XShare.logof();
            this.openLogin();
        } else {
            XDialog.alert(this, "Please login");
        }

    }
}