package com.poly.dao;

import com.poly.model.NhaXuatBan;
import com.poly.model.PhieuMuon;
import com.poly.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhieuMuonDAO extends ThuVienDAO<PhieuMuon, String> {

    @Override
    public void insert(PhieuMuon model) {
        String sql = "INSERT INTO PhieuMuon (MaPhieu, MaDocGia, SoLuong,  NgayMuon, NgayHenTra, TrangThaiTra) Values (?,?,?,?,?,?)";
        XJdbc.executeUpdate(sql,
                model.getMaPhieu(),
                model.getMaDocGia(),
                model.getSoLuong(),
                model.getNgayMuon(),
                model.getNgayHenTra(),
                model.isTrangthai()
        );
    }

    @Override
    public void update(PhieuMuon model) {
        
        String sql = "Update PhieuMuon set Soluong = ?, ngaymuon = ?, ngayhentra = ?, Trangthaitra = ? where maphieu = ?";
        XJdbc.executeUpdate(sql,
//                model.getMaDocGia(),
                model.getSoLuong(),
                model.getNgayMuon(),
                model.getNgayHenTra(),
                model.isTrangthai(),
                model.getMaPhieu()
        );
    }

    @Override
    public void delete(String id) {
        String sql = "Delete from PhieuMuon where maPhieu = ?";
        XJdbc.executeUpdate(sql, id);
    }

    @Override
    public PhieuMuon selectById(String id) {
        String sql = "SELECT MaPhieu, DocGia.TenDocGia, soluong, ngaymuon, ngayhentra, TrangThaiTra FROM PhieuMuon join DocGia on DocGia.maDocGia = PhieuMuon.maDocGia WHERE maPhieu = ?";
        List<PhieuMuon> list = select(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<PhieuMuon> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM PhieuMuon WHERE maPhieu like ?";
        return select(sql, "%" + keyword + "%");
    }
    
    public List<PhieuMuon> selectByStatus(int i) {
        String sql = "SELECT MaPhieu, DocGia.TenDocGia, soluong, ngaymuon, ngayhentra, TrangThaiTra FROM PhieuMuon join DocGia on DocGia.maDocGia = PhieuMuon.maDocGia WHERE TrangThaiTra = ?";
        return select(sql, i);
    }

    @Override
    public List<PhieuMuon> select() {
        String sql = "SELECT MaPhieu, DocGia.TenDocGia, soluong, ngaymuon, ngayhentra, TrangThaiTra FROM PhieuMuon join DocGia on DocGia.maDocGia = PhieuMuon.maDocGia order by NgayMuon desc";
        return select(sql);
    }

    @Override
    protected List<PhieuMuon> select(String sql, Object... args) {
        List<PhieuMuon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.executeQuery(sql, args);
                while (rs.next()) {
                    PhieuMuon model = readFromResultSet(rs);
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

    private PhieuMuon readFromResultSet(ResultSet rs) throws SQLException {
        PhieuMuon model = new PhieuMuon();
        model.setMaPhieu(rs.getString("MaPhieu"));
        model.setMaDocGia(rs.getString("TenDocGia"));
        model.setSoLuong(rs.getInt("SoLuong"));
        model.setNgayMuon(rs.getDate("NgayMuon"));
        model.setNgayHenTra(rs.getDate("NgayHenTra"));
        model.setTrangthai(rs.getBoolean("TrangThaiTra"));
        return model;
    }
    
    public List<Object[]> getPhieuMuon() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "Select MaPhieu, DocGia.TenDocGia, soluong, ngaymuon, ngayhentra, TrangThaiTra from PhieuMuon inner join DocGia on PhieuMuon.MaDocGia = DocGia.MaDocGia";
                rs = XJdbc.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaPhieu"),
                        rs.getString("TenDocGia"),
                        rs.getInt("SoLuong"),
                        rs.getDate("NgayMuon"),
                        rs.getDate("NgayHenTra"),
                        rs.getString("TrangThaiTra")
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
