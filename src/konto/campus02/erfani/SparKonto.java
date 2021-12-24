package konto.campus02.erfani;

public class SparKonto extends Konto{
    private double tmp = 0;
    public SparKonto( String inhaber ) {
        super( inhaber );
    }

    public void einzahlen( double value ) {
        super.einzahlen(value);
    }

    public void auszahlen( double value ) {
        tmp += value;
        if(tmp > this.kontostand && value != 0) {
            System.out.println("Der Betrag: " + value + ", kann nicht abgebucht werden, Kontostand niedrig");
            tmp -= value;
            System.out.println("Kontostand: " + getKontostand());
        } else {
            super.auszahlen(value);
        }
    }
}
