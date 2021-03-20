package training1;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("CIRCLE: ");
        System.out.println(c);
        System.out.println(c.getArea());

        System.out.println("\nEMPLOYEE: ");
        Employee e = new Employee(1, "Coteanu", "Maria", 100);
        System.out.println(e.getAnnualSalary());
        System.out.println(e.raiseSalary(30));
        System.out.println(e);

        System.out.println("\nINVOICE_ITEM: ");
        InvoiceItem ii = new InvoiceItem("Z2", "Zacusca", 2, 7.5);
        System.out.println(ii.getTotal());

        System.out.println("\nACCOUNT: ");
        Account bcr = new Account("RO453", "Pompilica", 56);
        System.out.println(bcr.credit(10));
        Account brd = new Account("RO0043", "Mitilica");
        System.out.println(bcr.transferTo(brd, 5));
        System.out.println("BCR: " + bcr);
        System.out.println("BRD: " + brd);

        System.out.println("\nDATE: ");
        Date day = new Date(13,3,2021);
        System.out.println(day);

        System.out.println("\nTIME: ");
        Time newDay = new Time(12, 28, 59);
        System.out.println(newDay.nextSecond());
        System.out.println(newDay.previousSecond());
    }
}
