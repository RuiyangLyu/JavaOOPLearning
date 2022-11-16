public class Main {
    public static void main(String[] args) {

        SalariedEmployee a=new SalariedEmployee("月薪",7);
        HourlyEmployee b=new HourlyEmployee("时薪",10);
        BasePlusSalesEmployee c=new BasePlusSalesEmployee("提成",1);

        a.setSalary(2000);
        System.out.println( a.getName()+":\n月薪"+a.getSalary(7));

        b.setHours(200);
        b.setHourPay(20);
        System.out.println(b.getName()+":\n月薪"+b.getSalary(11));

        c.setBase(1500);
        c.setCommissionRate(0.05);
        c.setSales(20000);
        System.out.println(c.getName()+":\n月薪"+c.getSalary(1));

    }
}