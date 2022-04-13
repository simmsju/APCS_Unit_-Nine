public class Triangle extends Shape {

    private double side1, side2, side3;

    public Triangle() {
        super();
        side1 = 2.0;
        side2 = 2.0;
        side3 = 2.0;
    }

    public Triangle(double side1, double side2, double side3, String c, boolean f) {
        super(c, f);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        return (side1 * side2) / 2;
    }

    public double getPerimeter() {
       return side1 + side2 + side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "This triangle has three sides of lengths " + side1 + ", " + side2 + ", " + side3 + ". It is " + getColor() + "and filled is " + getFilled();
    }
}
