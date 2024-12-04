package QuanLyThuVien;

public class Person implements Printable {
    protected String hoVaTen;
    protected String SDT;
    protected String email;

    public Person(String hoVaTen,String SDT,String email){
        this.hoVaTen=hoVaTen;
        this.SDT=SDT;
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

   @Override
    public void print(){
       System.out.println("Ten :"+getHoVaTen());
       System.out.println("SDT :"+getSDT());
       System.out.println("Email :"+getEmail());
   }
}
