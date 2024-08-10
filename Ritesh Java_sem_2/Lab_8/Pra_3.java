public class Pra_3 
{
    public static void main(String[] args) {
        Interest i = new Interest("12345", "John Doe", 10000, 5);
        i.displayTotalInterest();
    }
}

class AccountDetails {
    private String accountNo;
    private String accountHolderName;
    private double balance;
    private double interestRate;
    
    public AccountDetails(String accountNo, String accountHolderName, double balance, double interestRate) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public double getInterestRate() {
        return interestRate;
    }
}

class Interest extends AccountDetails {
    public Interest(String accountNo, String accountHolderName, double balance, double interestRate) {
        super(accountNo, accountHolderName, balance, interestRate);
    }
    
    public double calculateTotalInterest() {
        double interest = getBalance() * getInterestRate() / 100;
        return interest;
    }
    
    public void displayTotalInterest() {
        double interest = calculateTotalInterest();
        System.out.println("Total Interest: " + interest);
    }
}
