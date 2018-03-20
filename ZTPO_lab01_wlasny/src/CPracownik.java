public class CPracownik {
    private CBudowniczy Budowniczy;

    public void ustawBudowniczy(CBudowniczy B){
        Budowniczy = B;
    }

    public CSamochod zwrocSamochod(){
        Budowniczy.budujSamochod();
        Budowniczy.dodajNazwe();
        Budowniczy.dodajNadwozie();
        Budowniczy.dodajNaped();
        Budowniczy.dodajKonieMechaniczne();
        Budowniczy.dodajPojemnoscSilnika();
        return Budowniczy.zwrocSamochod();
    }
}
