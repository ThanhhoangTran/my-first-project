
package qlda;

import java.util.ArrayList;
public class DocGia {
   protected String maDG, tenNguoiMuon;
   public DocGia(){
       maDG = tenNguoiMuon = null;
   }
   public DocGia(String maDG, String tenNguoiMuon){
       this.maDG = maDG;
       this.tenNguoiMuon = tenNguoiMuon;
   }
    public String getMaDG() {
        return maDG;
    }

    public void setMaDG(String maDG) {
        this.maDG = maDG;
    }

    public String getTenNguoiMuon() {
        return tenNguoiMuon;
    }

    public void setTenNguoiMuon(String tenNguoiMuon) {
        this.tenNguoiMuon = tenNguoiMuon;
    }
   public String toString(){
       return maDG + " " + tenNguoiMuon;
   }
}
