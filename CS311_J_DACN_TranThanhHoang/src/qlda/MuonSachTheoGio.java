/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlda;

public class MuonSachTheoGio extends MuonSach{
    int gio;
    public MuonSachTheoGio(){
        super();
        gio = 0;
    }
    public MuonSachTheoGio(int x){
        super();
        gio = x;
    }
    public MuonSachTheoGio(String maDG, String tenNguoi, Sach sach, String ngaythang, int gio){
        super(maDG, tenNguoi, sach, ngaythang);
        this.gio = gio;
    }
    public double TienThue(){
        if(gio>24){
            return (gio/241)*2000 + (gio%24)*500;
        }
        return gio*500;
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }
    public String toString(){
        return super.toString() + " "+ TienThue();
    }
}
