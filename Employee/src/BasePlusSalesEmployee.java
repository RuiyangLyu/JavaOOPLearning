public class BasePlusSalesEmployee extends SalesEmployee{

    public BasePlusSalesEmployee(String name, int birthMonth) {
        super(name, birthMonth);
    }
    private double base;

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double getSalary(int month) {
        return base+super.getSalary(month);
    }
}
