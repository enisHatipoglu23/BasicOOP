public abstract class Memur extends Calisan{
    private String departman;
    private String mesai;

    public Memur(String fullName, String phone, String email, String departman, String mesai) {
            super(fullName, phone, email);
            this.departman = departman;
            this.mesai = mesai;

    }
    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public void calis(){
        System.out.println(this.getFullName() + " memurlar görevlerine başladı. ");
    }

    public abstract void giris(String girisSaati);


}
