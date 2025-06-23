package InnerClasses;


class Computer
{
    protected void config()
    {
        System.out.println("In Computer Config");
    }
}
public class InnerClassEx3 {
    public static void main(String[] args) {
        Computer comp = new Computer()
        {
            public void config()
            {
                System.out.println("Something New");
            }
        };
        comp.config();
    }
}
/*
* This Java program demonstrates the use of **anonymous inner classes**. Here's what's happening in your code:

---

### ✅ **Code Breakdown:**

```java
Computer comp = new Computer() {
    public void config() {
        System.out.println("Something New");
    }
};
```

* This creates an **anonymous subclass** of the `Computer` class.
* The `config()` method is **overridden** inside this subclass.
* `comp.config();` calls the overridden version — **"Something New"** is printed.

🧠 **Key Points:**
* `Computer` is the superclass.
* We are creating an **anonymous inner class** that extends `Computer` and overrides the `config()` method.
* This class has **no name**, hence “anonymous”.
* Useful when you need to override methods for **one-time use** or **inline customization**.
🖨️ **Output:**
Something New

* */