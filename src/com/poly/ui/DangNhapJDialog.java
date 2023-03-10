/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.poly.ui;

import com.poly.dao.DocGiaDAO;
import com.poly.dao.NhanVienDAO;
import com.poly.model.DocGia;
import com.poly.model.NhanVien;
import com.poly.utils.XDialog;
import com.poly.utils.XShare;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author CuongNX
 */
public class DangNhapJDialog extends javax.swing.JDialog {

    NhanVienDAO dao = new NhanVienDAO();
    DocGiaDAO daoDG = new DocGiaDAO();

    /**
     * Creates new form DangNhapJDialog
     */
    public DangNhapJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    public DangNhapJDialog(java.awt.Frame parent, boolean modal, String TenDangNhap, String pass) {
        super(parent, modal);
        initComponents();
        init();
        txtUsername.setText(TenDangNhap);
        txtPassword.setText(pass);
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
        pnlTrangChu = new javax.swing.JPanel();
        pnlImage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        lblShowPass = new javax.swing.JLabel();
        lblHidenPass = new javax.swing.JLabel();
        btnQR = new javax.swing.JButton();
        lblClose = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnSignIn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlTrangChu.setBackground(new java.awt.Color(205, 240, 234));
        pnlTrangChu.setPreferredSize(new java.awt.Dimension(958, 519));
        pnlTrangChu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlImage.setBackground(new java.awt.Color(246, 198, 234));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icons/thuvien2.jpg"))); // NOI18N

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblName.setForeground(new java.awt.Color(61, 60, 66));
        lblName.setText("Library Manage");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icons/3.png"))); // NOI18N

        javax.swing.GroupLayout pnlImageLayout = new javax.swing.GroupLayout(pnlImage);
        pnlImage.setLayout(pnlImageLayout);
        pnlImageLayout.setHorizontalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlImageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblName)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlImageLayout.setVerticalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImageLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTrangChu.add(pnlImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 471));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icons/hinh4-removebg-preview.png"))); // NOI18N
        pnlTrangChu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 16, 247, 125));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(61, 60, 66));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sign In");
        pnlTrangChu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 147, 247, 49));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Username:");
        pnlTrangChu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 212, 80, 39));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password:");
        pnlTrangChu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 279, 80, 39));

        txtUsername.setBackground(new java.awt.Color(205, 240, 234));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setBorder(null);
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });
        pnlTrangChu.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 214, 390, 39));
        pnlTrangChu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 255, 390, -1));
        pnlTrangChu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 308, 390, 10));

        jPanel4.setBackground(new java.awt.Color(205, 240, 234));
        jPanel4.setLayout(new java.awt.CardLayout());

        lblShowPass.setBackground(new java.awt.Color(223, 238, 234));
        lblShowPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icons/view.png"))); // NOI18N
        lblShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblShowPassMousePressed(evt);
            }
        });
        jPanel4.add(lblShowPass, "card3");

        lblHidenPass.setBackground(new java.awt.Color(223, 238, 234));
        lblHidenPass.setForeground(new java.awt.Color(223, 238, 234));
        lblHidenPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHidenPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icons/hidden.png"))); // NOI18N
        lblHidenPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHidenPassMousePressed(evt);
            }
        });
        jPanel4.add(lblHidenPass, "card2");

        pnlTrangChu.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 268, 30, 40));

        btnQR.setBackground(new java.awt.Color(254, 251, 246));
        btnQR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnQR.setText("QR");
        btnQR.setBorder(null);
        btnQR.setFocusable(false);
        btnQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQRActionPerformed(evt);
            }
        });
        pnlTrangChu.add(btnQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 135, 36));

        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icons/cancel.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        pnlTrangChu.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 0, 55, 47));

        txtPassword.setBackground(new java.awt.Color(205, 240, 234));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        pnlTrangChu.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 360, 39));

        btnSignIn1.setBackground(new java.awt.Color(254, 251, 246));
        btnSignIn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSignIn1.setText("Sign In");
        btnSignIn1.setBorder(null);
        btnSignIn1.setFocusable(false);
        btnSignIn1.setPreferredSize(new java.awt.Dimension(75, 25));
        btnSignIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignIn1ActionPerformed(evt);
            }
        });
        pnlTrangChu.add(btnSignIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 135, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblShowPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowPassMousePressed
        statusPass(true);
    }//GEN-LAST:event_lblShowPassMousePressed

    private void lblHidenPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHidenPassMousePressed
        statusPass(false);
    }//GEN-LAST:event_lblHidenPassMousePressed

    private void btnQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQRActionPerformed
        this.dispose();
        new ScanQRJFrame().setVisible(true);
    }//GEN-LAST:event_btnQRActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        exit();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if (!txtUsername.getText().equals("")) {
            login();
        }


    }//GEN-LAST:event_formWindowOpened

    private void btnSignIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignIn1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnSignIn1ActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhapJDialog dialog = new DangNhapJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQR;
    private javax.swing.JButton btnSignIn1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblHidenPass;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblShowPass;
    private javax.swing.JPanel pnlImage;
    private javax.swing.JPanel pnlTrangChu;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    /**
     * Set Location form to center screen
     */
    private void init() {
        setIconImage(XShare.APP_ICON);
        setLocationRelativeTo(null);
    }

    /**
     * Kiem tra cac thong tin trong form co hop le hay khong
     *
     * @return hop le hay khong
     */
    private boolean isValidate() {
        if (txtUsername.getText().equals("")) {
            txtUsername.requestFocus();
            return false;
        }
        if (txtPassword.getText().equals("")) {
            txtPassword.requestFocus();
            return false;
        }
        return true;
    }

    /**
     * Dang nhap vao trang chu Lay thong tin NhanVien trong DB tu username tren
     * form So khop password tren form voi password NhanVien vua duoc lay
     *
     * @see Thong bao dang nhap
     */
    private void login() {
        if (!isValidate()) {
            return;
        }

        String user = txtUsername.getText();
        String pass = txtPassword.getText();

        try {
//            if (rdoEmployee.isSelected() == true) {
            NhanVien dn = dao.selectById(user);
            DocGia dg = daoDG.selectById(user);
            if (dn != null) {
                if (pass.equals(dn.getPassword())) {
                    XShare.USER = dn;
                    XDialog.alert(this, "Login successful");
                    this.dispose();
                    new TrangChuJFrame().setVisible(true);
                    
                } else {
                    XDialog.alert(this, "Wrong password");
                }

            } else if (dg != null) {
                if (pass.equals(dg.getMatKhau())) {
                    XShare.DG = dg;
                    XDialog.alert(this, "Login Successful");
                    this.dispose();
                    new DocSachUI().setVisible(true);

                } else {
                    XDialog.alert(this, "Wrong password");
                }

            } else {
                XDialog.alert(this, "Wrong username");
            }

        } catch (Exception e) {
            XDialog.alert(this, "Error");
            e.printStackTrace();
        }
    }

    /**
     * Thoat khoi chuong trinh
     */
    private void exit() {
        if (XDialog.confirm(this, "Do you want to logout")) {
            System.exit(0);
        }
    }

    private void statusPass(boolean st) {
        lblShowPass.setVisible(!st);
        lblHidenPass.setVisible(st);
        if (st) {
            txtPassword.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('*');
        }
    }
}
