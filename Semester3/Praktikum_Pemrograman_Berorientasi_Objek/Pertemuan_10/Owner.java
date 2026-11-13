public class Owner {
    public void pay(PayAble p) {
        System.out.println("Total payment = " + p.getPaymentAmount());
        if (p instanceof ElectricityBill) {
            ElectricityBill eb = (ElectricityBill) p;
            System.out.println("" + eb.getBillInfo());
        } else if (p instanceof permanentEmployee) {
            permanentEmployee pe = (permanentEmployee) p;
            pe.getEmployeeInfo();
            System.out.println("" + pe.getEmployeeInfo());
        }
    }

    public void showMyEmployee(employee e) {
        System.out.println("" + e.getEmployeeInfo());
        if (e instanceof permanentEmployee)
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her !!");
    }
}