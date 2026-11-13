public class Tester3 {
    public static void main(String[] args) {
        permanentEmployee pEmp = new permanentEmployee("Dedik", 500);
        internshipEmployee iEmp = new internshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        employee e[] = {pEmp, iEmp};
        PayAble p[] = {pEmp, eBill};
        employee e2[] = {pEmp, iEmp, eBill};
    }
}
