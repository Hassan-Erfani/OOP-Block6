package konto.campus02.erfani;

public class KontoDemoApp {

    public static void main(String[] args) {

        Konto konto1 = new Konto( "Max" );

        konto1.einzahlen( 500 );
        System.out.println( "Kontostand nach Einzahlung, Kontostand: " + konto1.getKontostand() );

        System.out.println( "0€ Auszahlungs Error: ");
        konto1.auszahlen( 0 );

        System.out.println( "Überziehung Error: ");
        konto1.auszahlen( 600 );

        konto1.auszahlen( 300 );
        System.out.println( "Auszahlung erfolgreich!, neuer Kontostand: " + konto1.getKontostand() );
    }
}