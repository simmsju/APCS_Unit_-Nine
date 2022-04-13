public class Shape {
    private String color;
    private boolean filled;


    public Shape() {
        color = "white";
        filled = false;
    }


    public Shape(String c, boolean f) {
        color = c;
        filled = f;
    }


    public String getColor() {
        return color;
    }


    public boolean getFilled() {
        return filled;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    public String toString() {
        return "The shape is " + color + " and filled is " + filled + ".";
    }
}