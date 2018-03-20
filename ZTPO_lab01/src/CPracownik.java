public class CPracownik {
    private CBudowniczy Budowniczy;

    public void ustawBudowniczy(CBudowniczy B){
        Budowniczy = B;
    }

    public CKomputer zwrocKomputer(){
        Budowniczy.tworzKomputer();
        Budowniczy.dodajNazwe();
        Budowniczy.dodajProcesor();
        Budowniczy.dodajGrafike();
        Budowniczy.dodajRAM();
        Budowniczy.dodajHDD();
        return Budowniczy.zwrocKomputer();
    }
}
