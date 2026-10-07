import java.util.ArrayList;
import java.util.List;

public class BankDemo {

    public static void main(String[] args) {

        // Create a list that stores Account references
        List<Account> accounts = new ArrayList<>();

        // Create a savings account
        SavingsAccount savings = new SavingsAccount(
                "S001",
                1000.00,
                500.00
        );

        // Create a current account
        CurrentAccount current = new CurrentAccount(
                "C001",
                500.00,
                300.00
        );

        // Add both accounts to the list
        accounts.add(savings);
        accounts.add(current);

        System.out.println("===== BANK ACCOUNT DEMO =====");

        // Deposit
        System.out.println("\n--- Deposits ---");

        for (Account account : accounts) {
            account.deposit(100.00);
        }

        // Withdrawal
        System.out.println("\n--- Withdrawals ---");

        for (Account account : accounts) {
            account.withdraw(400.00);

            System.out.println("Current balance: $"
                    + account.getBalance());
        }

        // End of month
        System.out.println("\n--- End of Month ---");

        for (Account account : accounts) {
            account.endOfMonth();

            System.out.println("Balance after month-end: $"
                    + account.getBalance());
        }

        // Savings account edge case
        System.out.println("\n--- Savings Account Edge Case ---");

        Account savingsAccount = savings;

        savingsAccount.withdraw(300.00);

        System.out.println("Savings balance: $"
                + savingsAccount.getBalance());

        // Current account overdraft edge case
        System.out.println("\n--- Current Account Overdraft Edge Case ---");

        Account currentAccount = current;

        currentAccount.withdraw(300.00);

        System.out.println("Current account balance: $"
                + currentAccount.getBalance());
    }
}
