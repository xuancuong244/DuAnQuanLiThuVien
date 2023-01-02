package com.poly.dao;

import com.poly.model.NhaXuatBan;
import com.poly.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhaXuatBanDAO extends ThuVienDAO<NhaXuatBan, String> {

    @Override
    public void insert(NhaXuatBan model) {
        String sql = "insert into NhaXB (MaNXB, tenNXB, DiaChi, Email, SDT) values (?, ?, ?, ?, ?)";
        XJdbc.executeUpdate(sql,
                model.getMaNXB(),
                model.getTenNXB(),
                model.getDiaChi(),
                model.getEmail(),
                model.getSDT()
        );
    }

    @Override
    public void update(NhaXuatBan model) {
        String sql = "Update NhaXB set tenNXB = ?, DiaChi = ?, Email = ?, SDT = ? where maNXB = ?";
        XJdbc.executeUpdate(sql,
                model.getTenNXB(),
                model.getDiaChi(),
                model.getEmail(),
                model.getSDT(),
                model.getMaNXB()
        );
    }

    @Override
    public void delete(String maNXB) {
        String sql = "Delete from NhaXB where MaNXB = ?";
        XJdbc.executeUpdate(sql, maNXB);
    }

    @Override
    public NhaXuatBan selectById(String maNXB) {
        String sql = "SELECT * FROM NhaXB WHERE maNXB = ?";
        List<NhaXuatBan> list = select(sql, maNXB);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<NhaXuatBan> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM NhaXB WHERE MaNXB like ?";
        return select(sql, "%" + keyword + "%");
    }

    @Override
    public List<NhaXuatBan> select() {
        String sql = "SELECT * FROM NhaXB";
        return select(sql);
    }

    public List<NhaXuatBan> selectByName(String name) {
        String sql = "SELECT * FROM NhaXB where TenNXB like ?";
        return select(sql, name);
    }
    @Override
    protected List<NhaXuatBan> select(String sql, Object... args) {
        List<NhaXuatBan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.executeQuery(sql, args);
                while (rs.next()) {
                    NhaXuatBan model = readFromResultSet(rs);
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

    private NhaXuatBan readFromResultSet(ResultSet rs) throws SQLException {
        NhaXuatBan model = new NhaXuatBan();
        model.setMaNXB(rs.getString("MaNXB"));
        model.setTenNXB(rs.getString("TenNXB"));
        model.setDiaChi(rs.getString("DiaChi"));
        model.setEmail(rs.getString("Email"));
        model.setSDT(rs.getString("SDT"));
        return model;
    }

    public List<Object[]> getNhaXB() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "Select * from NhaXB";
                rs = XJdbc.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaNXB"),
                        rs.getString("TenNXB"),
                        rs.getString("DiaChi"),
                        rs.getString("Email"),
                        rs.getString("SDT")
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
}
