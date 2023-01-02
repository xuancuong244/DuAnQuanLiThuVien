package com.poly.dao;

import com.poly.model.TheLoai;
import com.poly.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TheLoaiDAO extends ThuVienDAO<TheLoai, String> {

    @Override
    public void insert(TheLoai model) {
        String sql = "INSERT INTO LoaiSach (MaLoai, TenLoai, ViTri) VALUES (?, ?, ?)";
        XJdbc.executeUpdate(sql,
                model.getMaTheLoai(),
                model.getTenTheLoai(),
                model.getViTri());
    }

    @Override
    public void update(TheLoai model) {
        String sql = "UPDATE LoaiSach SET TenLoai = ?, ViTri = ? WHERE MaLoai = ?";
        XJdbc.executeUpdate(sql,
                model.getTenTheLoai(),
                model.getViTri(),
                model.getMaTheLoai());
    }

    @Override
    public void delete(String maLoai) {
        String sql = "DELETE FROM LoaiSach WHERE MaLoai = ?";
        XJdbc.executeUpdate(sql, maLoai);
    }

    @Override
    public TheLoai selectById(String maLoai) {
        String sql = "SELECT  MaLoai, TenLoai, ViTri FROM LoaiSach WHERE MaLoai = ?";
        List<TheLoai> list = select(sql, maLoai);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<TheLoai> select() {
        String sql = "SELECT MaLoai, TenLoai, ViTri FROM LoaiSach";
        return select(sql);
    }

    public List<TheLoai> selectByName(String name) {
        String sql = "SELECT MaLoai, TenLoai, ViTri FROM LoaiSach where TenLoai like ?";
        return select(sql, name);
    }
    
    public List<TheLoai> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM LoaiSach WHERE MaLoai like ?";
        return select(sql, "%" + keyword + "%");
    }

    @Override
    protected List<TheLoai> select(String sql, Object... args) {
        List<TheLoai> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.executeQuery(sql, args);
                while (rs.next()) {
                    TheLoai model = readFromResultSet(rs);
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

    private TheLoai readFromResultSet(ResultSet rs) throws SQLException {
        TheLoai model = new TheLoai();
        model.setMaTheLoai(rs.getString("MaLoai"));
        model.setTenTheLoai(rs.getString("TenLoai"));
        model.setViTri(rs.getString("ViTri"));

        return model;
    }
    public List<String> listcbovitri()
   {
       List<String> listcbo = new ArrayList<String>();
       try
       {
           String sql="SELECT DISTINCT ViTri FROM LoaiSach";
           ResultSet rs = XJdbc.executeQuery(sql);
           while(rs.next())
           {
              listcbo.add(rs.getString(1));
           }
       }
       catch(Exception ex)
       {
          ex.printStackTrace();
       }
       
       return listcbo;
   }
    public List<Object[]> getPhieuMuon() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "Select  MaLoai, TenLoai, ViTri from LoaiSach";
                rs = XJdbc.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaLoai"),
                        rs.getString("TenLoai"),
                        rs.getString("ViTri"),
                       
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
