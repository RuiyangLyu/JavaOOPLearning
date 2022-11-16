public class HourlyEmployee extends Employee {

    public HourlyEmployee(String name, int birthMonth) {
        super(name, birthMonth);
    }

    private double hourPay;
    private double hours;

    public void setHourPay(double hourPay) {
        this.hourPay = hourPay;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHourPay() {
        return hourPay;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double getSalary(int month) {
        if (hours<160){
            return hours*hourPay+super.getSalary(month);
        }
        else {
            return 160*hourPay+(hours-160)*hourPay*1.5+super.getSalary(month);
        }
    }
}
