public class Trapeziod {

    private double a;
    private double b;
    private double h;

    public Trapeziod(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double area() {
        return ((a + b) / 2) * h;
    }
}
