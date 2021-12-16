
public class Pojazd {
    private String rodzaj;
    private String marka;
    private String nazwa;
    private int iloscKol;
    private boolean mozeLatac;

    public Pojazd(String rodzaj, String marka, String nazwa, int iloscKol, boolean mozeLatac) {
        this.rodzaj = rodzaj;
        this.marka = marka;
        this.nazwa = nazwa;
        this.iloscKol = iloscKol;
        this.mozeLatac = mozeLatac;
    }

    public Pojazd() {
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIloscKol() {
        return iloscKol;
    }

    public void setIloscKol(int iloscKol) {
        this.iloscKol = iloscKol;
    }

    public boolean getMozeLatac() {
        return mozeLatac;
    }

    public void setMozeLatac(boolean mozeLatac) {
        this.mozeLatac = mozeLatac;
    }

    public String toString(){
        String latanie = "";
        if(!mozeLatac){
            latanie = "Nie, nie można nim laać.";
        } else {
            latanie = "Tak, ten pojazd lata.";
        }
        return rodzaj + " " + marka + " " + nazwa + " " + iloscKol + " " + latanie;
    }
}
