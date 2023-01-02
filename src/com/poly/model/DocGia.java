package com.poly.model;

import java.util.Date;

public class DocGia {
    private String maDG;
    private String TenDG;
    private boolean gioitinh;
    private Date ngsinh;
    
    private String diachi;
    private String email;
    private String SDT;
    private String matKhau;

    public DocGia() {
        
        
    }

    public DocGia(String maDG, String TenDG,  boolean gioitinh,Date ngsinh, String diachi, String email, String SDT, String matKhau) {
        this.maDG = maDG;
        this.TenDG = TenDG;
        this.ngsinh = ngsinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.email = email;
        this.SDT = SDT;
        this.matKhau = matKhau;
    }

    public String getMaDG() {
        return maDG;
    }

    public void setMaDG(String maDG) {
        this.maDG = maDG;
    }

    public String getTenDG() {
        return TenDG;
    }

    public void setTenDG(String TenDG) {
        this.TenDG = TenDG;
    }

    public Date getNgsinh() {
        return ngsinh;
    }

    public void setNgsinh(Date ngsinh) {
        this.ngsinh = ngsinh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    
     @Override
    public String toString(){
        return TenDG;
    }
    
}
