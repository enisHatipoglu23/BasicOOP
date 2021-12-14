public class LabAsistani extends Asistan{
    public LabAsistani(String fullName, String phone, String email, String bolum, String unvan, String ofisSaati) {
        super(fullName, phone, email, bolum, unvan, ofisSaati);
    }

   public void labaGir(){
       System.out.println(this.getFullName() + " lablara giriyor. ");
   }


}
