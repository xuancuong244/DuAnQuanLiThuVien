package com.poly.model;

public class ViPham {
    private String maViPham;
    private String maDG;
    private String ten;

    public ViPham() {
    }

    public ViPham(String maViPham, String maDG, String ten) {
        this.maViPham = maViPham;
        this.maDG = maDG;
        this.ten = ten;
    }

    public String getMaViPham() {
        return maViPham;
    }

    public String getMaDG() {
        return maDG;
    }

    public String getTen() {
        return ten;
    }

    public void setMaViPham(String maViPham) {
        this.maViPham = maViPham;
    }

    public void setMaDG(String maDG) {
        this.maDG = maDG;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "ViPham{" + "maViPham=" + maViPham +  ", tenvipham =" + ten + ", maDocGia=" + maDG + '}';
    }
    
}
