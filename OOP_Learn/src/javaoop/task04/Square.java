package javaoop.task04;

public class Square extends Shape{
    private double Length;
    private double Width;

    public void setLength(double length) {
        Length = length;
    }

    public void setWidth(double width) {
        Width = width;
    }

    @Override
    public double area() {
        return Width*Length;
    }
}
