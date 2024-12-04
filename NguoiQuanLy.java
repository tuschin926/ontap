package QuanLyThuVien;

public class NguoiQuanLy extends Person {
    protected String CCCD;

    public NguoiQuanLy(String hoVaTen, String SDT, String email, String CCCD){
        super(hoVaTen, SDT, email);
        this.CCCD=CCCD;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }
    @Override
    public  void print(){
        super.print();
        System.out.println("So CCCD :"+getCCCD());
    }

}
