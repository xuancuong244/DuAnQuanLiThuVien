package com.poly.model;

import java.util.Date;

public class PhieuMuon {

    private String maPhieu;
    private String maDocGia;
    private int SoLuong;
    private Date NgayMuon;
    private Date NgayHenTra;
    private boolean trangthai;

    public PhieuMuon() {
    }

    public PhieuMuon(String maPhieu, String maDocGia, int SoLuong, Date NgayMuon, Date NgayHenTra, boolean trangthai) {
        this.maPhieu = maPhieu;
        this.maDocGia = maDocGia;
        this.SoLuong = SoLuong;
        this.NgayMuon = NgayMuon;
        this.NgayHenTra = NgayHenTra;
        this.trangthai = trangthai;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Date getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(Date NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public Date getNgayHenTra() {
        return NgayHenTra;
    }

    public void setNgayHenTra(Date NgayHenTra) {
        this.NgayHenTra = NgayHenTra;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

}
