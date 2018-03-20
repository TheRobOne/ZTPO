public class K1Budowniczy {

    public static void main(String[] args){
        CPracownik PRACOWNIK = new CPracownik();
        CBudowniczy BTANI = new CBudujZestawTani();
        CBudowniczy BMAXI = new CBudujZestawMax();
        CBudowniczy BSTD = new CBudujZestawStd();
        PRACOWNIK.ustawBudowniczy(BTANI);
        CKomputer K1 = PRACOWNIK.zwrocKomputer();
        System.out.println(K1);

        PRACOWNIK.ustawBudowniczy(BMAXI);
        CKomputer K2 = PRACOWNIK.zwrocKomputer();
        System.out.println(K2);

        PRACOWNIK.ustawBudowniczy(BSTD);
        CKomputer K3 = PRACOWNIK.zwrocKomputer();
        System.out.println(K3);

    }
}
