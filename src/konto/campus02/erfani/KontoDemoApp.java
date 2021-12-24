package konto.campus02.erfani;

public class KontoDemoApp {

    public static void main(String[] args) {

        // DemoApp for Konto class
     /* Konto konto1 = new Konto( "Max" );

        konto1.einzahlen( 500 );

        konto1.auszahlen( 0 );
        konto1.auszahlen( 1600 );*/


        // DemoApp for GiroKonto class
        GiroKonto giroKonto = new GiroKonto("Susi", 1_000);
        giroKonto.einzahlen( 1_500 );

        giroKonto.auszahlen(200);
        giroKonto.auszahlen(2000);
        giroKonto.auszahlen(700);
        giroKonto.auszahlen(0);
        giroKonto.auszahlen(101);
        giroKonto.auszahlen(5);
        giroKonto.auszahlen( 100 );

        // DemoApp for JugendGiroKonto
      /*  JugendGiroKonto jugendGiroKonto = new JugendGiroKonto("John", 1_000, 400);

        jugendGiroKonto.einzahlen(1000);
        jugendGiroKonto.auszahlen(200);
        jugendGiroKonto.auszahlen(600);
        jugendGiroKonto.auszahlen(0);
        jugendGiroKonto.auszahlen(500);*/






    }
}
