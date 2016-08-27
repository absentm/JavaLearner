package test06;

/**
 * Triangle
 * Created by dm on 16-8-22.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.setSide(a, b, c);
    }

    public void setSide(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a || a <= 0 || b <= 0 || c <= 0) {
            System.out.println("error!");
            return;
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calPerimeter() {
        return a + b + c;
    }

    @Override
    public String getShapeType() {
        return getColor() + " , Triangle";
    }
}
