package com.poly.dao;

import com.poly.model.NhanVien;
import com.poly.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO extends ThuVienDAO<NhanVien, String> {

    @Override
    public void insert(NhanVien model) {
        String sql = "INSERT INTO NhanVien (MaNV, MatKhau, tenNV, VaiTro) VALUES (?, ?, ?, ?)";
        XJdbc.executeUpdate(sql,
                model.getMaNV(),
                model.getPassword(),
                model.getTenNV(),
                model.isVaitro());
    }

    @Override
    public void update(NhanVien model) {
        String sql = "UPDATE NhanVien SET  MatKhau=?, tenNV = ?, VaiTro=? WHERE MaNV=?";
        XJdbc.executeUpdate(sql,
                model.getPassword(),
                model.getTenNV(),
                model.isVaitro(),
                model.getMaNV());
    }

    @Override
    public void delete(String maNV) {
        String sql = "DELETE FROM Nhanvien WHERE maNV = ?";
        XJdbc.executeUpdate(sql, maNV);
    }

    @Override
    public NhanVien selectById(String maNV) {
        String sql = "SELECT * FROM NhanVien WHERE maNV = ?";
        List<NhanVien> list = select(sql, maNV);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<NhanVien> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM NhanVien WHERE MaNV like ?";
        return select(sql, "%" + keyword + "%");
    }

    @Override
    public List<NhanVien> select() {
        String sql = "SELECT * FROM NhanVien";
        return select(sql);
    }

    @Override
    protected List<NhanVien> select(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.executeQuery(sql, args);
                while (rs.next()) {
                    NhanVien model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private NhanVien readFromResultSet(ResultSet rs) throws SQLException {
        NhanVien model = new NhanVien();
        model.setMaNV(rs.getString("MaNV"));
        model.setPassword(rs.getString("MatKhau"));
        model.setTenNV(rs.getString("tenNV"));
        model.setVaitro(rs.getBoolean("VaiTro"));
        return model;
    }

    public int doiMK(NhanVien dn) {
        try {
            String sql = "Update NhanVien set MatKhau=? WHERE MaNV=?";
            XJdbc.executeUpdate(sql,
                    dn.getMaNV(),
                    dn.getPassword());
            return 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

}
