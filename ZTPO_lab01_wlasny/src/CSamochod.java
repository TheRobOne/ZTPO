public class CSamochod {
    String Nazwa = "";
    String Nadwozie = "";
    String Naped = "";
    Integer KonieMechaniczne = 0;
    Double PojemnoscSilnika = 0.;

    public void setNazwa(String nazwa) {
        this.Nazwa = nazwa;
    }

    public void setNadwozie(String nadwozie) {
        this.Nadwozie = nadwozie;
    }

    public void setNaped(String naped) {
        this.Naped = naped;
    }

    public void setKonieMechaniczne(Integer konieMechaniczne) {
        this.KonieMechaniczne = konieMechaniczne;
    }

    public void setPojemnoscSilnika(Double pojemnoscSilnika) {
        this.PojemnoscSilnika = pojemnoscSilnika;
    }

    public String toString(){
        return "Samochód: Nazwa: " + Nazwa + "\nNadwozie: " + "\nNaped: " + Naped + "\nKonie mechaniczne: " + KonieMechaniczne + "\nPojemnoscSilnika: " + PojemnoscSilnika + "\n\n\n";
    }
}
