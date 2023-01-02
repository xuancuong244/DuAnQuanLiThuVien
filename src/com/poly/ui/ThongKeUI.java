/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.poly.ui;

import com.poly.dao.DocGiaDAO;
import com.poly.dao.PhieuMuonDAO;
import com.poly.dao.QuanLiSachDAO;
import com.poly.dao.TheLoaiDAO;
import com.poly.dao.ThongKeDAO;
import com.poly.model.DocGia;
import com.poly.model.PhieuMuon;
import com.poly.model.QuanLiSach;
import com.poly.model.TheLoai;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CuongNX
 */
public class ThongKeUI extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeUI
     */
    ThongKeDAO tkdao = new ThongKeDAO();
    TheLoaiDAO tlsdao = new TheLoaiDAO();
    DocGiaDAO svdao = new DocGiaDAO();
    QuanLiSachDAO sdao = new QuanLiSachDAO();
    PhieuMuonDAO pmdao = new PhieuMuonDAO();
    List<TheLoai> listtls;
    List<DocGia> listsv;
    List<QuanLiSach> lists;
    List<PhieuMuon> listpm;
    String key;
    boolean gt;

    public ThongKeUI() {
        initComponents();
        loadTableTLS();
        loadTableDG();
        loadTableSach();
        loadTablePM();
        init();
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
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlReader = new javax.swing.JPanel();
        lblsoGioiTinhDG = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblReader = new javax.swing.JTable();
        pnlBook = new javax.swing.JPanel();
        lblTongSachS = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBook = new javax.swing.JTable();
        pnlCategory = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTLS = new javax.swing.JTable();
        lblsoSachTLS = new javax.swing.JLabel();
        lblsoTheLoaiTLS = new javax.swing.JLabel();
        pnlLoanVoucher = new javax.swing.JPanel();
        lblTongPM = new javax.swing.JLabel();
        lblTongDGPM = new javax.swing.JLabel();
        lblTongSachPM = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPM = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(205, 240, 234));
        jPanel1.setPreferredSize(new java.awt.Dimension(940, 623));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STATISTICS REPORT");

        jTabbedPane1.setBackground(new java.awt.Color(246, 198, 234));
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1154, 700));

        pnlReader.setBackground(new java.awt.Color(205, 240, 234));

        lblsoGioiTinhDG.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblsoGioiTinhDG.setText("Total number of readers:");

        tblReader.setBackground(new java.awt.Color(205, 240, 234));
        tblReader.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblReader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reader ID", "Name", "Date of Birth", "Gender", "Address", "Email", "Phone", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReader.setFocusable(false);
        tblReader.setRowHeight(30);
        tblReader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReaderMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblReader);

        javax.swing.GroupLayout pnlReaderLayout = new javax.swing.GroupLayout(pnlReader);
        pnlReader.setLayout(pnlReaderLayout);
        pnlReaderLayout.setHorizontalGroup(
            pnlReaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReaderLayout.createSequentialGroup()
                .addGroup(pnlReaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReaderLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblsoGioiTinhDG)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlReaderLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlReaderLayout.setVerticalGroup(
            pnlReaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReaderLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsoGioiTinhDG, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Readers", pnlReader);

        pnlBook.setBackground(new java.awt.Color(205, 240, 234));

        lblTongSachS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTongSachS.setForeground(new java.awt.Color(240, 240, 240));

        tblBook.setBackground(new java.awt.Color(205, 240, 234));
        tblBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Name", "Category ID", "Author", "Publisher", "Date Added", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBook.setFocusable(false);
        tblBook.setRowHeight(30);
        tblBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBook);

        javax.swing.GroupLayout pnlBookLayout = new javax.swing.GroupLayout(pnlBook);
        pnlBook.setLayout(pnlBookLayout);
        pnlBookLayout.setHorizontalGroup(
            pnlBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(lblTongSachS, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBookLayout.setVerticalGroup(
            pnlBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTongSachS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(469, 469, 469))
            .addGroup(pnlBookLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Books", pnlBook);

        pnlCategory.setBackground(new java.awt.Color(205, 240, 234));

        tblTLS.setBackground(new java.awt.Color(205, 240, 234));
        tblTLS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblTLS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Category ID", "Category Name", "Location", "Book ID", "Book Name", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTLS.setFocusable(false);
        tblTLS.setRowHeight(30);
        jScrollPane3.setViewportView(tblTLS);

        lblsoSachTLS.setBackground(new java.awt.Color(204, 204, 204));
        lblsoSachTLS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblsoTheLoaiTLS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnlCategoryLayout = new javax.swing.GroupLayout(pnlCategory);
        pnlCategory.setLayout(pnlCategoryLayout);
        pnlCategoryLayout.setHorizontalGroup(
            pnlCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlCategoryLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblsoSachTLS, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(lblsoTheLoaiTLS, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCategoryLayout.setVerticalGroup(
            pnlCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsoSachTLS, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsoTheLoaiTLS, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Category Books", pnlCategory);

        pnlLoanVoucher.setBackground(new java.awt.Color(205, 240, 234));
        pnlLoanVoucher.setFocusable(false);

        lblTongPM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTongPM.setText("Total loan votes:");

        lblTongDGPM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTongDGPM.setText("Total Readers:");

        lblTongSachPM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTongSachPM.setText("Total Books:");

        jPanel10.setBackground(new java.awt.Color(205, 240, 234));
        jPanel10.setPreferredSize(new java.awt.Dimension(550, 100));
        jPanel10.setLayout(new java.awt.CardLayout());

        jPanel11.setBackground(new java.awt.Color(205, 240, 234));

        tblPM.setBackground(new java.awt.Color(205, 240, 234));
        tblPM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblPM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Loan Voucher ID", "Readers ID", "Reader Name", "Book Name", "Amout", "Borrow Date", "Pay Date"
            }
        ));
        tblPM.setFocusable(false);
        tblPM.setRowHeight(30);
        jScrollPane5.setViewportView(tblPM);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.add(jPanel11, "card2");

        javax.swing.GroupLayout pnlLoanVoucherLayout = new javax.swing.GroupLayout(pnlLoanVoucher);
        pnlLoanVoucher.setLayout(pnlLoanVoucherLayout);
        pnlLoanVoucherLayout.setHorizontalGroup(
            pnlLoanVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoanVoucherLayout.createSequentialGroup()
                .addGroup(pnlLoanVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTongPM)
                    .addComponent(lblTongSachPM))
                .addGap(191, 191, 191)
                .addComponent(lblTongDGPM)
                .addContainerGap(647, Short.MAX_VALUE))
            .addGroup(pnlLoanVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoanVoucherLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlLoanVoucherLayout.setVerticalGroup(
            pnlLoanVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoanVoucherLayout.createSequentialGroup()
                .addContainerGap(487, Short.MAX_VALUE)
                .addGroup(pnlLoanVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoanVoucherLayout.createSequentialGroup()
                        .addComponent(lblTongSachPM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTongPM, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTongDGPM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(pnlLoanVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLoanVoucherLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(127, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Loan Vouchers", pnlLoanVoucher);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookMouseClicked

    }//GEN-LAST:event_tblBookMouseClicked

    private void tblReaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReaderMouseClicked

    }//GEN-LAST:event_tblReaderMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTongDGPM;
    private javax.swing.JLabel lblTongPM;
    private javax.swing.JLabel lblTongSachPM;
    private javax.swing.JLabel lblTongSachS;
    private javax.swing.JLabel lblsoGioiTinhDG;
    private javax.swing.JLabel lblsoSachTLS;
    private javax.swing.JLabel lblsoTheLoaiTLS;
    private javax.swing.JPanel pnlBook;
    private javax.swing.JPanel pnlCategory;
    private javax.swing.JPanel pnlLoanVoucher;
    private javax.swing.JPanel pnlReader;
    private javax.swing.JTable tblBook;
    private javax.swing.JTable tblPM;
    private javax.swing.JTable tblReader;
    private javax.swing.JTable tblTLS;
    // End of variables declaration//GEN-END:variables

    private void init() {
        tblBook.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tblBook.setDefaultEditor(Object.class, null);

        tblPM.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tblPM.setDefaultEditor(Object.class, null);

        tblReader.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tblReader.setDefaultEditor(Object.class, null);

        tblTLS.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tblTLS.setDefaultEditor(Object.class, null);
    }

    

    public void loadTableTLS() {
        DefaultTableModel model = (DefaultTableModel) tblTLS.getModel();
        model.setRowCount(0);
        List<Object[]> list = tkdao.TKTheLoaiSach();
        for (Object[] row : list) {
            model.addRow(row);
        }
        TongTheLoaiTLS();
    }

    public void loadTableMaTLS() {
        DefaultTableModel model = (DefaultTableModel) tblTLS.getModel();
        model.setRowCount(0);
        List<Object[]> list = tkdao.TKMaTheLoaiSach(key);
        for (Object[] row : list) {
            model.addRow(row);
        }
    }

    public void loadTableViTriTLS() {
        DefaultTableModel model = (DefaultTableModel) tblTLS.getModel();
        model.setRowCount(0);
        List<Object[]> list = tkdao.TKViTriTheLoaiSach(key);
        for (Object[] row : list) {
            model.addRow(row);
        }
    }

    public void loadTableGioiTinhDG() {
        DefaultTableModel model = (DefaultTableModel) tblReader.getModel();
        model.setRowCount(0);
        listsv = tkdao.TKGioiTinhDG(gt);
        for (DocGia dg : listsv) {
            Object[] row = new Object[8];
            row[0] = dg.getMaDG();
            row[1] = dg.getTenDG();
            row[2] = dg.getNgsinh();
            if (dg.isGioitinh() == true) {
                row[3] = "Nam";
            } else {
                row[3] = "Nữ";
            }
            row[4] = dg.getDiachi();
            row[5] = dg.getEmail();
            row[6] = dg.getSDT();
            row[7] = dg.getMatKhau();

            model.addRow(row);
        }
    }

    public void loadTableDG() {
        DefaultTableModel model = (DefaultTableModel) tblReader.getModel();
        model.setRowCount(0);
        listsv = svdao.select();
        for (DocGia dg : listsv) {
            Object[] row = new Object[8];
            row[0] = dg.getMaDG();
            row[1] = dg.getTenDG();
            row[2] = dg.getNgsinh();
            if (dg.isGioitinh() == true) {
                row[3] = "Nam";
            } else {
                row[3] = "Nữ";
            }
            row[4] = dg.getDiachi();
            row[5] = dg.getEmail();
            row[6] = dg.getSDT();
            row[7] = dg.getMatKhau();

            model.addRow(row);
        }
        TongSV();
    }

    public void loadTableDGChuaMuonSach() {
        DefaultTableModel model = (DefaultTableModel) tblReader.getModel();
        model.setRowCount(0);
        listsv = tkdao.TKDGChuaMuonSach();
        for (DocGia dg : listsv) {
            Object[] row = new Object[8];
            row[0] = dg.getMaDG();
            row[1] = dg.getTenDG();
            row[2] = dg.getNgsinh();
            if (dg.isGioitinh() == true) {
                row[3] = "Nam";
            } else {
                row[3] = "Nữ";
            }
            row[4] = dg.getDiachi();
            row[5] = dg.getEmail();
            row[6] = dg.getSDT();
            row[7] = dg.getMatKhau();

            model.addRow(row);
        }
        TongDGChuaMuonSach();
    }

    public void loadTableDGDaMuonSach() {
        DefaultTableModel model = (DefaultTableModel) tblReader.getModel();
        model.setRowCount(0);
        listsv = tkdao.TKDGDaMuonSach();
        for (DocGia dg : listsv) {
            Object[] row = new Object[8];
            row[0] = dg.getMaDG();
            row[1] = dg.getTenDG();
            row[2] = dg.getNgsinh();
            if (dg.isGioitinh() == true) {
                row[3] = "Nam";
            } else {
                row[3] = "Nữ";
            }
            row[4] = dg.getDiachi();
            row[5] = dg.getEmail();
            row[6] = dg.getSDT();
            row[7] = dg.getMatKhau();

            model.addRow(row);
        }
        TongDGDaMuonSach();
    }

    public void loadTableSach() {
        QuanLiSachDAO sdao = new QuanLiSachDAO();
        lists = sdao.select();
        DefaultTableModel model = (DefaultTableModel) tblBook.getModel();
        model.setRowCount(0);
        for (QuanLiSach s : lists) {
            Object[] row = new Object[]{
                s.getMaSach(), s.getTenSach(), s.getLoai(), s.getTacGia(),  s.getNXB(), s.getNgayNhap(), s.getSoLuong(), s.getNoiDung(), s.getHinh()
            };
            model.addRow(row);
        }
        TongSach();
    }

//    public void loadTableSachGiam() {
//        
//        DefaultTableModel model = (DefaultTableModel) tblBook.getModel();
//        model.setRowCount(0);
//        List<Object[]> list = tkdao.TKNgaySachGiam();
//        for (Object[] row : list) {
//            model.addRow(row);
//        }
//        SoSachNgaySach();
//    }
//
//    public void loadTableSachTang() {
//        Date date = jDateChooser1.getDate();
//        String df = new SimpleDateFormat("yyyy-MM-dd").format(date);
//        Date date1 = jDateChooser2.getDate();
//        String dff = new SimpleDateFormat("yyyy-MM-dd").format(date1);
//        DefaultTableModel model = (DefaultTableModel) tblBook.getModel();
//        model.setRowCount(0);
//        List<Object[]> list = tkdao.TKNgaySachTang(df, dff);
//        for (Object[] row : list) {
//            model.addRow(row);
//        }
//        SoSachNgaySach();
//    }

    public void loadTablePM() {
        DefaultTableModel model = (DefaultTableModel) tblPM.getModel();
        model.setRowCount(0);
        List<Object[]> list = tkdao.TKPM();
        for (Object[] row : list) {
            model.addRow(row);
        }
        TongDGPM();
        TongSachPM();
        TongPM();
    }

    public void loadTableMaDGPM() {
        DefaultTableModel model = (DefaultTableModel) tblPM.getModel();
        model.setRowCount(0);
        List<Object[]> list = tkdao.TKMaDGPM(key);
        for (Object[] row : list) {
            model.addRow(row);
        }
    }

    public void loadTableMaSachPM() {
        DefaultTableModel model = (DefaultTableModel) tblPM.getModel();
        model.setRowCount(0);
        List<Object[]> list = tkdao.TKMaSachPM(key);
        for (Object[] row : list) {
            model.addRow(row);
        }
    }

//    public void loadTableSVMuonNhieuSachNhatPM() {
//        DefaultTableModel model = (DefaultTableModel) tblPM1.getModel();
//        model.setRowCount(0);
//        List<Object[]> list = tkdao.TKDGMuonNhieuSachNhatPM();
//        for (Object[] row : list) {
//            model.addRow(row);
//        }
//        TongDGPM();
//        TongSachPM();
//    }
//
//    public void loadTableSVMuonItSachNhatPM() {
//        DefaultTableModel model = (DefaultTableModel) tblPM1.getModel();
//        model.setRowCount(0);
//        List<Object[]> list = tkdao.TKDGMuonItSachNhatPM();
//        for (Object[] row : list) {
//            model.addRow(row);
//        }
//        TongDGPM();
//        TongSachPM();
//    }

//    public void loadTableSachMuonNhieuNhatPM() {
//        DefaultTableModel model = (DefaultTableModel) tblPM2.getModel();
//        model.setRowCount(0);
//        List<Object[]> list = tkdao.TKSachMuonNhieuNhatPM();
//        for (Object[] row : list) {
//            model.addRow(row);
//        }
//        TongDGPM();
//        TongSachPM();
//    }
//
//    public void loadTableSachMuonItNhatPM() {
//        DefaultTableModel model = (DefaultTableModel) tblPM2.getModel();
//        model.setRowCount(0);
//        List<Object[]> list = tkdao.TKSachMuonItNhatPM();
//        for (Object[] row : list) {
//            model.addRow(row);
//        }
//        TongDGPM();
//        TongSachPM();
//    }

    public void loadTableSVConHanTraSachPM() {
        DefaultTableModel model = (DefaultTableModel) tblPM.getModel();
        model.setRowCount(0);
        List<Object[]> list = tkdao.TKDGConHanTraSachPM();
        for (Object[] row : list) {
            model.addRow(row);
        }

    }

    public void loadTableSVQuaHanTraSachPM() {
        DefaultTableModel model = (DefaultTableModel) tblPM.getModel();
        model.setRowCount(0);
        List<Object[]> list = tkdao.TKDGQuaHanTraSachPM();
        for (Object[] row : list) {
            model.addRow(row);
        }

    }

//    public void SoSachTLS() {
//        int tongso = tkdao.TKsoSachTLS(key);
//        lblsoSachTLS.setText("Total Number of Books in Genre [ " + cboTenTLS.getSelectedItem().toString() + " ] là: " + String.valueOf(tongso));
//    }
//
//    public void SoSachViTriTLS() {
//        int tongso = tkdao.TKsoSachViTriTLS(key);
//        lblsoSachTLS.setText("Total Books in Location [ " + cboViTriTLS.getSelectedItem().toString() + " ] là: " + String.valueOf(tongso));
//    }
//
//    public void SoTheLoaiTLS() {
//        int tongso = tkdao.TKsoTheLoaiTLS(key);
//        lblsoTheLoaiTLS.setText("Total Book Codes in Genre [ " + cboTenTLS.getSelectedItem().toString() + " ] là: " + String.valueOf(tongso));
//    }
//
//    public void SoTheLoaiViTriTLS() {
//        int tongso = tkdao.TKsoTheLoaiViTriTLS(key);
//        lblsoTheLoaiTLS.setText("Overall Category in Location [ " + cboViTriTLS.getSelectedItem().toString() + " ] là: " + String.valueOf(tongso));
//    }

    public void TongTheLoaiTLS() {
        int tongso = tkdao.TKsoTheLoaiTLS();
        lblsoTheLoaiTLS.setText("");
        lblsoSachTLS.setText("Total Genre is: " + String.valueOf(tongso));
    }

//    public void SoGioiTinhDG() {
//        int tongso = tkdao.TKsoGioiTinhDG(gt);
//        lblsoGioiTinhDG.setText("Total Readers Gender [ " + cboGioiTinhDG.getSelectedItem().toString() + " ] là: " + String.valueOf(tongso));
//    }

    public void TongSV() {
        int tongso = tkdao.TKsoDG();
        lblsoGioiTinhDG.setText("Total Readers are : " + String.valueOf(tongso));
    }

//    public void SoSachNgaySach() {
//        Date date = jDateChooser1.getDate();
//        String df = new SimpleDateFormat("yyyy-MM-dd").format(date);
//        Date date1 = jDateChooser2.getDate();
//        String dff = new SimpleDateFormat("yyyy-MM-dd").format(date1);
//        int tongso = tkdao.TKsoSachNgaySach(df, dff);
//        lblTongSachS.setText("Total Book from date [ " + df + " ] to date [ " + dff + " ] to be: " + String.valueOf(tongso));
//    }

    public void TongSach() {
        int tongso = tkdao.TKsoSach();
        lblTongSachS.setText("Total Book is: " + String.valueOf(tongso));
    }

    public void TongDGPM() {
        int tongso = tkdao.TKsoDG();
        lblTongDGPM.setText("Total Readers Borrowing Books is: " + String.valueOf(tongso));
    }

    public void TongSachPM() {
        int tongso = tkdao.TKsoSachDGMuon();
        lblTongSachPM.setText("Total Borrowed Books is: " + String.valueOf(tongso));
    }

//    public void SoSachDGPM() {
//        int tongso = tkdao.TKsoSachDGPM(key);
//        lblTongDGPM.setText("Total Number of Readers' Books [ " + cboTenDGPM.getSelectedItem().toString() + " ] borrowed is: " + String.valueOf(tongso));
//    }
//
//    public void SoDGMuonSachPM() {
//        int tongso = tkdao.TKsoDGMuonSachPM(key);
//        lblTongDGPM.setText("General Readers Borrow Books [ " + cboSachPM.getSelectedItem().toString() + " ] to be: " + String.valueOf(tongso));
//    }

    public void TongPM() {
        int tongso = tkdao.TKTongPM();
        lblTongPM.setText("Total Loan Voucher is: " + String.valueOf(tongso));
    }

    public void TongDGChuaMuonSach() {
        int tongso = tkdao.TKTongDGChuaMuonSach();
        lblsoGioiTinhDG.setText("Total Readers who have not borrowed the Book are: " + String.valueOf(tongso));
    }

    public void TongDGDaMuonSach() {
        int tongso = tkdao.TKTongDGDaMuonSach();
        lblsoGioiTinhDG.setText("The Total Readers who borrowed the Book are: " + String.valueOf(tongso));
    }

}
