package com.poly.model;

public class NhanVien {
    private String maNV;
    private String tenNV;
    private String password;
    private boolean vaitro;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String password, boolean vaitro) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.password = password;
        this.vaitro = vaitro;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isVaitro() {
        return vaitro;
    }

    public void setVaitro(boolean vaitro) {
        this.vaitro = vaitro;
    }

    @Override
    public String toString(){
        return tenNV;
    }
    
}
