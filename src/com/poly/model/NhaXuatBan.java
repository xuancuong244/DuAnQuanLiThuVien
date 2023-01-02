package com.poly.model;

public class NhaXuatBan {
    private String MaNXB;
    private String TenNXB;
    private String diaChi;
    private String Email;
    private String SDT;

    public NhaXuatBan() {
    }

    public NhaXuatBan(String MaNXB, String TenNXB, String diaChi, String Email, String SDT) {
        this.MaNXB = MaNXB;
        this.TenNXB = TenNXB;
        this.diaChi = diaChi;
        this.Email = Email;
        this.SDT = SDT;
    }

    public String getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(String MaNXB) {
        this.MaNXB = MaNXB;
    }

    public String getTenNXB() {
        return TenNXB;
    }

    public void setTenNXB(String TenNXB) {
        this.TenNXB = TenNXB;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
    @Override
    public String toString(){
        return TenNXB;
    }
}
