
public class Rower extends Pojazd{
    private String type;
    private String naIleOsob;

    public Rower(String rodzaj, String marka, String nazwa, int iloscKol, boolean mozeLatac,
                 String type, String naIleOsob) {
        super(rodzaj, marka, nazwa, iloscKol, mozeLatac);
        this.type = type;
        this.naIleOsob = naIleOsob;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNaIleOsob() {
        return naIleOsob;
    }

    public void setNaIleOsob(String naIleOsob) {
        this.naIleOsob = naIleOsob;
    }

    public String toString(){
        return getRodzaj() + " " + getMarka() + " " + getNazwa() + " " + getIloscKol() +
                " " + isMozeLatac() + " " + type + " " + naIleOsob;
    }
}
