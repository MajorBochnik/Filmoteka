public class Film {
    private String nazev;
    private int rok;
    private int hodnoceni;
    private int pocetH;

    private Herec herci [];

    public Film(String nazev, int rok, int hodnoceni, Herec [] herci) {
        this.nazev = nazev;
        this.rok = rok;
        this.hodnoceni = hodnoceni;
        this.herci = herci;
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
    public Herec[] getHerci() {
        return herci;
    }
    public void setHerci(Herec[] herci) {
        this.herci = herci;
    }

    public void vypisHerce() {
        for (int i = 0; i < herci.length; i++) {
            System.out.println(herci[i].getJmeno());
        }
    }
}
