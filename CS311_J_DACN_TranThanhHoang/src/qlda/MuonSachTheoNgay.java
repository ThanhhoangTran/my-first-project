
package qlda;

/**
 *
 * @author Admin
 */
public class MuonSachTheoNgay extends MuonSach {
    private int ngaythue;
    public MuonSachTheoNgay(){
        super();
        ngaythue = 0;
    }
    public MuonSachTheoNgay(int x){
        super();
        ngaythue = x;
    }
    public MuonSachTheoNgay(String maDG, String tenNguoi, Sach sach,String ngaythang, int songay){
        super(maDG, tenNguoi, sach, ngaythang);
        ngaythue = songay;
    }
    public double TienThue(){
        if(ngaythue>7){
            return 7*2000 + 0.8*2000*(ngaythue-7);
        }
        return ngaythue*2000;
    }

    public int getNgaythue() {
        return ngaythue;
    }

    public void setNgaythue(int ngaythue) {
        this.ngaythue = ngaythue;
    }
    
    public String toString(){
        return super.toString() + " " + TienThue();
    }
}
