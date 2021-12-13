package konto.campus02.erfani;

public class GiroKonto extends Konto{
    protected double limit;

    public GiroKonto( String inhaber, double limit ) {
        super( inhaber );
        this.limit = limit;
    }

    public void einzahlen( double value ) {

    }

    public void auszahlen( double value ) {

    }

}
