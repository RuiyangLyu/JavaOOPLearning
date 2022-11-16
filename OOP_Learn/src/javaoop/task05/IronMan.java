package javaoop.task05;

public class IronMan implements Swin,RideBike,Running{
    @Override
    public void ridebike() {
        System.out.println("我在骑车");
    }

    @Override
    public void swin() {
        System.out.println("我在游泳");
    }

    @Override
    public void running() {
        System.out.println("我在长跑");
    }
}
