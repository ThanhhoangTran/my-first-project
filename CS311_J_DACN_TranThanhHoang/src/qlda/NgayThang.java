
package qlda;
public class NgayThang {
   private int ngay, thang, nam;
   public NgayThang(int ngay, int thang, int nam){
       this.ngay = ngay;
       this.thang = thang;
       this.nam = nam;
   }
    public NgayThang(String s){
        String d,m,y;
        d  = s.substring(0, s.indexOf("/"));
        ngay = Integer.parseInt(d);
        s = s.substring(s.indexOf("/")+1, s.length());
        m = s.substring(0, s.indexOf("/"));
        thang = Integer.parseInt(m);
        y = s.substring(s.indexOf("/")+1, s.length());
        nam = Integer.parseInt(y);
    }
   public NgayThang(){
       ngay = thang = nam = 0;
   }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
   public String toString(){
       return ngay+"/"+thang+"/"+nam;
   }
}
