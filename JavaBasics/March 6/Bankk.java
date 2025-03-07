class Bankk{
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public Bankk(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount){
        if(amount>0){
            balance +=amount;
            System.out.println("amount to be deposited :" + amount);
            System.out.println("New balance available :" + balance);
        }
        else{
            System.out.println("invalid amount! enter again valid amount");
        }
    }
    
    public void withdraw(int amount){
        if(amount>0 && amount<=balance){
            balance -=amount;
            System.out.println("amount withdrawn :" + amount);
            System.out.println("New balance available :" + balance);
        }
        else{
            System.out.println("Insufficient amount! enter again valid amount ");
        }
    }

    public void display(){
        System.out.println("Accountholder : " + accountHolder);
        System.out.println("Accountnumber : " + accountNumber);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {
        Bankk obj = new Bankk("Abhiram", 513, 10000);
        obj.display();
        System.out.println();

        obj.deposit(3000);
        System.out.println();
        
        obj.withdraw(1500);
        System.out.println();
    }
}