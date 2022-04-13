public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        radius = 10;
    }

    public Circle(double r, String c, boolean f) {
        super(c, f);
        radius = r;
    }

    public double getDiameter() {
        return radius*2;
    }

    public double getCircumference() {
        return 2*3.14159*radius;
    }

    public double getArea() {
        return 3.14159*Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "This circle has a radius of " + radius + ". It is " + getColor() + "and filled is " + getFilled();
    }
}
