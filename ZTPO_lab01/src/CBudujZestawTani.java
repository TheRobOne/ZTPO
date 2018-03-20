public class CBudujZestawTani extends CBudowniczy {
    @Override
    public void dodajNazwe() {
        KOMP.Nazwa = "TANI";
    }

    @Override
    public void dodajProcesor() {
        KOMP.Procesor = "Celeron";
    }

    @Override
    public void dodajGrafike() {
        KOMP.Grafika = "Intel HD";
    }

    @Override
    public void dodajRAM() {
        KOMP.Ram = 4096;
    }

    @Override
    public void dodajHDD() {
        KOMP.HDD = 256;
    }
}
