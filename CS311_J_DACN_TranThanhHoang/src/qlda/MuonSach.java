
package qlda;

public abstract class MuonSach extends DocGia implements ITienThue{
     protected NgayThang ngayMuon;
      protected Sach sach;
     public MuonSach(){
         super();
         ngayMuon =  new NgayThang();
         sach = new Sach();
         
     }
     public MuonSach(String maDG, String tenNguoi, Sach sach, String ngaythang){
         super(maDG, tenNguoi);
         this.sach = sach;
         ngayMuon = new NgayThang(ngaythang);

     }
     public String toString(){
         return super.toString() +" "+sach.maSach+" " + sach.tenSach+" "+ ngayMuon ;
     }
    public NgayThang getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(NgayThang ngayMuon) {
        this.ngayMuon = ngayMuon;
    }


    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }
    public abstract double TienThue();
}
