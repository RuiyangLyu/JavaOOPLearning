public class Employee {
    private String name;
    private int birthMonth;

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, int birthMonth) {
        this.name = name;
        this.birthMonth = birthMonth;
    }


    public double getSalary(int month) {
        if (month == this.birthMonth) {
            return 100;
        } else {
            return 0;
        }
    }
}

