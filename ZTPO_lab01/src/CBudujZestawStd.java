public class CBudujZestawStd extends CBudowniczy{
    @Override
    public void dodajNazwe() {
        KOMP.Nazwa = "Standardowy";
    }

    @Override
    public void dodajProcesor() {
        KOMP.Procesor = "i3";
    }

    @Override
    public void dodajGrafike() {
        KOMP.Grafika = "NVidia u5310";
    }

    @Override
    public void dodajRAM() {
        KOMP.Ram = 5000;
    }

    @Override
    public void dodajHDD() {
        KOMP.HDD = 1000;
    }
}
