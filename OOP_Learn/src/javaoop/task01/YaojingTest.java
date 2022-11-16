package javaoop.task01;

public class YaojingTest {
    public static void main(String[] args) {
        Zhizhujing z = new Zhizhujing();
        z.setAge("1000");
        z.setGender("女");
        z.setName("蜘蛛精01");
        z.showBasicInfo();
        z.eatTangSeng();
        z.buildNet();
        System.out.println("—————————————");
        Baigujing b = new Baigujing();
        b.setAge("2000");
        b.setGender("女");
        b.setName("白骨精01");
        b.showBasicInfo();
        b.eatTangSeng();
        b.beBeauty();
    }
}

