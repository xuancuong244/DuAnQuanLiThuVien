package com.poly.model;

import com.poly.utils.XDate;
import java.util.Date;

public class TacGia {

    private String MaTacGia;
    private String TenTacGia;
    private String Email;
    private Date Ngaysinh = XDate.now();
    private String Addres;
    private String phone;

    public TacGia() {
    }

    public TacGia(String MaTacGia, String TenTacGia, String Email, String Addres, String phone) {
        this.MaTacGia = MaTacGia;
        this.TenTacGia = TenTacGia;
        this.Email = Email;
        this.Addres = Addres;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

   

    public String getMaTacGia() {
        return MaTacGia;
    }

    public void setMaTacGia(String MaTacGia) {
        this.MaTacGia = MaTacGia;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String TenTacGia) {
        this.TenTacGia = TenTacGia;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getAddres() {
        return Addres;
    }

    public void setAddres(String Addres) {
        this.Addres = Addres;
    }
    
    @Override
    public String toString(){
        return TenTacGia;
    }
}
