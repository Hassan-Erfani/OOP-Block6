package konto.campus02.erfani;

public class Konto {
    protected String inhaber;
    protected double kontostand;

    public Konto( String inhaber ) {
        this.inhaber = inhaber;
        this.kontostand = 0.00;
    }

    public void einzahlen( double value ) {
        this.kontostand += value;
    }

    public void auszahlen( double value ) {
        if( value == 0 ) {
            System.out.println( "Bitte geben Sie einen Betrag größer als 0 ein." );
        }
            if( value < this.kontostand ) {
                this.kontostand -= value;
            } else {
                System.out.println( "Eine Auszahlung von " + value + " nicht möglichAuszahlung nicht möglich, Kontostand niedrig." );
            }
    }

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber( String inhaber ) {
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
