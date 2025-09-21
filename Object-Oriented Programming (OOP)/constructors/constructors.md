
# 🚀 Constructors in Java OOP

## 📌 What is a Constructor?

A **constructor** in Java is a **special method** used to initialize objects. It is called **automatically when an object is created**.

Constructors have the **same name as the class** and **do not have a return type** — not even `void`.

---

## 🧱 Why Use Constructors?

* To **initialize object properties** at the time of creation.
* To perform **initial setup** or logic when an object is instantiated.
* To enforce **mandatory fields** for the object.

---

## 🧭 Syntax of a Constructor

```java
class ClassName {
    // Constructor
    ClassName() {
        // Initialization code
    }
}
```

> Note: The constructor name **must match** the class name exactly (including case).

---

## 📂 Types of Constructors in Java

### 1. **Default Constructor**

A constructor with **no parameters**.

Java provides a **default constructor** if no other constructors are defined.

```java
class Car {
    Car() {
        System.out.println("Car created!");
    }

    public static void main(String[] args) {
        Car myCar = new Car(); // Output: Car created!
    }
}
```

> If you define any constructor, Java **does not** automatically provide the default constructor.

---

### 2. **Parameterized Constructor**

A constructor that accepts **arguments** to set initial values.

```java
class Car {
    String model;
    int year;

    // Parameterized constructor
    Car(String m, int y) {
        model = m;
        year = y;
    }

    void display() {
        System.out.println(model + " - " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2021);
        car1.display();  // Output: Toyota - 2021
    }
}
```

---

### 3. **Copy Constructor** (Not built-in like C++)

Java doesn't have a built-in copy constructor, but you can define one manually.

```java
class Car {
    String model;
    int year;

    // Parameterized constructor
    Car(String m, int y) {
        model = m;
        year = y;
    }

    // Copy constructor
    Car(Car c) {
        model = c.model;
        year = c.year;
    }

    void display() {
        System.out.println(model + " - " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Honda", 2020);
        Car car2 = new Car(car1); // copy constructor
        car2.display();  // Output: Honda - 2020
    }
}
```

---

## ⚙️ Constructor Overloading

You can define **multiple constructors** with different parameter lists. This is called **constructor overloading**.

```java
class Book {
    String title;
    int pages;

    // Default constructor
    Book() {
        title = "Unknown";
        pages = 0;
    }

    // Parameterized constructor
    Book(String t, int p) {
        title = t;
        pages = p;
    }

    void display() {
        System.out.println(title + ": " + pages + " pages");
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", 250);

        b1.display(); // Output: Unknown: 0 pages
        b2.display(); // Output: Java Basics: 250 pages
    }
}
```

---

## 🔁 Using `this()` to Call Another Constructor

`this()` is used to call **another constructor** from the **same class**.

```java
class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 0); // Calls the other constructor
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice", 22);

        s1.display(); // Output: Unknown - 0
        s2.display(); // Output: Alice - 22
    }
}
```

> `this()` must be the **first statement** in the constructor.

---

## 🔒 Constructor Access Modifiers

Constructors can have **access modifiers**:

* `public`: Can be accessed from anywhere.
* `private`: Used in **Singleton patterns** or **factory methods**.
* `protected` or default: Package-level access.

---

## 📌 Key Points

| Feature     | Constructor                      | Method                  |
| ----------- | -------------------------------- | ----------------------- |
| Name        | Same as class                    | Any valid name          |
| Return type | None                             | Must have a return type |
| Called      | Automatically on object creation | Manually called         |
| Purpose     | Initializes object               | Defines behavior        |

---

## ✅ Example: Full Constructor Usage

```java
class Employee {
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("John", 50000);
        e.display();
    }
}
```

---

## 📚 Best Practices

* Use parameterized constructors to ensure required fields are set.
* Avoid complex logic inside constructors.
* Use constructor overloading for flexibility.
* Prefer `this()` to avoid duplicate initialization code.

---

## 🔗 Related Concepts

* Method Overloading
* Object Initialization
* Singleton Pattern
* Factory Methods
* Encapsulation

---

> ✅ Understanding constructors is essential for mastering OOP in Java — they are the **foundation of object creation and initialization**.
