public class Main {
    public static void main(String[] args) {


        OgretimGorevlisi og1 = new OgretimGorevlisi("alfred", "12345", "dadada.dev", "makine", "ogr gor", 43);
        Asistan as = new Asistan("asis", "1234567", "rererer.dev", "cs", "asistan", "3");
        LabAsistani labas = new LabAsistani("labas", "987654", "rererara.dev", "ybs", "lab asistanı", "4:40");

        GuvenlikGorevlisi gv1 = new GuvenlikGorevlisi("guvenli", "12345", "dadada.dev", "makine", "ogr gor", 43);

        og1.derseGir();
        gv1.giris("10:00");



    }
}