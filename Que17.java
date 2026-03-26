class Employee {
    String name;
    int id;
    static int employeeCount = 0; // Static variable to track count

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; // Increment count whenever a new object is created
    }

    // Display employee details
    void display() {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }

    // Static method to show total employees
    static void displayEmployeeCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

// Main class
public class Que17 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Himanshi", 101);
        Employee e2 = new Employee("Rahul", 102);
        Employee e3 = new Employee("Ananya", 103);

        // Display details of each employee
        e1.display();
        e2.display();
        e3.display();

        // Display total employees
        Employee.displayEmployeeCount();
    }
}