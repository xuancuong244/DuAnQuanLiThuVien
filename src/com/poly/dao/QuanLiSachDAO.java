package com.poly.dao;

import com.poly.model.NhaXuatBan;
import com.poly.model.QuanLiSach;
import com.poly.utils.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QuanLiSachDAO extends ThuVienDAO<QuanLiSach, String> {

    @Override
    public void insert(QuanLiSach model) {
        String sql = "INSERT INTO Sach (MaSach, TenSach, MaLoai, MaTacGia, MaNV,  MaNXB, NgayNhap, SoLuong, NoiDung, Hinh, url) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.executeUpdate(sql,
                model.getMaSach(),
                model.getTenSach(),
                model.getLoai(),
                model.getTacGia(),
                model.getMaNV(),
                model.getNXB(),
                model.getNgayNhap(),
                model.getSoLuong(),
                model.getNoiDung(),
                model.getHinh(),
                model.getUrl());
    }

    @Override
    public void update(QuanLiSach model) {
        String sql = "Update Sach set TenSach = ?, MaLoai = ?, MaTacGia = ?, MaNXB = ?, NgayNhap = ?, soLuong = ?, NoiDung = ?, Hinh= ?, url = ? where maSach = ?";
        XJdbc.executeUpdate(sql, 
                model.getTenSach(),
                model.getLoai(),
                model.getTacGia(),
                model.getNXB(),
                model.getNgayNhap(),
                model.getSoLuong(),
                model.getNoiDung(),
                model.getHinh(),
                model.getUrl(),
                model.getMaSach());
    }

    @Override
    public void delete(String maSach) {
        String sql = "DELETE FROM Sach WHERE MaSach = ?";
        XJdbc.executeUpdate(sql, maSach);
    }

    @Override
    public QuanLiSach selectById(String maSach) {
        String sql = "SELECT masach,tensach, loaisach.tenloai,tacgia.tentacgia,nhaXB.tenNXB,ngaynhap,soluong,noidung,hinh,url FROM Sach join LoaiSach on sach.maloai = loaisach.maloai join nhaXb on nhaXB.maNXB = sach.maNXB join tacgia on tacgia.matacgia = sach.matacgia where masach = ?";
        List<QuanLiSach> list = select(sql, maSach);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<QuanLiSach> select() {
        String sql = "SELECT masach,tensach, loaisach.tenloai,tacgia.tentacgia,nhaXB.tenNXB,ngaynhap,soluong,noidung,hinh,url FROM Sach join LoaiSach on sach.maloai = loaisach.maloai join nhaXb on nhaXB.maNXB = sach.maNXB join tacgia on tacgia.matacgia = sach.matacgia";
        return select(sql);
    }

    public List<QuanLiSach> selectByKeyword(String keyword) {
        String sql = "SELECT masach,tensach, loaisach.tenloai,tacgia.tentacgia,nhaXB.tenNXB,ngaynhap,soluong,noidung,hinh,url FROM Sach join LoaiSach on sach.maloai = loaisach.maloai join nhaXb on nhaXB.maNXB = sach.maNXB join tacgia on tacgia.matacgia = sach.matacgia WHERE MaSach like ?";
        return select(sql, "%" + keyword + "%");
    }
    
    public List<QuanLiSach> selectByKeywordd(String keyword) {
        String sql = "SELECT masach,tensach, loaisach.tenloai,tacgia.tentacgia,nhaXB.tenNXB,ngaynhap,soluong,noidung,hinh,url FROM Sach join LoaiSach on sach.maloai = loaisach.maloai join nhaXb on nhaXB.maNXB = sach.maNXB join tacgia on tacgia.matacgia = sach.matacgia WHERE TenSach like ?";
        return select(sql, "%" + keyword + "%");
    }
    
    @Override
    protected List<QuanLiSach> select(String sql, Object... args) {
        List<QuanLiSach> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.executeQuery(sql, args);
                while (rs.next()) {
                    QuanLiSach model = readFromResultSet(rs);
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

    private QuanLiSach readFromResultSet(ResultSet rs) throws SQLException {
        QuanLiSach model = new QuanLiSach();
        model.setMaSach(rs.getString("MaSach"));
        model.setTenSach(rs.getString("TenSach"));
        model.setLoai(rs.getString("TenLoai"));
        model.setTacGia(rs.getString("TenTacGia"));
//        model.setMaNV(rs.getString("MaNV"));
        model.setNXB(rs.getString("TenNXB"));
        model.setNgayNhap(rs.getDate("NgayNhap"));
        model.setSoLuong(rs.getInt("SoLuong"));
        model.setNoiDung(rs.getString("NoiDung"));
        model.setHinh(rs.getString("Hinh"));
        model.setUrl(rs.getString("url"));
        return model;
    }

     public List<Object[]> getQuanLiSach() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "Select masach,tensach, loaisach.tenloai,tacgia.tentacgia,nhaXB.tenNXB,ngaynhap,soluong,noidung,hinh,url from Sach inner join LoaiSach on Sach.MaLoai = LoaiSach.MaLoai inner join TacGia on Sach.MaTacGia = TacGia.MaTacGia inner join NhaXB on Sach.MaNXB = NhaXB.MaNXB";
                rs = XJdbc.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaSach"),
                        rs.getString("TenSach"),
                        rs.getString("TenLoai"),
                        rs.getString("TenTacGia"),
                        rs.getString("TenNXB"),
                        rs.getDate("NgayNhap"),
                        rs.getInt("SoLuong"),
                        rs.getString("NoiDung"),
                        rs.getString("Hinh"),
                        rs.getString("url")
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
