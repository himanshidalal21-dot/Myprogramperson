// Abstract class
abstract class Shape {
    
    // Abstract method
    abstract double calculate_area();

    // Concrete method
    void display_info() {
        System.out.println("This is a shape.");
    }
}

// Circle subclass
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculate_area() {
        return 3.14 * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculate_area() {
        return length * breadth;
    }
}

// Main class
public class Que7 {
    public static void main(String[] args) {

        // Using Circle
        Shape c = new Circle(5);
        c.display_info();
        System.out.println("Circle Area: " + c.calculate_area());

        // Using Rectangle
        Shape r = new Rectangle(4, 6);
        r.display_info();
        System.out.println("Rectangle Area: " + r.calculate_area());
    }
}