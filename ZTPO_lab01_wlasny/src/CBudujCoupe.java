public class CBudujCoupe extends CBudowniczy {
    @Override
    public void dodajNazwe() {
        SAMOCHOD.Nazwa = "Sportowy Coupe";
    }

    @Override
    public void dodajNadwozie() {
        SAMOCHOD.Nadwozie = "Coupe";
    }

    @Override
    public void dodajNaped() {
        SAMOCHOD.Naped = "na przednią oś";
    }

    @Override
    public void dodajKonieMechaniczne() {
        SAMOCHOD.KonieMechaniczne = 250;
    }

    @Override
    public void dodajPojemnoscSilnika() {
        SAMOCHOD.PojemnoscSilnika = 2.2;
    }
}
