public class OgretimGorevlisi extends Akademisyen{
    private int kapiNo;

    public OgretimGorevlisi(String fullName, String phone, String email, String bolum, String unvan, int kapiNo) {
        super(fullName, phone, email, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public int getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(int kapiNo) {
        this.kapiNo = kapiNo;
    }
    public void senatoToplanti(){
        System.out.println(this.getFullName() + " senato toplantısı düzenledi.");
    }
    public void sinavYap(){
        System.out.println("MAT101 dersinin sınavını " + this.getFullName() + " yaptı.");
    }


    @Override
    public void derseGir() {
        System.out.println(this.getFullName() + " derse girer. ");
    }
}
