import java.util.*;

abstract class BankAccount {
    String accountNumber;
    double balance;

    abstract public void deposit(double ammount);

    abstract public void withdraw(double ammount);

    abstract public void applyInterest();
}

class pojo {
    private String accountNumber;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class Operaiton extends BankAccount {
    pojo p = new pojo();
    public Operaiton(pojo p){
        this.p = p;
    }
    
    public void deposit(double ammount) {
        if (ammount >= 0) {
            double newammount = ammount + p.getBalance();
            p.setBalance(newammount);
            System.out.println(ammount + " amount diposit in your account.");
            System.out.println("Current balance: " + p.getBalance());
        } else {
            System.out.println("Envalid amount entered Please enter a valid amout....!");
        }
    }

    public void withdraw(double ammount) {
        if (ammount <= p.getBalance()) {
            double newammount = p.getBalance() - ammount;
            p.setBalance(newammount);
            System.out.println(ammount + " amount widrawal from your account.");
            System.out.println(" Current balance: " + p.getBalance());
        } else {
            System.out.println("Insufficient funds in your bank account....!");
        }
    }
    public void applyInterest() {
        double interestRate = 7;
        double newbalace = (p.getBalance() * interestRate)/100;
        p.setBalance(newbalace + p.getBalance());
        System.out.println("your interest rate is added to your balace..");
        System.out.println("Current balance: " + p.getBalance());
    }
}

public class Third {
    public static void main(String pankaj[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bank Account");
        System.out.print("Enter a Bank Account: ");
        String accountNumber = in.nextLine();
        System.out.print("Enter Your balace: ");
        double balace = in.nextInt();

        pojo p = new pojo();
        p.setAccountNumber(accountNumber);
        if(balace>=0){
            p.setBalance(balace);
        }else{
            System.out.println("Enter a valid Balance....!");
        }
        
        Operaiton o = new Operaiton(p);
        do {
            System.out.println();
            System.out.println("1. Deposit: ");
            System.out.println("2. withdraw: ");
            System.out.println("3. check Intreset: ");
            System.out.println("4. exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            double amount;
            switch (choice) {
                case 1:
                    System.out.println("1. withdraw : ");
                    System.out.println("Enter a amount to withdraw");
                    amount = in.nextDouble();
                    o.deposit(amount);

                    break;
                case 2:
                    System.out.println("1. withdraw : ");
                    System.out.println("Enter a amount to withdraw");
                    amount = in.nextDouble();
                    o.withdraw(amount);
                    break;
                case 3:
                    o.applyInterest();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Please enter a valide option.....!");
                    break;
            }
        } while (true);
    }
}