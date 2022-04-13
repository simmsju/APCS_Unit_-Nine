public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        super();
        length = 10;
        width = 10;
    }

    public  Rectangle(double l, double w, String c, boolean f) {
        super(c, f);
        length = l;
        width = w;
    }

//    public double getArea() {
//
//    }
//
//    public double getPerimeter() {
//
//    }
}
