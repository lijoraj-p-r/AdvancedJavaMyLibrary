
# 🧠 Object-Oriented Programming (OOP) in Java

Object-Oriented Programming (OOP) is a programming paradigm that organizes software design around **objects**, rather than **functions** and **logic**. Java is a **pure object-oriented language** (except for primitives), and understanding OOP is essential to write effective Java code.

---

## 🔑 1. What is OOP?

OOP focuses on using **classes** and **objects** to model real-world things. It allows you to build programs using reusable, modular pieces of code.

---

## 🧱 2. Key Concepts of OOP in Java

### ➤ a. **Class**

A class is a **blueprint** for creating objects. It defines **fields (variables)** and **methods (functions)**.

```java
class Car {
    String color;
    void drive() {
        System.out.println("Car is driving");
    }
}
```

---

### ➤ b. **Object**

An object is an **instance** of a class. It holds actual values and can call the class methods.

```java
Car myCar = new Car();  // Creating an object
myCar.color = "Red";    // Setting field
myCar.drive();          // Calling method
```

---

### ➤ c. **Encapsulation**

Encapsulation is the concept of **wrapping** data (variables) and code (methods) together as a single unit, and restricting access using **access modifiers** (like `private`, `public`).

```java
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
```

---

### ➤ d. **Inheritance**

Inheritance allows a class (subclass/child) to **inherit** properties and methods from another class (superclass/parent).

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

---

### ➤ e. **Polymorphism**

Polymorphism means "many forms". It allows objects to be treated as instances of their parent class. There are two types:

* **Compile-time (Method Overloading)**
* **Runtime (Method Overriding)**

**Method Overloading:**

```java
class Print {
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(String b) {
        System.out.println("String: " + b);
    }
}
```

**Method Overriding:**

```java
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}
```

---

### ➤ f. **Abstraction**

Abstraction means hiding complex implementation details and only showing the **essential features** to the user.

You can achieve abstraction using:

* **Abstract classes**
* **Interfaces**

```java
abstract class Shape {
    abstract void draw();  // Abstract method
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}
```

---

## 🔄 3. OOP Benefits in Java

* ✅ Code Reusability (via Inheritance)
* ✅ Scalability and Maintainability
* ✅ Real-world modeling
* ✅ Modular Structure
* ✅ Flexibility through Polymorphism

---

## 🧪 4. Real-Life Example

Imagine a program for a **Library**:

* `Book` class (title, author, read())
* `Member` class (name, borrowBook())
* `Librarian` class (issueBook(), addBook())

Each of these can be modeled as **classes**, and their interactions can use **objects**, **inheritance**, and **polymorphism**.

---

## ✅ Conclusion

OOP is the foundation of Java. Mastering classes, objects, inheritance, polymorphism, abstraction, and encapsulation will enable you to write powerful, modular, and maintainable code.

---

Would you like a **summary PDF**, **practice exercises**, or a **real-world Java OOP project**?
