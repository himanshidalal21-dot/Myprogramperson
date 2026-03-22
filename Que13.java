// Abstract class
abstract class Employee {
    String name;
    int id;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    abstract double calculateBonus();

    // Display method
    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Full-time employee
class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    double calculateBonus() {
        return salary * 0.10; // 10% bonus
    }
}

// Part-time employee
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double rate, int hours) {
        super(name, id);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    double calculateBonus() {
        return hourlyRate * hoursWorked * 0.05; // 5% bonus
    }
}

// Main class
public class Que13 {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Himanshi", 101, 50000);
        Employee e2 = new PartTimeEmployee("Rahul", 102, 200, 40);

        e1.display();
        System.out.println("Bonus: " + e1.calculateBonus());

        System.out.println();

        e2.display();
        System.out.println("Bonus: " + e2.calculateBonus());
    }
}