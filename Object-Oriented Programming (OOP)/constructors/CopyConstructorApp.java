public class CopyConstructorApp {

    // Inner class Address
    static class Address {
        private String city;
        private String state;

        // Constructor
      

        // Copy Constructor
        public Address(Address other) {
            this.city = other.city;
            this.state = other.state;
        }

        public void display() {
            System.out.println("City: " + city + ", State: " + state);
        }
    }

    // Inner class Student
    static class Student {
        private int id;
        private String name;
        private Address address;

        // Constructor
        public Student(int id, String name, Address address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

        // Copy Constructor (deep copy)
        public Student(Student other) {
            this.id = other.id;
            this.name = other.name;
            this.address = new Address(other.address); // deep copy
        }

        public void display() {
            System.out.println("ID: " + id + ", Name: " + name);
            address.display();
        }
    }

    // Main method
    public static void main(String[] args) {
        // Original object
        Address address1 = new Address("Mumbai", "Maharashtra");
        Student student1 = new Student(101, "Rahul", address1);

        // Create a copy using copy constructor
        Student student2 = new Student(student1);

        // Change original address to test deep copy
        address1 = new Address("Delhi", "Delhi");

        System.out.println("Original Student:");
        student1.display();

        System.out.println("\nCopied Student:");
        student2.display();
    }
}
