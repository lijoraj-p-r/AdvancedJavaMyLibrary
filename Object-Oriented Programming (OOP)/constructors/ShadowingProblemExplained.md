### ⚠️ Variable Shadowing Problem in Java

---

### 📌 **What is Variable Shadowing?**

**Variable shadowing** happens when a **local variable or parameter** in a method (like a constructor or function) has the **same name** as an **instance variable** (or class-level variable).

In such a case, the local variable **"shadows" or hides** the instance variable — making it **inaccessible** unless you explicitly refer to it using `this`.

---

### 🎯 Why is it a Problem?

* It can cause **confusion** and **bugs** because:

  * The assignment might not affect the intended variable.
  * You may think you're setting an instance variable, but you're just modifying a local one.

---

### 🔍 Example of Shadowing Problem

```java
class Student {
    String name;

    // Constructor with a parameter named 'name' (same as instance variable)
    public Student(String name) {
        name = name; // ⚠️ Shadowing problem
    }

    void display() {
        System.out.println("Name: " + name);
    }
}
```

### 🧪 Output:

```bash
Name: null
```

#### ❌ What's going wrong?

* `name = name;` is assigning the **parameter `name` to itself**, **not** to the instance variable `this.name`.
* The instance variable `name` remains `null`.

---

### ✅ Solution: Use `this` Keyword

To **refer to the instance variable**, use `this.name`:

```java
class Student {
    String name;

    public Student(String name) {
        this.name = name; // ✅ No shadowing issue
    }

    void display() {
        System.out.println("Name: " + name);
    }
}
```

### 🧪 Correct Output:

```bash
Name: Alice
```

---

### 💡 Key Rule:

> When **parameter names match instance variable names**, always use `this.` to refer to the instance variable.

---

### 🔐 When Shadowing is Okay

Sometimes, developers **intentionally** name parameters the same as instance variables (for clarity) and resolve shadowing using `this`.

✅ This is **clean and standard practice**:

```java
class Car {
    String model;

    public Car(String model) {
        this.model = model;
    }
}
```

---

### 📌 Summary Table

| Scope     | Variable Name | Access Using      |
| --------- | ------------- | ----------------- |
| Instance  | `name`        | `this.name`       |
| Parameter | `name`        | `name`            |
| Shadowed? | Yes           | If `name = name;` |
