package konto.campus02.erfani;

public class KontoDemoApp {

    public static void main(String[] args) {

        // DemoApp for Konto class
     /* Konto konto1 = new Konto( "Max" );

        konto1.einzahlen( 500 );
        System.out.println( "Kontostand nach Einzahlung, Kontostand: " + konto1.getKontostand() );

        System.out.println( "0€ Auszahlungs Error: ");
        konto1.auszahlen( 0 );

        System.out.println( "Überziehung Error: ");
        konto1.auszahlen( 600 );

        konto1.auszahlen( 300 );
        System.out.println( "Auszahlung erfolgreich!, neuer Kontostand: " + konto1.getKontostand() );*/

        // DemoApp for GiroKonto class
        /*GiroKonto giroKonto = new GiroKonto("Susi", 1_000);
        giroKonto.einzahlen( 1_500 );
        System.out.println("Kontostand: " + giroKonto.getKontostand() );
        giroKonto.auszahlen(200);
        giroKonto.auszahlen(2000);
        giroKonto.auszahlen(700);
        giroKonto.auszahlen(0);
        giroKonto.auszahlen(101);
        giroKonto.auszahlen(5);
        giroKonto.auszahlen( 100 );*/

        // DemoApp for JugendGiroKonto
        JugendGiroKonto jugendGiroKonto = new JugendGiroKonto("John", 1_000, 400);

        jugendGiroKonto.einzahlen(1000);
        jugendGiroKonto.auszahlen(200);
        jugendGiroKonto.auszahlen(600);
        jugendGiroKonto.auszahlen(0);
        jugendGiroKonto.auszahlen(500);






    }
}
