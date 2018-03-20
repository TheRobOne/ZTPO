public abstract class CBudowniczy {
    protected CKomputer KOMP;
    public void tworzKomputer(){
        KOMP = new CKomputer();
    }

    public CKomputer zwrocKomputer(){
        return KOMP;
    }

    public abstract void dodajNazwe();
    public abstract void dodajProcesor();
    public abstract void dodajGrafike();
    public abstract void dodajRAM();
    public abstract void dodajHDD();
}
