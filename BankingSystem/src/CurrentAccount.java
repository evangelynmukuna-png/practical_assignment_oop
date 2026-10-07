public class CurrentAccount extends Account {

    private final double overdraftLimit;
    private double monthlyFee;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
        this.monthlyFee = monthlyFee;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be positive.");
        } else if (balance - amount < -overdraftLimit) {
            System.out.println("Current Account withdrawal rejected: overdraft limit of $"
                    + overdraftLimit + " exceeded.");
        } else {
            balance -= amount;
            System.out.println("Current Account withdrawal successful: $" + amount);
        }
    }

    @Override
    public void endOfMonth() {

        balance -= monthlyFee;

        System.out.println("Current Account" + accountNumber + monthlyFee = monthlyFee);
    }
}