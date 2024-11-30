public class BankAccountTest {
    public static void main(String[] args) {
        // Test case: Attempt to create an account with a negative balance
        try {
            BankAccount account1 = new BankAccount(-500); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Test case: Attempt to deposit a negative amount
        try {
            BankAccount account2 = new BankAccount(1000);
            account2.deposit(-200); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Test case: Attempt to withdraw an amount not between 0 and current balance
        try {
            BankAccount account3 = new BankAccount(500);
            account3.withdraw(600); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("All tests completed.");
    }
}
