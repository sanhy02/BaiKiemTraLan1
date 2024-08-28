
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class QuanLySach {
    private final ArrayList<Sach> danhsachSach;
    
    public QuanLySach(){
        this.danhsachSach = new ArrayList<>();
        khoiTaoDuLieu();
    }
    
    private void khoiTaoDuLieu(){
        danhsachSach.add(new Sach ("K011", "Lap trinh java", 95000, 2017));
        danhsachSach.add(new Sach ("K012", "Co so du lieu", 85000, 2001));
        danhsachSach.add(new Sach ("K013", "Nhap mon Lap trinh", 72000, 2013));
        danhsachSach.add(new Sach ("K014", "Lap trinh Python", 39000, 2018));
        danhsachSach.add(new Sach ("K015", "Lap trinh C#", 82000, 2015));
    }
    
      public void xuatToanBoSach() {
        for (Sach sach : danhsachSach) {
            System.out.println(sach);
        }
    }

    // Lấy tổng trị giá các sách
    public double tongTriGia() {
        double tong = 0;
        for (Sach sach : danhsachSach) {
            tong += sach.getGiabia();
        }
        return tong;
    }

     
    public ArrayList<Sach> laySachXuatBanTruoc2015() {
        ArrayList<Sach> ketQua = new ArrayList<>();
        for (Sach sach : danhsachSach) {
            if (sach.getNamxuatban() < 2015) {
                ketQua.add(sach);
            }
        }
        return ketQua;
    }

    
    public ArrayList<Sach> timSachTheoTen() {
        ArrayList<Sach> ketQua = new ArrayList<>();
        for (Sach sach : danhsachSach) {
            if (sach.getTensach().startsWith("Lap trinh")) {
                ketQua.add(sach);
            }
        }
        return ketQua;
    }

        public void sapXepTheoGia() {
        Collections.sort(danhsachSach, new Comparator <Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return Double.compare(o1.getGiabia(), o2.getGiabia());
            }
        });
    }

     
    public void xoaSachTheoMa(String masach) {
        danhsachSach.removeIf(sach -> sach.getMasach().equals(masach));
    }

    
    public void suaGiaSach(String masach, double giaMoi) {
        for (Sach sach : danhsachSach) {
            if (sach.getMasach().equals(masach)) {
                sach.setGiabia(giaMoi);
                break;
            }
        }
    }
}
