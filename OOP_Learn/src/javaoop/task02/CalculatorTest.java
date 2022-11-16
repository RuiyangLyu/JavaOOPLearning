package javaoop.task02;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator Cal = new Calculator();
        Cal.add();
        System.out.println(Cal.add(1, 2));
        System.out.println(Cal.add("str1", "str2"));
    }

}
