package konto.campus02.erfani;

public class JugendGiroKonto extends GiroKonto{

    private double buchungslimit;

    public JugendGiroKonto( String inhaber, double limit, double buchungslimit ) {
        super( inhaber, limit );
        this.buchungslimit = buchungslimit;
    }

    public void einzahlen( double value ) {
        super.einzahlen(value);
    }

    public void auszahlen( double value ) {
        if (value <= buchungslimit) {
            super.auszahlen(value);
        } else {
            System.out.println("Der Betrag: " + value + " kann nicht abgebucht werden, Buchungslimit überschritten");
        }

    }
}
