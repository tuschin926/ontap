package QuanLyThuVien;

import java.awt.*;
import java.util.Scanner;

public class Main extends QuanLyThuVien {

    public static void main(String[] args) {
        QuanLyThuVien ql=new QuanLyThuVien();
        Scanner sc= new Scanner(System.in);

            while (true){
                System.out.println("_____________MENU_____________");
                System.out.println("1. Nhap thong tin sinh vien VKU.");
                System.out.println("2. Tim nguoi doc theo ngay muon sach.");
                System.out.println("3. Sap xep ngoi doc theo ngay muon sach.");
                System.out.println("4. In danh sach");
                System.out.println("5. Thong tin muon sach.");
                System.out.println("6. Thong tin tra sach.");
                System.out.println("7. Kiem tra thu vien sach.");
                System.out.println("8. Thoat.");
                System.out.println("Chon chuc nang tu [1-8]");

                    int choice= sc.nextInt();
                    sc.nextLine();
                    switch (choice){
                        case 1:
                            ql.nhapThongTinNguoiDoc();
                            break;
                        case 2:
                            ql.timNguoiTheoNgay();
                            break;
                        case 3:
                            ql.sapXepNguoiDocTheoNgayMuon();
                            break;
                        case 4:
                            ql.inDanhSach();
                            break;
                        case 5:
                            ql.muonSach();
                            break;
                        case 6:
                            ql.traSach();
                            break;
                        case 7:
                            ql.kiemTra();
                            break;
                        case 8:
                            System.out.println("_________THOAT CHUONG TRINH_________");
                            return;
                        default:
                            System.out.println("Lua chon khong hop le!!!");
                    }


            }






    }




}
