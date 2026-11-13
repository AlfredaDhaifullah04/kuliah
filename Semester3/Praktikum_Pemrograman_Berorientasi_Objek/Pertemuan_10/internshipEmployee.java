public class internshipEmployee extends employee implements PayAble {
    private int length;
    
    public internshipEmployee(String name, int length) {
        this.length = length;
        this.name = name;
    }

    public int getLength () {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as internship employee for "+length+ "month/s\n";
        return info;
    }

    @Override
    public int getPaymentAmount() {
        return length * 50000;
    }
}