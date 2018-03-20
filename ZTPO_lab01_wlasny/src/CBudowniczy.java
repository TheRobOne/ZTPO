public abstract class CBudowniczy {
    protected CSamochod SAMOCHOD;

    public void budujSamochod(){
        SAMOCHOD = new CSamochod();
    }

    public CSamochod zwrocSamochod(){
        return SAMOCHOD;
    }

    public abstract void dodajNazwe();
    public abstract void dodajNadwozie();
    public abstract void dodajNaped();
    public abstract void dodajKonieMechaniczne();
    public abstract void dodajPojemnoscSilnika();
}
