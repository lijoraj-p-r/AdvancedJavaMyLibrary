### 🔑 `this` Keyword in Java – **Complete Explanation**

---

### 📌 What is `this` in Java?

In Java, `this` is a **reference variable** that refers to the **current object** — the object whose method or constructor is being called.

Think of `this` as a **self-pointer**. It allows access to the current object's:

* Fields (instance variables)
* Methods
* Constructors (via `this()`)

---

### 🧠 Why is `this` Used?

#### ✅ 1. To resolve **variable shadowing**

When a local variable or parameter has the **same name** as an instance variable:

```java
class Student {
    String name;

    Student(String name) {
        this.name = name; // 'this.name' refers to instance variable
    }
}
```

Without `this`, `name = name;` would assign the parameter to itself — a **shadowing problem**.

---

#### ✅ 2. To invoke **current class methods**

```java
class Demo {
    void show() {
        System.out.println("Show method called");
    }

    void display() {
        this.show(); // same as just 'show();'
    }
}
```

---

#### ✅ 3. To invoke **current class constructor** (Constructor chaining)

Use `this()` to call another constructor from the same class.

```java
class Car {
    String model;
    int year;

    Car() {
        this("Unknown", 0); // calls the parameterized constructor
    }

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
```

---

#### ✅ 4. To **pass the current object** as a parameter

```java
class Person {
    void print(Person p) {
        System.out.println("Object received");
    }

    void call() {
        print(this); // passing the current object
    }
}
```

---

#### ✅ 5. To **return the current object**

Useful in **method chaining**:

```java
class Box {
    int length;

    Box setLength(int length) {
        this.length = length;
        return this; // returns current object
    }
}
```

---

### 💡 Summary Table

| Use Case                 | Syntax          | Purpose                 |
| ------------------------ | --------------- | ----------------------- |
| Access instance variable | `this.variable` | Resolve shadowing       |
| Call current method      | `this.method()` | Optional (implicit)     |
| Call another constructor | `this()`        | Constructor chaining    |
| Pass current object      | `method(this)`  | Useful in callbacks     |
| Return current object    | `return this;`  | Enables method chaining |

---

### 📁 Code Example: All Uses of `this`

```java
class Employee {
    String name;
    int id;

    // Constructor with shadowed parameters
    Employee(String name, int id) {
        this.name = name; // resolves shadowing
        this.id = id;
    }

    void show() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    void printThis() {
        System.out.println(this); // prints the current object reference
    }

    Employee returnSelf() {
        return this; // returns the current object
    }

    void callAnotherMethod() {
        this.show(); // call method using this
    }
}
```

---

### 🛑 Important Notes

* `this()` must be the **first statement** in a constructor.
* `this` cannot be used in **static methods** (because there's no object context).
* `this` is implicitly available in all **non-static** methods and constructors.

---

### ✅ When Should You Use `this`?

| Situation                          | Should You Use `this`? |
| ---------------------------------- | ---------------------- |
| Variable name conflict (shadowing) | ✅ Yes                  |
| Constructor chaining               | ✅ Yes (`this()`)       |
| Inside instance methods (optional) | ✅ Optional             |
| Static context                     | ❌ Not allowed          |

