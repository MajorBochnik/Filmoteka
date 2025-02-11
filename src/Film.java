public class Film {
    private String nazev;
    private int rok;
    private int hodnoceni;
    private int pocetH;

    Herec herec [];

    public Film(String nazev, int rok, int hodnoceni, int pocetH) {
        this.nazev = nazev;
        this.rok = rok;
        this.hodnoceni = hodnoceni;
        this.pocetH = pocetH;
        herec = new Herec[pocetH];
    }


    public void setNazev(String nazev) {
        this.nazev = nazev;
    }
    public String getNazev() {
        return nazev;
    }
    public void setRok(int rok) {
        this.rok = rok;
    }
    public int getRok() {
        return rok;
    }
    public void setHodnoceni(int hodnoceni) {
        this.hodnoceni = hodnoceni;
    }
    public int getHodnoceni() {
        return hodnoceni;
    }
    public void setPocetH(int pocetH) {
        this.pocetH = pocetH;
    }
    public int getPocetH() {
        return pocetH;
    }
}
