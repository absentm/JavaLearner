package test6;

/**
 * abstract class, template model
 * Created by dm on 16-8-22.
 */
public abstract class Shape {
    // init block
    {
        System.out.println("In abstract Shape init!");
    }

    // private type val
    private String color;

    // abstract method to compute perimeter
    public abstract double calPerimeter();

    // abstract method to get shape type
    public abstract String getShapeType();

    // constructor use to be called by sub class
    public Shape() {
    }

    public Shape(String color) {
        System.out.println("In Shape constructor　init!");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
