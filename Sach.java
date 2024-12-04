package QuanLyThuVien;

public class Sach implements Printable{
    protected String tenSach;
    protected String idSach;
    protected boolean trangThai;



    public Sach(String tenSach,String idSach,boolean trangThai){
        this.tenSach=tenSach;
        this.idSach=idSach;
        this.trangThai=false;
    }

    public String getIdSach() {
        return idSach;
    }

    public void setIdSach(String idSach) {
        this.idSach = idSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public void print(){
        System.out.println("Ten sach :"+getTenSach());
        System.out.println("Ma sach :"+getIdSach());
        System.out.println("Da muon : " + (isTrangThai() ?"Yes" : "No"));
    }
}
