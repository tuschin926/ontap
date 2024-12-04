package QuanLyThuVien;

public class NguoiDoc extends Person{
    protected String idSV;
    protected String ngayMuon;
    protected String ngayTra;

    public NguoiDoc(String hoVaTen, String email, String SDT, String idSV){
        super(hoVaTen,email,SDT);
        this.idSV=idSV;
    }

    public NguoiDoc(String hoVaTen, String email, String SDT, String idSV, String ngayMuon,String ngayTra){
        super(hoVaTen,email,SDT);
        this.idSV=idSV;
        this.ngayMuon=ngayMuon;
        this.ngayTra=ngayTra;
    }

    public String getIdSV() {
        return idSV;
    }

    public void setIdSV(String idSV) {
        this.idSV = idSV;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Ma sinh vien :"+getIdSV());
        System.out.println("Ngay muon :"+getNgayMuon());
        System.out.println("Ngay tra :"+getNgayTra());

    }

}
