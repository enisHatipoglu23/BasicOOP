public class Asistan extends Akademisyen{
    private String ofisSaati;

    public Asistan(String fullName, String phone, String email, String bolum, String unvan, String ofisSaati) {
        super(fullName, phone, email, bolum, unvan);
        this.ofisSaati = ofisSaati;
    }

    public String getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }
    public void quizYap(){
        System.out.println(this.getFullName() + " quiz yaptı. ");
    }

    @Override
    public void derseGir() {
        System.out.println(this.getFullName() + " derse girer. ");
    }
}
