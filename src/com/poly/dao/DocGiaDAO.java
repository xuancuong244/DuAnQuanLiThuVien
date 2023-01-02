package com.poly.dao;

import com.poly.model.DocGia;
import com.poly.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DocGiaDAO extends ThuVienDAO<DocGia, String> {

    @Override
    public void insert(DocGia model) {
        String sql = "INSERT INTO DocGia (MaDocGia, TenDocGia, Ngaysinh, gioitinh, diachi,email, sdt, matkhau) values (?,?,?,?,?,?,?,?)";
        XJdbc.executeUpdate(sql,
                model.getMaDG(),
                model.getTenDG(),
                model.getNgsinh(),
                model.isGioitinh(),
                model.getDiachi(),
                model.getEmail(),
                model.getSDT(),
                model.getMatKhau());
    }

    @Override
    public void update(DocGia model) {
        String sql = "update DocGia set TenDocGia = ?, Ngaysinh = ?, gioitinh = ?, diachi = ?, email = ?, sdt = ?, matkhau = ? where maDOcGia = ?";
        XJdbc.executeUpdate(sql,
                model.getTenDG(),
                model.getNgsinh(),
                model.isGioitinh(),
                model.getDiachi(),
                model.getEmail(),
                model.getSDT(),
                model.getMatKhau(),
                model.getMaDG());
    }

    @Override
    public void delete(String maDG) {
        String sql = "DELETE FROM DocGia WHERE maDocGia = ?";
        XJdbc.executeUpdate(sql, maDG);
    }

    @Override
    public DocGia selectById(String maDG) {
        String sql = "SELECT * FROM DOcGia WHERE maDocGia = ?";
        List<DocGia> list = select(sql, maDG);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<DocGia> select() {
        String sql = "SELECT * FROM DocGia";
        return select(sql);
    }

    public List<DocGia> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM DocGia WHERE MaDocGia like ?";
        return select(sql, "%" + keyword + "%");
    }

    @Override
    protected List<DocGia> select(String sql, Object... args) {
        List<DocGia> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.executeQuery(sql, args);
                while (rs.next()) {
                    DocGia model = readFromResultSet(rs);
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

    private DocGia readFromResultSet(ResultSet rs) throws SQLException {
        DocGia model = new DocGia();
        model.setMaDG(rs.getString("MaDocGia"));
        model.setTenDG(rs.getString("TenDocGia"));
        model.setNgsinh(rs.getDate("NgaySinh"));
        model.setGioitinh(rs.getBoolean("GioiTinh"));
        model.setDiachi(rs.getString("DiaChi"));
        model.setEmail(rs.getString("Email"));
        model.setSDT(rs.getString("SDT"));
        model.setMatKhau(rs.getString("MatKhau"));
        return model;
    }

    public List<Object[]> getDocGia() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "Select * from DocGia";
                rs = XJdbc.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaDocGia"),
                        rs.getString("TenDocGia"),
                        rs.getDate("NgaySinh"),
                        rs.getBoolean("GioiTinh"),
                        rs.getString("DiaChi"),
                        rs.getString("Email"),
                        rs.getString("SDT"),
                        rs.getString("MatKhau")
                    };
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

    public int doiMK(DocGia dg) {
        try {
            String sql = "Update DocGia set MatKhau=? WHERE MaDocGia=?";
            XJdbc.executeUpdate(sql,
                    dg.getMaDG(),
                    dg.getMatKhau());
            return 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

}
