package konto.campus02.erfani;

public class GiroKonto extends Konto{
    protected double limit;
    private double tmp = 0;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    public void einzahlen(double value) {
        super.einzahlen(value);
    }

    public void auszahlen(double value) {
        // limit check
        if (value > this.limit) {
            System.out.println("Der Betrag: " + value + ", kann nicht abgebucht werden, Limit überschritten");
            return;
        }

        tmp += value;

        // check if tmp has reached the limit
        if (tmp <= this.limit) {
            super.auszahlen(value);
        } else {
            tmp -= value;
            System.out.println("Der Betrag: " + value + ", kann nicht abgebucht werden, Limit überschritten");
        }
    }
}