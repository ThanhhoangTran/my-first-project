/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlda;

public class Sach {
    protected String maSach, tenSach, tacGia;
    protected NgayThang ngay;
    int theloai, soTrang;
    public Sach(){
        maSach = tenSach = tacGia  = null;
        ngay = new NgayThang(0, 0, 0);
        theloai = 0;
        soTrang =0;
    }
    public Sach(String maSach, String tenSach, NgayThang ngay, String tacGia ,int theloai, int sotrang){
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.ngay = ngay;
        this.theloai = theloai;
        this.soTrang = sotrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public NgayThang getNgay() {
        return ngay;
    }

    public void setNgay(NgayThang ngay) {
        this.ngay = ngay;
    }

    public int getTheloai() {
        return theloai;
    }

    public void setTheloai(int theloai) {
        this.theloai = theloai;
    }
      public String chuyendoi(){
        if(theloai == 1) return "Kinh Di";
        if(theloai == 2) return "Tinh Cam";
        if(theloai == 3) return "Hanh Dong";
        if(theloai == 4) return "Tu tien";
        return "The Loai Khac";
    }
    public String toString(){
        return maSach  +" "+tenSach+" "+ theloai + " " + ngay.toString()+" "+ tacGia;
    }
}
