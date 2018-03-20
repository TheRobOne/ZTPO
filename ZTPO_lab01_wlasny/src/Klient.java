public class Klient {

    public static void main(String[] args) {
        CPracownik PRACOWNIK = new CPracownik();
        CBudowniczy SUV = new CBudujSuv();
        CBudowniczy VAN = new CBudujVan();
        CBudowniczy COUPE = new CBudujCoupe();

        PRACOWNIK.ustawBudowniczy(SUV);
        CSamochod S1 = PRACOWNIK.zwrocSamochod();
        System.out.println(S1);

        PRACOWNIK.ustawBudowniczy(VAN);
        CSamochod S2 = PRACOWNIK.zwrocSamochod();
        System.out.println(S2);

        PRACOWNIK.ustawBudowniczy(COUPE);
        CSamochod S3 = PRACOWNIK.zwrocSamochod();
        System.out.println(S3);
    }
}
