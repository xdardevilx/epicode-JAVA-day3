package esercizio1;

public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;

    }

    public static double perimetro(double base, double altezza) {
        return 2 * (base + altezza);
    }

    public static double area(double base, double altezza) {
        return base * altezza;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    @Override
    public String toString() {
        return "{" +
            " base='" + getBase() + "'" +
            ", altezza='" + getAltezza() + "'" +
            "}";
    }

}
