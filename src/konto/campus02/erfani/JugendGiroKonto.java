package konto.campus02.erfani;

public class JugendGiroKonto extends GiroKonto{

    private double buchungslimit;

    public JugendGiroKonto( String inhaber, double limit, double buchungslimit ) {
        super( inhaber, limit );
        this.buchungslimit = buchungslimit;
    }

    public void einzahlen( double value ) {

    }

    public void auszahlen( double value ) {

    }
}
