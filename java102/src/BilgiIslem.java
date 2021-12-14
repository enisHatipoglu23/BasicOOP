public class BilgiIslem extends Memur{
    private String gorev;

    public BilgiIslem(String fullName, String phone, String email, String departman, String mesai, String gorev){
        super(fullName,phone,email,departman,mesai);
        this.gorev = gorev;
    }

    public String getGorev(){
        return this.gorev;
    }
    public void setGorev(String gorev){
        this.gorev = gorev;
    }

    public void networkKurulum(){
        System.out.println(this.getFullName() + " tarafından network kurlumu oluşturuldu. ");
    }
    @Override
    public void giris(String saat){
        System.out.println(this.getFullName() + " " + saat + " inde giriş yaptı. ");
    }
}
