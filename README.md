# jlox
This repo contains the implementation of a tree-walking interpreter for Lox, a general-purpose object-oriented language. Developed by following along the book [Crafting Interpreters](https://craftinginterpreters.com/).

It can run programs like:

```java
class Vehicle {
    init(brand) {
        this.brand = brand;
    }

    describe() {
        return "This is a " + this.brand;
    }
}

class Car < Vehicle {
    init(brand, model) {
        super.init(brand);
        this.model = model;
    }

    describe() {
        return super.describe() + " " + this.model;
    }
}

var myCar = Car("Toyota", "Camry");
print myCar.describe();
```
