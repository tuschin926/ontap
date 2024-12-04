package QuanLyThuVien;

import java.text.SimpleDateFormat;
import java.util.*;

public class QuanLyThuVien {
    static Scanner sc=new Scanner(System.in);
    private static List<NguoiDoc> danhSachNguoiDoc;
    private List<Sach> danhSachSach;

    public QuanLyThuVien(){
        this.danhSachNguoiDoc=new ArrayList<>();
        this.danhSachSach=new ArrayList<>();
        danhSachSach.add(new Sach("HILO","123if",false));
        danhSachSach.add(new Sach("Cuc Ha","ab54",false));
        danhSachSach.add(new Sach("Java","10a",false));
        danhSachSach.add(new Sach("c++","10b",false));
        danhSachSach.add(new Sach("Giai Tich","10c",false));
        danhSachSach.add(new Sach("CO SO DU LIEU","10AB",false));


    }



    public static void nhapThongTinNguoiDoc(){
        System.out.println("<<<Nhap thong tin nguoi doc>>>");
        System.out.println("Nhap ten sinh vien: ");
        String hoVaTen= sc.nextLine();
        System.out.println("Nhap so dien thoai sinh vien: ");
        String SDT =sc.nextLine();
        System.out.println("Nhap email sinh vien: ");
        String email=sc.nextLine();
        System.out.println("Nhap ma sinh vien: ");
        String idSV=sc.nextLine();
        NguoiDoc nguoiDoc= new NguoiDoc(hoVaTen,email,SDT,idSV);
        danhSachNguoiDoc.add(nguoiDoc);
        System.out.println("Da them thanh cong nguoi doc.");
    }


    public void muonSach(){
        System.out.println("Nhap id sinh vien :");
        String idSV =sc.nextLine();
        NguoiDoc nguoiDoc = timNguoiDocTheoId(idSV);

        if(nguoiDoc == null){
            System.out.println("KHONG TIM THAY MA SINH VIEN TREN!!");
            return;
        }
        System.out.println("Nhap ngay muon sach:");
        String ngayMuon=sc.nextLine();
        nguoiDoc.setNgayMuon(ngayMuon);

        String a = "Co";
        while(a.equalsIgnoreCase("Co")){
            System.out.println("Nhap ten sach muon muon :");
            String tenSach= sc.nextLine();
            Sach sachMuon= timSachTheoTen(tenSach);
            if(sachMuon==null){
                System.out.println("Sach voi ten"+sachMuon+" khong tim thay !!");
            } else if (sachMuon.isTrangThai()) {
                System.out.println("Sach "+sachMuon.getTenSach()+" da duoc muon roi!!");
            }else{
                sachMuon.setTrangThai(true);
                System.out.println("Sach "+sachMuon.getTenSach()+" da duoc "+nguoiDoc.getHoVaTen()+" muon thanh cong vao ngay "+ ngayMuon);
            }
            System.out.println("Ban muon muon them sach khong ?? Co  || Khong ");
            a=sc.nextLine();

        }

    }


    public void traSach(){
        System.out.println("Nhap id sinh vien muon tra sach :");
        String idSV = sc.nextLine();
        NguoiDoc nguoiDoc = timNguoiDocTheoId(idSV);
        if(nguoiDoc == null){
            System.out.println("KHONG TIM THAY MA SINH VIEN TREN!!");
            return;
        }
        System.out.println("Nhap ngay tra sach:");
        String ngayTra=sc.nextLine();
        nguoiDoc.setNgayTra(ngayTra);
        String a = "Co";
        while(a.equalsIgnoreCase("Co")) {
            System.out.println("Nhap ten sach muon tra: ");
            String tenSach = sc.nextLine();
            Sach sachTra= timSachTheoTen(tenSach);
            if(sachTra==null){
                System.out.println("Khong tim thay sach tren!!");
            } else if (!sachTra.isTrangThai()) {
                System.out.println("Co nham lan !! sach tren chua duoc muon.");
            }else{
                sachTra.setTrangThai(false);
                System.out.println("Sach "+sachTra.getTenSach()+" da duoc "+nguoiDoc.getHoVaTen()+" tra vao ngay "+ngayTra);
            }
            System.out.println("Ban muon tra them sach khong ??( Co / Khong");
            a=sc.nextLine();


        }

    }

    public void timNguoiTheoNgay(){
        System.out.println("Ngay ngay muon hoac ngay tra sach.");
        String ngay= sc.nextLine();
        boolean timThay =false;

        for(NguoiDoc nguoiDoc :danhSachNguoiDoc){
            if( (nguoiDoc.getNgayTra() != null && nguoiDoc.getNgayTra().equals(ngay)) ||
                    (nguoiDoc.getNgayMuon() != null && nguoiDoc.getNgayMuon().equals(ngay))){
                nguoiDoc.print();
                timThay=true;
            }
        }
        if(!timThay){
            System.out.println("Khong tim thay nguoi doc voi ngay tren !!");
        }

    }

    public void sapXepNguoiDocTheoNgayMuon(){
        danhSachNguoiDoc.sort((nd1, nd2) -> {
            String ngay1 = nd1.getNgayMuon();
            String ngay2 = nd2.getNgayMuon();
            if (ngay1 == null || ngay2 == null) return 0; // Không so sánh nếu ngày null
            return ngay1.compareTo(ngay2);
        });

        System.out.println("<<<Danh sach nguoi doc sap xep theo ngay muon>>>");
        for(NguoiDoc nguoiDoc: danhSachNguoiDoc){
            nguoiDoc.print();
            System.out.println("___________________________");
        }
        System.out.println("Đã sắp xếp danh sách người đọc theo ngày mượn!");
    }

    public void inDanhSach(){
        System.out.println("<<DANH SACH NGUOI DOC>>");
        for(NguoiDoc nguoiDoc :danhSachNguoiDoc){
            nguoiDoc.print();
            System.out.println("----------------");
        }
        System.out.println("<<DANH SACH SACH>>");
        for(Sach sach: danhSachSach){
            sach.print();
            System.out.println("----------------");
        }
    }


    public void kiemTra(){
        System.out.println("<<<Danh sach sach da duoc muon>>>");
        for(Sach sach :danhSachSach){
            if(sach.isTrangThai()){
                sach.print();
                System.out.println("..................");

            }
        }

        System.out.println("<<<Danh sach sach chua duoc muon>>>");
        for(Sach sach :danhSachSach){
            if(!sach.isTrangThai()){
                sach.print();
                System.out.println("..................");
            }
        }
    }


    public NguoiDoc timNguoiDocTheoId( String idSV){
        for(NguoiDoc nguoiDoc :danhSachNguoiDoc){
            if(nguoiDoc.getIdSV().equals(idSV)){
                return nguoiDoc;
            }
        }
        return null;

    }

    public Sach timSachTheoTen( String tenSach){
        for(Sach sach :danhSachSach){
            if(sach.getTenSach().equalsIgnoreCase(tenSach)){
                return sach;
            }
        }
        return null;
    }





}
