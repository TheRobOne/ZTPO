public class CKomputer {

    String Nazwa = "";
    String Procesor = "";
    String Grafika = "";
    Integer Ram = 0;
    Integer HDD = 0;

    public void setNazwa(String Nazwa) {
        this.Nazwa = Nazwa;
    }

    public void setProcesor(String procesor) {
        this.Procesor = procesor;
    }

    public void setGrafika(String grafika) {
        this.Grafika = grafika;
    }

    public void setRam(Integer ram) {
        this.Ram = ram;
    }

    public void setHDD(Integer HDD) {
        this.HDD = HDD;
    }

    public String toString() {
        return "KOMPUTER: Nazwa: " + Nazwa + "\nProcesor: " + Procesor + "\nGrafika: " + Grafika + "\nRAM: " + Ram + "HDD: " + HDD;
    }
}
