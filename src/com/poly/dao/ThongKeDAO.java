package com.poly.dao;

import com.poly.model.DocGia;
import com.poly.utils.XJdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThongKeDAO {

    public List<Object[]> TKTheLoaiSach() {
        List<Object[]> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            String sql = "{call sp_LoaiSach}";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {
                Object[] model = {
                    rs.getString("MaLoai"),
                    rs.getString("TenLoai"),
                    rs.getString("ViTri"),
                    rs.getString("MaSach"),
                    rs.getString("TenSach"),
                    rs.getInt("SoLuong"),};
                list.add(model);
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);

        }
        return list;

    }

    public List<Object[]> TKMaTheLoaiSach(String maTheLoai) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            String sql = "{call sp_MaLoaiSach (?)}";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {
                Object[] model = {
                    rs.getString("MaLoai"),
                    rs.getString("TenLoai"),
                    rs.getString("ViTri"),
                    rs.getString("MaSach"),
                    rs.getString("TenSach"),
                    rs.getInt("SoLuong"),};
                list.add(model);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<Object[]> TKViTriTheLoaiSach(String viTri) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            String sql = "{call sp_ViTriLoaiSach (?)}";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {
                Object[] model = {
                    rs.getString("MaLoai"),
                    rs.getString("TenLoai"),
                    rs.getString("ViTri"),
                    rs.getString("MaSach"),
                    rs.getString("TenSach"),
                    rs.getInt("SoLuong"),};
                list.add(model);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public int TKsoSachTLS(String maTheLoai) {
        int tongSachTLS = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_soSachTLS (?)}";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {
                tongSachTLS = rs.getInt("tongSachTLS");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tongSachTLS;
    }

    public int TKsoSachViTriTLS(String viTri) {
        int tongSachViTriTLS = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_soSachViTriTLS (?)}";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {

                tongSachViTriTLS = rs.getInt("tongSachViTriTLS");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tongSachViTriTLS;
    }

    public int TKsoTheLoaiTLS(String maTheLoai) {
        int tongTheLoaiTLS = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_soLoaiTLS (?)}";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {
                tongTheLoaiTLS = rs.getInt("soTheLoaiTLS");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tongTheLoaiTLS;
    }

    public int TKsoTheLoaiViTriTLS(String viTri) {
        int tongTheLoaiViTriTLS = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_soLoaiViTriTLS (?)}";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {

                tongTheLoaiViTriTLS = rs.getInt("soTheLoaiViTriTLS");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tongTheLoaiViTriTLS;
    }

    public int TKsoTheLoaiTLS() {
        int tongTheLoaiTLS = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_TongLoaiTLS}";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {
                tongTheLoaiTLS = rs.getInt("TongLoaiTLS");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tongTheLoaiTLS;
    }
