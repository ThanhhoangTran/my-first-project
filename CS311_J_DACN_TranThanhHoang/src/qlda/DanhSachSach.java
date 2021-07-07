package qlda;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSach {
    ArrayList<Sach> a = new ArrayList<Sach>();
    public void docFile() {
        try {
            File f = new File("ThuMucTruyen\\DanhSachTruyen.txt");
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String ma, ten = "", tg = "", ngay;
                    int theloai;
                    ma = line.next();
                    while (!line.hasNextInt()) {
                        ten = ten + line.next() + " ";
                    }
                    ten = ten.trim();
                    theloai = line.nextInt();
                    ngay = line.next();
                    while (!line.hasNextInt()) {
                        tg = tg + line.next() + " ";
                    }
                    tg = tg.trim();
                    int sotrang  = line.nextInt();
                    a.add(new Sach(ma, ten, new NgayThang(ngay), tg, theloai, sotrang));
                }
            } else {
                System.out.println("Khong doc dc");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Sach TimKiemMa(String ma){
        for(Sach t: a){
            if(t.maSach.compareToIgnoreCase(ma)==0){
                return t;
            }
        }
        return null;
    }
    public ArrayList timTheLoai(int tl) {
       ArrayList<Sach> t = new ArrayList<Sach>();
       for(Sach x: a){
           if(x.theloai == tl){
               t.add(x);
           }
       }
       return t;
    }
    public Sach timTheoTen(String ten){
         for(Sach t: a){
            if(t.tenSach.compareToIgnoreCase(ten)==0){
                return t;
            }
        }
        return null;
    }
    public void Xuat() {
        for (Sach x : a) {
            System.out.println(x);
        }
    }

    public void themSach(String maSach, String tenSach, String ngay, String tacGia, int theloai, int sotrang) {
        a.add(new Sach(maSach, tenSach, new NgayThang(ngay), tacGia, theloai, sotrang));
    }
    public void capNhat(){
         Scanner s = new Scanner(System.in);
         try {
            File f = new File("ThuMucTruyen\\DanhSachTruyen.txt");
            if (f.exists()) {
                PrintStream out = new PrintStream(f);
                for (Sach x : a) {
                    out.println(x.maSach +" " +x.tenSach +" " + x.theloai +" " + x.ngay +" " + x.tacGia +" " + x.soTrang);
                }
                out.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public boolean xoaSachTheoMa(String ma) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).maSach.compareToIgnoreCase(ma.trim()) == 0) {
                a.remove(i);
                return true;
            }
        }
        return false;
    }
    public void xoaSachTheoTen(String ten){
        for(int i = 0; i<a.size(); i++){
            if (a.get(i).tenSach.compareToIgnoreCase(ten) == 0) {
                a.remove(i);
            }
        }
    }
    public void Xoa(){
        a.removeAll(a);
    }
    public static void main(String []args){
        DanhSachSach t = new DanhSachSach();
        t.docFile();
        t.Xuat();
        System.out.println("Sau khi xoa");
        t.Xoa();
        t.Xuat();
        
        
    }
}
