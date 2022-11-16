package javaoop.task04;

public class Circle extends Shape{
    private static final double PI = Math.PI;
    private double R;

    public void setR(double r) {
        R = r;
    }

    @Override
    public double area() {
        return Math.pow(R,2)*PI;
    }
}
