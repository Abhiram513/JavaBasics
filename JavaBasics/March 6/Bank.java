class Bank{
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public Bank(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depositing $" + amount + "...");
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawing $" + amount + "...");
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        Bank account = new Bank("Abhiram", 513, 5000.00);
        
        account.displayAccountDetails();
        System.out.println();
        
        account.deposit(2500.0);
        System.out.println();
        
        account.withdraw(3000.0);
    }
}



