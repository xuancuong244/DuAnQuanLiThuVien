package com.poly.model;

import com.poly.utils.XDate;
import java.util.Date;

public class QuanLiSach {
    private String MaSach;
    private String  TenSach;
    private String Loai;
    private String TacGia;
    private String MaNV;
    private String NXB;
    private Date ngayNhap = XDate.now();
    private int SoLuong;
    private String NoiDung;
    private String Hinh;
    private String url;
    
    public QuanLiSach() {
    }

    public QuanLiSach(String MaSach, String TenSach, String Loai, String TacGia, String MaNV, String NXB, int SoLuong, String NoiDung, String Hinh, String url) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.Loai = Loai;
        this.TacGia = TacGia;
        this.MaNV = MaNV;
        this.NXB = NXB;
        this.SoLuong = SoLuong;
        this.NoiDung = NoiDung;
        this.Hinh = Hinh;
        this.url = url;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    
    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String NoiDung) {
        this.NoiDung = NoiDung;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

     @Override
    public String toString(){
        return TenSach;
    }
}
