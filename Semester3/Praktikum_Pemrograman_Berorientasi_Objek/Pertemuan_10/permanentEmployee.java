public class permanentEmployee extends employee implements PayAble {
    private int salary;

    public permanentEmployee (String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary () {
        return salary;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }

    @Override 
    public int getPaymentAmount() {
        return (int) (salary+0.05*salary);
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo()+"\n";
        info += "registered as permanent employee with salary" +salary+"\n";
        return info;
    }
}
