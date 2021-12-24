package konto.campus02.erfani;

public class Konto {
    protected String inhaber;
    protected double kontostand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
        this.kontostand = 0.00;
    }

    public void einzahlen(double value) {
        this.kontostand += value;
        System.out.println("Der Betrag: " + value + ", wurde gutgeschrieben");
        System.out.println("Kontostand: " + getKontostand());
    }

    public void auszahlen(double value) {
        if(value == 0) {
            System.out.println("Bitte geben Sie einen Betrag größer als 0 ein.");
            return;
        }

        this.kontostand -= value;
        System.out.println("Der Betrag: " + value + " wurde erfolgreich abgebucht");
        System.out.println("Kontostand: " + this.getKontostand());

    }

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand( double kontostand ) {
        this.kontostand = kontostand;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }
}
