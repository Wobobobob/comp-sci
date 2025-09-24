public class BankTester {
    public static void main(String[] args) {

        Bank bank1 = new Bank(3, 5); // instantiate a new Bank object

        Bank bank2 = new Bank(4, 5); // instantiate a new Bank object

        System.out.println(bank1.computeTotalEmployees()); // should print 8

        bank2.setNumberOfLoanOfficers(3); // bank2 now has 3 loan officers

        System.out.println(bank1.getNumberOfTellers()); // should print 5

        System.out.println(bank1.equals(bank2)); // should print true

        System.out.println(bank2); // prints "This bank has 3 loan officers
        // and 5 tellers."
        bank1.hireMembers(2, true); // bank1 now has 5 loan officers

        System.out.println(bank1); // prints "This bank has 5 loan officers
        // and 5 tellers."
        bank1.transferEmployees(true, 3); // bank1 now has 2 loan officers and 8 tellers

        System.out.println(bank1); // prints "This bank has 2 loan officers
        // and 8 tellers."
        System.out.println(bank1.computeTotalEmployees()); // should print 10

        System.out.println(bank1.toString()); // should print false

        bank1.transferEmployees(false, 3); // should print false

        bank1.fireMembers(4, true);

        System.out.println(bank1.toString());

        System.out.println(bank1.averageMonthlySalary());

        System.out.println(bank1.getEmployeeRatio());

    }
}
