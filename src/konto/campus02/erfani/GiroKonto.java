package konto.campus02.erfani;

public class GiroKonto extends Konto{
    protected double limit;

    public GiroKonto( String inhaber, double limit ) {
        super( inhaber );
        this.limit = limit;
    }

    public void einzahlen( double value ) {
        this.kontostand += value;
    }

    public void auszahlen( double value ) {
        if( value != 0 ) {
            if( value < this.kontostand ) {
                if( value >= this.limit ) {
                    System.out.println( "Auszahlung nicht möglich, Limit überschritten." );
                } else {
                    this.kontostand -= value;
                }
            } else {
                System.out.println( "Auszahlung nicht möglich, Kontostand niedrig." );
            }
        }
    }
}
