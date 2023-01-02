/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.poly.ui;

import com.poly.dao.DocGiaDAO;
import com.poly.model.DocGia;
import com.poly.utils.XDate;
import com.poly.utils.XDialog;
import com.poly.utils.XJdbc;
import com.poly.utils.XShare;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CuongNX
 */
public class ThongTinDocGiaUI extends javax.swing.JPanel {

    /**
     * Creates new form ThongTinDocGiaUI
     */
    int index = 0;
    DocGiaDAO dao = new DocGiaDAO();

    public ThongTinDocGiaUI() {
        initComponents();
//        this.load();
        init();
        setStatus(true);
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
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtID = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        txtPass = new javax.swing.JPasswordField();
        txtNewPass = new javax.swing.JPasswordField();
        txtRePass = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        lblShowPass = new javax.swing.JLabel();
        lblHidenPass = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblShowPass1 = new javax.swing.JLabel();
        lblHidenPass1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblShowPass2 = new javax.swing.JLabel();
        lblHidenPass2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(205, 240, 234));
        jPanel1.setPreferredSize(new java.awt.Dimension(940, 623));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(205, 240, 234));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Reader ID:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Name:");

        txtName.setBackground(new java.awt.Color(205, 240, 234));
        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.setBorder(null);

        txtID.setBackground(new java.awt.Color(205, 240, 234));
        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID.setBorder(null);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jDateChooser.setBackground(new java.awt.Color(205, 240, 234));
        jDateChooser.setDate(new java.util.Date(1667551026000L));
        jDateChooser.setDateFormatString("dd-MM-yyyy");
        jDateChooser.setFocusable(false);
        jDateChooser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Date Of Birth:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Gender:");

        rdoMale.setBackground(new java.awt.Color(205, 240, 234));
        buttonGroup1.add(rdoMale);
        rdoMale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoMale.setText("Male");
        rdoMale.setFocusable(false);

        rdoFemale.setBackground(new java.awt.Color(205, 240, 234));
        buttonGroup1.add(rdoFemale);
        rdoFemale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoFemale.setSelected(true);
        rdoFemale.setText("Female");
        rdoFemale.setFocusable(false);

        txtAddress.setBackground(new java.awt.Color(205, 240, 234));
        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAddress.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Address:");

        txtEmail.setBackground(new java.awt.Color(205, 240, 234));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Email:");

        txtPhone.setBackground(new java.awt.Color(205, 240, 234));
        txtPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPhone.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Phone:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Password:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("New Password:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Re-en the password:");

        txtPass.setBackground(new java.awt.Color(205, 240, 234));
        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPass.setBorder(null);

        txtNewPass.setBackground(new java.awt.Color(205, 240, 234));
        txtNewPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNewPass.setBorder(null);
        txtNewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPassActionPerformed(evt);
            }
        });

        txtRePass.setBackground(new java.awt.Color(205, 240, 234));
        txtRePass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRePass.setBorder(null);

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

        lblHidenPass.setBackground(new java.awt.Color(205, 240, 234));
        lblHidenPass.setForeground(new java.awt.Color(205, 240, 234));
        lblHidenPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHidenPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icons/hidden.png"))); // NOI18N
        lblHidenPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHidenPassMousePressed(evt);
            }
        });
        jPanel4.add(lblHidenPass, "card2");

        jPanel6.setBackground(new java.awt.Color(205, 240, 234));
        jPanel6.setLayout(new java.awt.CardLayout());

        lblShowPass1.setBackground(new java.awt.Color(223, 238, 234));
        lblShowPass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icons/view.png"))); // NOI18N
        lblShowPass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblShowPass1MousePressed(evt);
            }
        });
        jPanel6.add(lblShowPass1, "card3");

        lblHidenPass1.setBackground(new java.awt.Color(205, 240, 234));
        lblHidenPass1.setForeground(new java.awt.Color(205, 240, 234));
        lblHidenPass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHidenPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icons/hidden.png"))); // NOI18N
        lblHidenPass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHidenPass1MousePressed(evt);
            }
        });
        jPanel6.add(lblHidenPass1, "card2");

        jPanel7.setBackground(new java.awt.Color(205, 240, 234));
        jPanel7.setLayout(new java.awt.CardLayout());

        lblShowPass2.setBackground(new java.awt.Color(223, 238, 234));
        lblShowPass2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowPass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icons/view.png"))); // NOI18N
        lblShowPass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblShowPass2MousePressed(evt);
            }
        });
        jPanel7.add(lblShowPass2, "card3");

        lblHidenPass2.setBackground(new java.awt.Color(205, 240, 234));
        lblHidenPass2.setForeground(new java.awt.Color(205, 240, 234));
        lblHidenPass2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHidenPass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icons/hidden.png"))); // NOI18N
        lblHidenPass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHidenPass2MousePressed(evt);
            }
        });
        jPanel7.add(lblHidenPass2, "card2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(txtID))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtName))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addComponent(jSeparator4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddress))))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator6))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(rdoMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)))
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator8)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtRePass, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoMale, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdoFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(txtNewPass, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addGap(1, 1, 1))))
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRePass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 490, 550));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icons/icons8_update_24px.png"))); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setFocusable(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 130, 39));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtNewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPassActionPerformed

    private void lblShowPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowPassMousePressed
        statusPass(true);
    }//GEN-LAST:event_lblShowPassMousePressed

    private void lblHidenPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHidenPassMousePressed
        statusPass(false);
    }//GEN-LAST:event_lblHidenPassMousePressed

    private void lblHidenPass1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHidenPass1MousePressed
        // TODO add your handling code here:
        statusPass(false);
    }//GEN-LAST:event_lblHidenPass1MousePressed

    private void lblShowPass1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowPass1MousePressed
        // TODO add your handling code here:
        statusPass(true);

    }//GEN-LAST:event_lblShowPass1MousePressed

    private void lblShowPass2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowPass2MousePressed
        // TODO add your handling code here:
        statusPass(true);

    }//GEN-LAST:event_lblShowPass2MousePressed

    private void lblHidenPass2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHidenPass2MousePressed
        // TODO add your handling code here:
        statusPass(false);

    }//GEN-LAST:event_lblHidenPass2MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblHidenPass;
    private javax.swing.JLabel lblHidenPass1;
    private javax.swing.JLabel lblHidenPass2;
    private javax.swing.JLabel lblShowPass;
    private javax.swing.JLabel lblShowPass1;
    private javax.swing.JLabel lblShowPass2;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JPasswordField txtRePass;
    // End of variables declaration//GEN-END:variables

    private void init() {
        txtID.setText(XShare.DG.getMaDG());
        txtName.setText(XShare.DG.getTenDG());
        jDateChooser.setDate(XShare.DG.getNgsinh());
        rdoMale.setSelected(XShare.DG.isGioitinh());
        rdoFemale.setSelected(!XShare.DG.isGioitinh());
        txtAddress.setText(XShare.DG.getDiachi());
        txtEmail.setText(XShare.DG.getEmail());
        txtPhone.setText(XShare.DG.getSDT());
        txtPass.setText(XShare.DG.getMatKhau());
    }

    private boolean isValidate() {
        if (txtNewPass.getText().equals("")) {
            XDialog.alert(this, "Your new password can't be empty");
            txtNewPass.requestFocus();
            return false;
        }
        if (!txtNewPass.getText().equals(txtRePass.getText())) {
            XDialog.alert(this, "Your re-enter pass wasn't correct");
            txtRePass.requestFocus();
            return false;
        }
        return true;
    }

    void update() {
//        DocGia model = getModel();
        if (!isValidate()) {
            return;
        }
        if (txtPass.getText().equals(XShare.DG.getMatKhau())) {
            try {
                String sql = "UPDATE DocGia SET MatKhau=? WHERE MaDocGia=?";
                XJdbc.executeUpdate(sql,
                        txtNewPass.getText(),
                        txtID.getText()
                );

                XDialog.alert(this, "Update password successful!");
            } catch (Exception e) {
                XDialog.alert(this, "Update password fail!");
            }
        } else {
            XDialog.alert(this, "Your password wasn't correct");
        }
    }

    /**
     *
     * @param insertable la gia tri
     */
    private void statusPass(boolean st) {
        lblShowPass.setVisible(!st);
        lblHidenPass.setVisible(st);
        lblShowPass1.setVisible(!st);
        lblHidenPass1.setVisible(st);
        lblShowPass2.setVisible(!st);
        lblHidenPass2.setVisible(st);
        if (st) {
            txtPass.setEchoChar((char) 0);
            txtNewPass.setEchoChar((char) 0);
            txtRePass.setEchoChar((char) 0);
        } else {
            txtPass.setEchoChar('*');
            txtNewPass.setEchoChar('*');
            txtRePass.setEchoChar('*');
        }
    }
    /**
     *
     * @param insertable la gia tri
     */
    private void setStatus(boolean insertable) {
        txtID.setEditable(!insertable);
        txtName.setEditable(!insertable);
        txtAddress.setEditable(!insertable);
        txtEmail.setEditable(!insertable);
        txtPhone.setEditable(!insertable);
        txtPass.setEditable(!insertable);
    }
}