class Bank {
    final double interestRate; // Final variable, cannot be changed after initialization

    // Constructor
    Bank(double rate) {
        this.interestRate = rate;
    }

    // Method to calculate interest
    double calculateInterest(double amount) {
        return amount * interestRate / 100;
    }
}

// Main class
public class Que18 {
    public static void main(String[] args) {

        // Fixed interest rate 6.5%
        Bank bank = new Bank(6.5);

        // Different customers
        double customer1 = bank.calculateInterest(10000);
        double customer2 = bank.calculateInterest(25000);
        double customer3 = bank.calculateInterest(50000);

        System.out.println("Interest for customer 1: ₹" + customer1);
        System.out.println("Interest for customer 2: ₹" + customer2);
        System.out.println("Interest for customer 3: ₹" + customer3);
    }
}