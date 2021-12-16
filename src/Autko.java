
public class Autko extends Pojazd{
    private String kolor;
    private int pojemnosc;

    public Autko(String rodzaj, String marka, String nazwa, int iloscKol, boolean mozeLatac,
                 String kolor, int pojemnosc) {
        super(rodzaj, marka, nazwa, iloscKol, mozeLatac);
        this.kolor = kolor;
        this.pojemnosc = pojemnosc;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    @Override
    public String toString() {
        return super.toString() + kolor + " " + pojemnosc;
    }
}
