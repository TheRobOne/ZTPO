public class CBudujVan extends CBudowniczy {
    @Override
    public void dodajNazwe() {
        SAMOCHOD.Nazwa = "Rodzinny VAN";
    }

    @Override
    public void dodajNadwozie() {
        SAMOCHOD.Nadwozie = "VAN";
    }

    @Override
    public void dodajNaped() {
        SAMOCHOD.Naped = "na tylną oś";
    }

    @Override
    public void dodajKonieMechaniczne() {
        SAMOCHOD.KonieMechaniczne = 100;
    }

    @Override
    public void dodajPojemnoscSilnika() {
        SAMOCHOD.PojemnoscSilnika = 1.4;
    }
}
