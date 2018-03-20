public class CBudujSuv extends CBudowniczy {
    @Override
    public void dodajNazwe() {
        SAMOCHOD.Nazwa = "Duży SUV";
    }

    @Override
    public void dodajNadwozie() {
        SAMOCHOD.Nadwozie = "SUV";
    }

    @Override
    public void dodajNaped() {
        SAMOCHOD.Naped = "4x4";
    }

    @Override
    public void dodajKonieMechaniczne() {
        SAMOCHOD.KonieMechaniczne = 300;
    }

    @Override
    public void dodajPojemnoscSilnika() {
        SAMOCHOD.PojemnoscSilnika = 3.5;
    }
}
