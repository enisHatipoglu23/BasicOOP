public abstract class Calisan {
    private String fullName;
    private String phone;
    private String email;

    public Calisan(String fullName, String phone, String email){
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
    }

    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void giris(){
        System.out.println(this.fullName + " giriş yaptı. ");
    }

    public void cikis(){
        System.out.println(this.fullName + " çıkış yaptı. ");
    }

    public void yemekhane(){
        System.out.println(this.fullName + " yemekhaneye giriş yaptı. ");
    }

    public static void girisYapanlar(Calisan[] loginUsers){
        for (Calisan c:loginUsers) {
            c.giris();
        }
    }

}
