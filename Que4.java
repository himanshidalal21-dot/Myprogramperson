import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;

    // Method to calculate total amount
    float Compute() {
        float amount = Days * Charges;
        if (amount > 11000) {
            amount = amount * 1.02f; // 2% extra
        }
        return amount;
    }

    // Method to get input
    void Getinfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Customer Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Charges per Day: ");
        Charges = sc.nextFloat();

        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    // Method to display information
    void DispInfo() {
        float amount = Compute();

        System.out.println("\n--- Resort Details ---");
        System.out.println("Room No: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per Day: " + Charges);
        System.out.println("Days Stayed: " + Days);
        System.out.println("Total Amount: " + amount);
    }
}

// Main class
public class Que4 {
    public static void main(String[] args) {
        Resort r = new Resort();

        r.Getinfo();
        r.DispInfo();
    }
}