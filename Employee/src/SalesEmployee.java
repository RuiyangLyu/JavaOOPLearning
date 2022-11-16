public class SalesEmployee extends Employee{
    private double sales;
    private double commissionRate;

    public SalesEmployee(String name, int birthMonth) {
        super(name, birthMonth);
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getSales() {
        return sales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double getSalary(int month) {
        return getSales()*getCommissionRate()+super.getSalary(month);
    }
}
