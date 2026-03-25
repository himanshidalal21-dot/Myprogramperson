// Base class
class Staff {
    void work() {
        System.out.println("Staff performs general duties.");
    }
}

// Doctor class
class Doctor extends Staff {
    void work() {
        System.out.println("Doctor diagnoses patients and prescribes treatment.");
    }
}

// Nurse class
class Nurse extends Staff {
    void work() {
        System.out.println("Nurse assists doctors and cares for patients.");
    }
}

// Receptionist class
class Receptionist extends Staff {
    void work() {
        System.out.println("Receptionist manages appointments and patient records.");
    }
}

// Main class
public class Que16 {
    public static void main(String[] args) {

        Staff s;

        s = new Doctor();
        s.work();

        s = new Nurse();
        s.work();

        s = new Receptionist();
        s.work();
    }
}