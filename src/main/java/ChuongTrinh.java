
import java.util.ArrayList;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {

    public static void main(String[] args) {

        QuanLySach quanLySach = new QuanLySach();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("\n--- QUAN LY SACH ---");
                System.out.println("1. Xuat toan bo sach");
                System.out.println("2. Tinh tong gia tri cac sacg");
                System.out.println("3. Lay ra sach xuat ban truoc 2015");
                System.out.println("4. Tim sach co ten bat dau voi 'Lap trinh'");
                System.out.println("5. Sap xep theo gia tang dan");
                System.out.println("6. Xoa sach theo ma sach");
                System.out.println("7. Sua gia sach theo ma sach");
                System.out.println("0. Thoat");
                System.out.print("Lua chon cua ban: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        quanLySach.xuatToanBoSach();
                        break;
                    case 2:
                        System.out.println("Tong gia tri cac sach: " + quanLySach.tongTriGia());
                        break;
                    case 3:
                        ArrayList<Sach> truoc2015 = quanLySach.laySachXuatBanTruoc2015();
                        for (Sach sach : truoc2015) {
                            System.out.println(sach);
                        }
                        break;
                    case 4:
                        ArrayList<Sach> timTheoTen = quanLySach.timSachTheoTen();
                        for (Sach sach : timTheoTen) {
                            System.out.println(sach);
                        }
                        break;
                    case 5:
                        quanLySach.sapXepTheoGia();
                        System.out.println("Sach da duoc sap xep theo gia tang dan.");
                        break;
                    case 6:
                        System.out.print("Nhap ma sach can xoa: ");
                        String maSachXoa = scanner.nextLine();
                        quanLySach.xoaSachTheoMa(maSachXoa);
                        System.out.println("Sach da duoc xoa.");
                        break;
                    case 7:
                        System.out.print("Nhap ma sach can sua gia: ");
                        String maSachSua = scanner.nextLine();
                        System.out.print("Nhap gia moi: ");
                        double giaMoi = scanner.nextDouble();
                        quanLySach.suaGiaSach(maSachSua, giaMoi);
                        System.out.println("Gia sach da duoc cap nhap.");
                        break;
                    case 0:
                        System.out.println("Thoat chuong trinh.");
                        break;
                    default:
                        System.out.println("Lua chon khong hop le. Vui long chon lai.");
                        break;
                }
            } while (choice != 0);
        }
    }
}
