package AssignmentOOP;

abstract class Account {
    protected String accNo;
    protected String name;
    protected String mobileNumber;
    protected double balance;

    // Constructor
    public Account(String accNo, String name, String mobileNumber, double initialBalance) {
        this.accNo = accNo;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient balance. Withdrawal failed.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Abstract method for interest
    public abstract void addInterest();
}

// SavingsAccount class
class SavingsAccount extends Account {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accNo, String name, String mobileNumber, double initialBalance, double interestRate) {
        super(accNo, name, mobileNumber, initialBalance);
        this.interestRate = interestRate;
    }

    // Method to add interest to the balance
    @Override
    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: " + interest + ". New Balance: " + balance);
    }
}

// CurrentAccount class
class CurrentAccount extends Account {
    private double interestRate;

    // Constructor
    public CurrentAccount(String accNo, String name, String mobileNumber, double initialBalance, double interestRate) {
        super(accNo, name, mobileNumber, initialBalance);
        this.interestRate = interestRate;
    }

    // Method to add interest to the balance
    @Override
    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: " + interest + ". New Balance: " + balance);
    }
}

// CheckingAccount class
class CheckingAccount extends Account {
    private int noOfFreeTransactions;
    private int transactionCount;
    private double transactionFee;

    // Constructor
    public CheckingAccount(String accNo, String name, String mobileNumber, double initialBalance, int noOfFreeTransactions, double transactionFee) {
        super(accNo, name, mobileNumber, initialBalance);
        this.noOfFreeTransactions = noOfFreeTransactions;
        this.transactionFee = transactionFee;
        this.transactionCount = 0;
    }

    // Override deposit to track transactions and apply fees if necessary
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        trackTransaction();
    }

    // Override withdraw to track transactions and apply fees if necessary
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        trackTransaction();
    }

    // Track transactions and deduct fees if free transactions are exceeded
    private void trackTransaction() {
        transactionCount++;
        if (transactionCount > noOfFreeTransactions) {
            balance -= transactionFee;
            System.out.println("Transaction fee of " + transactionFee + " applied. New Balance: " + balance);
        }
    }

    @Override
    public void addInterest() {
        // Checking account usually doesn't have interest, but can be overridden if needed
        System.out.println("No interest is added for Checking Account.");
    }
}

// Main class to demonstrate the functionality
class MainAccount {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savings = new SavingsAccount("SA123", "Alice", "9876543210", 1000, 4);
        savings.deposit(500);
        savings.withdraw(200);
        savings.addInterest();
        System.out.println("Savings Account Balance: " + savings.getBalance());

        // Create a CurrentAccount object
        CurrentAccount current = new CurrentAccount("CA123", "Bob", "1234567890", 2000, 2);
        current.deposit(500);
        current.withdraw(300);
        current.addInterest();
        System.out.println("Current Account Balance: " + current.getBalance());

        // Create a CheckingAccount object
        CheckingAccount checking = new CheckingAccount("CH123", "Charlie", "1122334455", 3000, 2, 10);
        checking.deposit(100);
        checking.withdraw(200);
        checking.deposit(50); // Exceeds free transactions
        System.out.println("Checking Account Balance: " + checking.getBalance());
    }
}
