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

            // check if value is less than limit and save the limit in tmp
            if (value <= this.limit && tmp < this.limit) {
                tmp += value;
            }
            // check if all transactions has reached the limit
            if (tmp < this.limit) {
                // check if value is less than balance
              super.auszahlen(value);
            } else {
                tmp -= value;
                System.out.println("Der Betrag: " + value + ", kann nicht abgebucht werden, Limit überschritten");
            }
    }
}
