package com.poly.model;

public class TheLoai {

    public String maTheLoai;
    public String tenTheLoai;
    public String viTri;

    public TheLoai() {
    }

    public TheLoai(String maTheLoai, String tenTheLoai, String viTri) {
        this.maTheLoai = maTheLoai;
        this.tenTheLoai = tenTheLoai;
        this.viTri = viTri;
    }

    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getMaTheLoai() {
        return maTheLoai;
    }

    public String getTenTheLoai() {
        return tenTheLoai;
    }

    public String getViTri() {
        return viTri;
    }
    
    @Override
    public String toString(){
        return tenTheLoai;
    }
}
