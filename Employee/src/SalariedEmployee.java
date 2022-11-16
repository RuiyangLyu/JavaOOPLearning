public class SalariedEmployee extends Employee {

    public SalariedEmployee(String name, int birthMonth) {
        super(name, birthMonth);
    }

    private double salary = 2000;

    @Override
    public double getSalary(int month) {
        return super.getSalary(month) + salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
