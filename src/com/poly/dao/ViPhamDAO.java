package com.poly.dao;

import com.poly.model.ViPham;
import com.poly.utils.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViPhamDAO extends ThuVienDAO<ViPham, String> {

    @Override
    public void insert(ViPham model) {
        String sql = "INSERT INTO ViPham (MaViPham, TenViPham, MaDocGia) VALUES (?, ?, ?)";
        XJdbc.executeUpdate(sql,
                model.getMaViPham(),
                model.getTen(),
                model.getMaDG());
    }

    @Override
    public void update(ViPham model) {
        String sql = "Update ViPham set TenViPham = ?, MaDocGia = ? Where MaViPham = ?";
        XJdbc.executeUpdate(sql,
                model.getTen(),
                model.getMaDG(),
                model.getMaViPham());
    }

    @Override
    public void delete(String maViPham) {
        String sql = "DELETE FROM ViPham WHERE MaViPham=?";
        XJdbc.executeUpdate(sql, maViPham);
    }

    @Override
    public ViPham selectById(String maViPham) {
        String sql = "SELECT * FROM ViPham WHERE MaViPham = ?";
        List<ViPham> list = select(sql, maViPham);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<ViPham> select() {
        String sql = "SELECT * FROM ViPham";
        return select(sql);
    }

    public List<ViPham> selectBykeyword(String keyword) {
        String sql = "SELECT * FROM ViPham WHERE MaViPham like ?";
        return select(sql, "%" + keyword + "%");
    }

    private ViPham readFromResultSet(ResultSet rs) throws SQLException {
        ViPham model = new ViPham();
        model.setMaViPham(rs.getString("MaViPham"));
        model.setTen(rs.getString("TenViPham"));
        model.setMaDG(rs.getString("MaDocGia"));
        
        return model;
    }
    @Override
    protected List<ViPham> select(String sql, Object... args) {
        List<ViPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.executeQuery(sql, args);
                while (rs.next()) {
                    ViPham model = readFromResultSet(rs);
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

}
