class BankAccount{
    private double balance;

    // Constructor
    public BankAccount(double initial_bal){
        balance=initial_bal;
    }

    // Getter method
    public double getBalance(){
        return balance;
    }

    // Setter method
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount my_bank=new BankAccount(50000);
//        my_bank.balance=40000;
        System.out.println("Balance : "+my_bank.getBalance());
        String user="dev";
        String pass="2324";
        if (user=="dev" && pass=="2324"){
            my_bank.deposit(10000);
        }
        else {
            System.out.println("Invalid Cred..");
        }
        System.out.println("Balance : "+my_bank.getBalance());

    }
}