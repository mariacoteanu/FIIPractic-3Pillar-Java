package training2.optional.inheritance;

import static java.lang.Math.PI;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*PI;
    }

    public double getPerimeter(){
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius +", which is a subclass of " + super.toString();
    }
}
