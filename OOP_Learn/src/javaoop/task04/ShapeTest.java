package javaoop.task04;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        circle.setR(10);
        System.out.println("圆的面积是："+circle.area());

        square.setLength(10);
        square.setWidth(20);
        System.out.println("方形的面积是："+square.area());

        triangle.setBase(8);
        triangle.setHeight(4);
        System.out.println("三角形的面积是："+triangle.area());
    }
}
