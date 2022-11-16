package javaoop.task04;

public class Triangle extends Shape{
    private double base;
    private double height;

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
