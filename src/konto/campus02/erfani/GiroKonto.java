package konto.campus02.erfani;

public class GiroKonto extends Konto{
    protected double limit;
    private double tmp = 0;

    public GiroKonto( String inhaber, double limit ) {
        super( inhaber );
        this.limit = limit;
    }

    public void einzahlen( double value ) {
        System.out.println("Der Betrag: " + value + ", wurde gutgeschrieben");
        this.kontostand += value;
    }

    public void auszahlen( double value ) {

                    // check if value != 0
                    if( value == 0 ) {
                        System.out.println( "Auszahlung nicht möglich bitte geben Sie einen Betrag größer als 0 ein." );
                        // TODO 0 value needs to modified -> the App withdraw 0 value as well
                    }

                    // check if value is less than limit and save the limit in tmp
                    if ( value <= this.limit && tmp < this.limit) {
                        tmp += value;}
                    // check if all transactions has reached the limit
                    if ( tmp < this.limit ) {
                        // check if value is less than balance
                        if( value <= this.kontostand && value != 0 ) {
                            this.kontostand -= value;
                            System.out.println( "Der Betrag: " + value + " wurde erfolgreich abgebucht" );
                            System.out.println( "Kontostand: " + this.kontostand ) ;
                        } else {
                            System.out.println( "Eine Auszahlung von " + value + " nicht möglich, Kontostand niedrig" );
                        }
                    } else {
                        tmp -= value;
                        System.out.println( "Der Betrag: " + value + ", kann nicht abgebucht werden, Limit überschritten" );
                    }




    }
}