// Thống kê SINH VIÊN    

    public List<DocGia> TKDGChuaMuonSach() {
        List<DocGia> lists = new ArrayList<DocGia>();
        try {
            ResultSet rs = null;
            String sql = "{call sp_DGChuaMuonSach}";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {
                DocGia dg = new DocGia(
                        rs.getString(1),
                        rs.getString(2),     
                        rs.getBoolean(3),
                         rs.getDate(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)
                );
                lists.add(dg);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lists;
    }

    public List<DocGia> TKDGDaMuonSach() {
        List<DocGia> lists = new ArrayList<DocGia>();
        try {
            ResultSet rs = null;
            String sql = "{call sp_DGDaMuonSach}";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {
                DocGia dg = new DocGia(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getBoolean(3),
                        rs.getDate(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)
                );
                lists.add(dg);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lists;
    }

    public List<DocGia> TKGioiTinhDG(boolean gioiTinh) {
        List<DocGia> lists = new ArrayList<>();
        try {
            ResultSet rs = null;
            String sql = "{call sp_GioiTinhDG (?)}";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {
                DocGia dg = new DocGia(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getBoolean(3),
                         rs.getDate(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)
                );
                lists.add(dg);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lists;
    }

    public int TKsoGioiTinhDG(boolean gioiTinh) {
        int tongGioiTinhSV = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_tongGioiTinhDG (?)}";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {

                tongGioiTinhSV = rs.getInt("tongGioiTinhDG");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tongGioiTinhSV;
    }

    public int TKsoDG() {
        int tongSV = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_tongDG }";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {
                tongSV = rs.getInt("tongDG");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tongSV;
    }

    public int TKTongDGChuaMuonSach() {
        int TongSVChuaMuonSach = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_TongDGChuaMuonSach }";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {
                TongSVChuaMuonSach = rs.getInt("TongDGChuaMuonSach");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return TongSVChuaMuonSach;
    }

    public int TKTongDGDaMuonSach() {
        int TongSVDaMuonSach = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_TongDGDaMuonSach}";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {
                TongSVDaMuonSach = rs.getInt("TongDGDaMuonSach");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return TongSVDaMuonSach;
    }
// Thống kê SACH  

    public List<Object[]> TKNgaySachGiam(String ngayBD, String ngayKT) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            String sql = "{call sp_NgaySachGiam (?,?)}";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {
                Object[] model = {
                    rs.getString("MaSach"),
                    rs.getString("TenSach"),
                    rs.getString("MaLoai"),
                    rs.getString("MaTacGia"),
                    rs.getString("MaNV"),
                    rs.getString("MaNXB"),
                    rs.getString("NgayNhap"),
                    rs.getString("NoiDung"),
                    rs.getString("Hinh"),};
                list.add(model);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<Object[]> TKNgaySachTang(String ngayBD, String ngayKT) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            String sql = "{call sp_NgaySachTang (?,?)}";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {
                Object[] model = {
                    rs.getString("MaSach"),
                    rs.getString("TenSach"),
                    rs.getString("MaLoai"),
                    rs.getString("MaTacGia"),
                    rs.getString("MaNV"),
                    rs.getString("MaNXB"),
                    rs.getString("NgayNhap"),
                    rs.getString("NoiDung"),
                    rs.getString("Hinh"),};
                list.add(model);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public int TKsoSachNgaySach(String ngayBD, String ngayKT) {
        int TongNgaySach = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_TongSachNgaySach (?,?)}";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {

                TongNgaySach = rs.getInt("TongNgaySach");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return TongNgaySach;
    }

    public int TKsoSach() {
        int tongSach = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_TongSach }";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {
                tongSach = rs.getInt("TongSach");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tongSach;
    }
// Thống kê PHIẾU MƯỢN   

    public List<Object[]> TKPM() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            String sql = "{call sp_PhieuMuon }";
            rs = XJdbc.executeQuery(sql);
            while (rs.next()) {
                Object[] model = {
                    rs.getString("MaPhieu"),
                    rs.getString("MaDocGia"),
                    rs.getString("tenDocGia"),
                    rs.getString("TenSach"),
                    rs.getInt("SoLuong"),
                    rs.getString("NgayMuon"),
                    rs.getString("NgayHenTra"),};
                list.add(model);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<Object[]> TKMaDGPM(String maDocGia) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            String sql = "{call sp_MaDGPM (?)}";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {
                Object[] model = {
                    rs.getString("MaPhieu"),
                    rs.getString("MaDocGia"),
                    rs.getString("tenDocGia"),
                    rs.getString("MaSach"),
                    rs.getString("TenSach"),
                    rs.getInt("SoLuong"),
                    rs.getString("NgayMuon"),
                    rs.getString("NgayHenTra"),};
                list.add(model);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public int TKsoSachDGPM(String maDocGia) {
        int soSachDGPM = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_soSachDGPM (?)}";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {
                soSachDGPM = rs.getInt("soSachDGPM");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return soSachDGPM;
    }

    public List<Object[]> TKMaSachPM(String maSach) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            String sql = "{call sp_MaSachPM (?)}";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {
                Object[] model = {
                    rs.getString("MaPhieu"),
                    rs.getString("MaDocGia"),
                    rs.getString("tenDocGia"),
                    rs.getString("MaSach"),
                    rs.getString("TenSach"),
                    rs.getInt("SoLuong"),
                    rs.getString("NgayMuon"),
                    rs.getString("NgayHenTra"),};
                list.add(model);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public int TKsoDGMuonSachPM(String maSach) {
        int tongSVMuonSach = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_soDGMuonSachPM (?)}";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {

                tongSVMuonSach = rs.getInt("tongDGMuonSach");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tongSVMuonSach;
    }

    public int TKsoSachDGMuon() {
        int TongSachSVMuon = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_TongSachDGMuon }";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {
                TongSachSVMuon = rs.getInt("TongSachDGMuon");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return TongSachSVMuon;
    }

    public List<Object[]> TKDGMuonNhieuSachNhatPM() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            String sql = "{call sp_DGMuonNhieuSachNhat }";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {
                Object[] model = {
                    rs.getString("MaDocGia"),
                    rs.getString("TenDocGia"),
                    rs.getInt("DGMuonNhieuSachNhat"),};
                list.add(model);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<Object[]> TKDGMuonItSachNhatPM() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            String sql = "{call sp_DGMuonItSachNhat }";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {
                Object[] model = {
                    rs.getString("MaDocGia"),
                    rs.getString("TenDocGia"),
                    rs.getInt("DGMuonItSachNhat"),};
                list.add(model);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<Object[]> TKSachMuonNhieuNhatPM() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            String sql = "{call sp_SachMuonNhieuNhat }";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {
                Object[] model = {
                    rs.getString("MaSach"),
                    rs.getString("TenSach"),
                    rs.getInt("SachMuonNhieuNhat"),};
                list.add(model);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<Object[]> TKSachMuonItNhatPM() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            String sql = "{call sp_SachMuonItNhat }";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {
                Object[] model = {
                    rs.getString("MaSach"),
                    rs.getString("TenSach"),
                    rs.getInt("SachMuonItNhat"),};
                list.add(model);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<Object[]> TKDGConHanTraSachPM() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            String sql = "{call sp_DGConHanTraSach }";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {
                Object[] model = {
                    rs.getString("MaPhieu"),
                    rs.getString("MaDocGia"),
                    rs.getString("tenDocGia"),
                    rs.getString("MaSach"),
                    rs.getString("TenSach"),
                    rs.getInt("SoLuong"),
                    rs.getString("NgayMuon"),
                    rs.getString("NgayHenTra"),};
                list.add(model);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<Object[]> TKDGQuaHanTraSachPM() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            String sql = "{call sp_DGQuaHanTraSach }";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {
                Object[] model = {
                    rs.getString("MaPhieu"),
                    rs.getString("MaDocGia"),
                    rs.getString("tenDocGia"),
                    rs.getString("MaSach"),
                    rs.getString("TenSach"),
                    rs.getInt("SoLuong"),
                    rs.getString("NgayMuon"),
                    rs.getString("NgayHenTra"),};
                list.add(model);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public int TKTongDGConHanTraSach() {
        int TongSVConHanTraSach = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_TongDGConHanTraSach }";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {
                TongSVConHanTraSach = rs.getInt("TongDGConHanTraSach");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return TongSVConHanTraSach;
    }

    public int TKTongDGQuaHanTraSach() {
        int TongSVQuaHanTraSach = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_TongDGQuaHanTraSach }";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {
                TongSVQuaHanTraSach = rs.getInt("TongDGQuaHanTraSach");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return TongSVQuaHanTraSach;
    }

    public int TKTongSoPhieuConHanTraSach() {
        int TongSoPhieuConHanTraSach = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_TongSoPhieuConHanTraSach }";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {
                TongSoPhieuConHanTraSach = rs.getInt("TongSoPhieuConHanTraSach");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return TongSoPhieuConHanTraSach;
    }

    public int TKTongSoPhieuQuaHanTraSach() {
        int TongSoPhieuQuaHanTraSach = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_TongSoPhieuQuaHanTraSach }";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {
                TongSoPhieuQuaHanTraSach = rs.getInt("TongSoPhieuQuaHanTraSach");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return TongSoPhieuQuaHanTraSach;
    }

    public int TKTongPM() {
        int TongPM = 0;
        try {
            ResultSet rs = null;
            String sql = "{call sp_TongPM }";
            rs = XJdbc.executeQuery(sql);

            while (rs.next()) {
                TongPM = rs.getInt("TongPM");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return TongPM;
    }
}
