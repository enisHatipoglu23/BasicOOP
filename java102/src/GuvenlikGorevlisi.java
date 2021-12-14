public class GuvenlikGorevlisi extends Memur{
    private String belge;

    public GuvenlikGorevlisi(String fullName, String phone, String email, String departman, String mesai, int i) {
        super(fullName, phone, email, departman, mesai);
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

    public void nobet(){
        System.out.println(this.getFullName() + " nobet tuttu. ");
    }

    @Override
    public void giris(String saat){
        System.out.println(this.getFullName() + " " + saat + " inde giriş yaptı. ");
    }
}
