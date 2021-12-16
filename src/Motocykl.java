
public class Motocykl extends Pojazd{

    private String przeznaczenie;

    public Motocykl(String rodzaj, String marka, String nazwa, int iloscKol, boolean mozeLatac,
                    String przeznaczenie) {
        super(rodzaj, marka, nazwa, iloscKol, mozeLatac);
        this.przeznaczenie = przeznaczenie;
    }

    public String getPrzeznaczenie() {
        return przeznaczenie;
    }

    public void setPrzeznaczenie(String przeznaczenie) {
        this.przeznaczenie = przeznaczenie;
    }

    @Override
    public String toString() {
        return super.toString() + przeznaczenie;
    }
}
