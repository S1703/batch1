public class BankAccount {
    private String name;
    protected double balance;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposite(double amount) {
     this.balance += amount;
    }
   
    public boolean withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }






    public static void main(String[] args) {
        CurrentAccount c = new CurrentAccount();
        SavingAccount s = new SavingAccount();
        c.deposite(500.00);
        s.deposite(500.00);
        doWithdrawal(c);    // Withdraw succeed.
        doWithdrawal(s);    // Withdraw failed.
    }

    public static void doWithdrawal(BankAccount acc) {
        boolean result = acc.withdraw(200.00);
        if (result) {
            System.out.println("Withdraw succeed.");
        } else {
            System.out.println("Withdraw failed.");
        }
    }
}