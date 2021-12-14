
public class Rower extends Pojazd{
    private int naIleOsob;

    public Rower(String rodzaj, String marka, String nazwa, int iloscKol, boolean mozeLatac, int naIleOsob) {
        super(rodzaj, marka, nazwa, iloscKol, mozeLatac);
        this.naIleOsob = naIleOsob;
    }

    public int getNaIleOsob() {
        return naIleOsob;
    }

    public void setNaIleOsob(int naIleOsob) {
        this.naIleOsob = naIleOsob;
    }

    @Override
    public String toString() {
        return getRodzaj() + " " + getMarka() + " " + getNazwa() + " " + getIloscKol() + " " +
                isMozeLatac() + " " + naIleOsob;
    }
}
