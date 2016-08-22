package test6;

/**
 * Circle
 * Created by dm on 16-8-22.
 */
public class Circle extends Shape {
    private double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    @Override
    public double calPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String getShapeType() {
        return getColor() + ", Circle";
    }
}
