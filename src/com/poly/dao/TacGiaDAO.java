package com.poly.dao;

import com.poly.model.TacGia;
import com.poly.model.TheLoai;
import com.poly.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TacGiaDAO extends ThuVienDAO<TacGia, String> {

    @Override
    public void insert(TacGia model) {
        String sql = "INSERT INTO TacGia (MaTacGia, TenTacGia, ngaysinh, Email, SDT) VALUES (?, ?, ?, ?, ?)";
        XJdbc.executeUpdate(sql,
                model.getMaTacGia(),
                model.getTenTacGia(),
                model.getNgaysinh(),
                model.getEmail(),
                model.getPhone());
    }

    @Override
    public void update(TacGia model) {
        String sql = "UPDATE TacGia SET TenTacGia=?, ngaysinh=?, Email=?, SDT = ? WHERE MaTacGia =  ?";
        XJdbc.executeUpdate(sql,
                model.getTenTacGia(),
                model.getNgaysinh(),
                model.getEmail(),
                model.getPhone(),
                model.getMaTacGia());
    }

    @Override
    public void delete(String MaTacGia) {
        String sql = "DELETE FROM TacGia WHERE MaTacGia=?";
        XJdbc.executeUpdate(sql, MaTacGia);
    }

    @Override
    public TacGia selectById(String MaTacGia) {
        String sql = "SELECT * FROM TacGia WHERE MaTacGia=?";
        List<TacGia> list = select(sql, MaTacGia);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<TacGia> select() {
        String sql = "SELECT * FROM TacGia";
        return select(sql);
    }

    public List<TacGia> selectByName(String name) {
        String sql = "SELECT * FROM TacGia where TenTacGia like ?";
        return select(sql, name);
    }
    @Override
    protected List<TacGia> select(String sql, Object... args) {
        List<TacGia> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.executeQuery(sql, args);
                while (rs.next()) {
                    TacGia model = readFromResultSet(rs);
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

    public List<TacGia> selectBykeyword(String keyword) {
        String sql = "SELECT * FROM TacGia where MaTacGia=?";
        return select(sql, keyword);
    }

    private TacGia readFromResultSet(ResultSet rs) throws SQLException {
        TacGia model = new TacGia();
        model.setMaTacGia(rs.getString("MaTacGia"));
        model.setTenTacGia(rs.getString("TenTacGia"));
        model.setNgaysinh(rs.getDate("ngaysinh"));
        model.setEmail(rs.getString("Email"));
        model.setPhone(rs.getString("SDT"));

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
                String sql = "Select * from LoaiSach";
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
