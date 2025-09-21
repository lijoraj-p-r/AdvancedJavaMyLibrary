In Java, a **copy constructor** is a special type of constructor used to create a **new object as a copy of an existing object**.

Unlike C++, Java does **not provide a default copy constructor**. However, you can define your own copy constructor manually.

---

### ✅ What is a Copy Constructor?

A **copy constructor** is a constructor that takes **another object of the same class as a parameter** and **copies its values** to the new object.

---

### 📌 Syntax of a Copy Constructor in Java

```java
class MyClass {
    int x;
    String name;

    // Copy Constructor
    MyClass(MyClass obj) {
        this.x = obj.x;
        this.name = obj.name;
    }
}
```

---

### 🧪 Example

```java
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person(p1); // Copy constructor called

        p1.display();  // Output: Name: Alice, Age: 25
        p2.display();  // Output: Name: Alice, Age: 25
    }
}
```

---

### 💡 Why Use a Copy Constructor?

* To create a **deep copy** of an object.
* When cloning is not preferred or `Cloneable` interface is not used.
* For custom behavior while copying.

---

### ⚠️ Shallow vs Deep Copy

* A **shallow copy** copies only the field values (not the objects they refer to).
* A **deep copy** copies the fields **and** creates new copies of referenced objects (if any).

To make a deep copy, you must manually create new instances of referenced objects inside the copy constructor.

---

### 📚 Alternative: `clone()` Method

Java also provides `Object.clone()`, but:

* It's more complex (requires `Cloneable` interface),
* Often less readable,
* And discouraged in favor of constructors.

---

### Summary

| Feature           | Copy Constructor              |
| ----------------- | ----------------------------- |
| Provided by Java? | ❌ (You must define it)        |
| Used for          | Copying objects               |
| Customizable?     | ✅ Yes                         |
| Common Use        | Object duplication, deep copy |

