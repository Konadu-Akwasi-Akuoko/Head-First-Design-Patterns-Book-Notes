# 01: Introduction to design patterns: Welcome to design patterns

## The `public` keyword in Java (OOP)

In Java, `public` is an access modifier that determines the visibility of a class, method,
or variable. If a class, method, or variable is declared as `public`, it means it can be
accessed from any other class in the application.

In the provided code, the `Duck` class, the `quack` method, the `swim` method, and
the `display` method are all declared as `public`. This means they can be accessed and
used from any other class, such as `MallardDucks`, `DecoyDuck`, and `DuckMain`.

```java
public abstract class Duck {
    public void quack(String name) {
        System.out.println("The " + name + " is quacking");
    }

    public void swim(String name) {
        System.out.println("The " + name + " is swimming");
    }
}
```

## The `void` keyword in Java (OOP)

In Java, `void` is a keyword used to indicate that a method does not return any value.

In the provided code, the `quack` and `swim` methods in the `Duck` class are declared
as `void`. This means that these methods perform some action (printing a message to the
console) but do not return any value.

```java
public void quack(String name) {
    System.out.println("The " + name + " is quacking");
}

public void swim(String name) {
    System.out.println("The " + name + " is swimming");
}
```

## `abstract classes` in Java (OOP)

An `abstract class` in Java is a class that cannot be instantiated (i.e., you cannot
create an object of an abstract class). It is used to declare common characteristics for
subclasses. An abstract class can contain both abstract methods (methods without a body)
and non-abstract methods (regular methods with a body).

In the provided code, `Duck` is an abstract class with one abstract method `display` and
two non-abstract methods `quack` and `swim`.

```java
public abstract class Duck {
    public abstract String display();
}
```

## Method `overriding` in Java (OOP)

Method `overriding` in Java is a feature that allows a subclass to provide a specific
implementation of a method that is already provided by its parent class. The method in the
subclass must have the same name, return type, and parameters as the method in the parent
class.

In the provided code, the `display` method is overridden in the `MallardDucks`
and `DecoyDuck` classes, and the `quack` and `swim` methods are overridden in
the `DecoyDuck` class.

```java
public class MallardDucks extends Duck {
    @Override
    public String display() {
        return "I am a Mallard Duck";
    }
}

public class DecoyDuck extends Duck {
    @Override
    public String display() {
        return "I am a Decoy Duck";
    }

    @Override
    public void quack(String name) {
//        DecoyDuck cannot quack
    }

    @Override
    public void swim(String name) {
//        DecoyDuck cannot swim
    }
}
```

## The `extends` keyword in Java (OOP)

In Java, the `extends` keyword is used in class declarations to specify that a class is a
subclass of another class. This mechanism is known as inheritance, which is a fundamental
concept in object-oriented programming (OOP). Inheritance allows a class to inherit the
fields and methods of another class, enabling code reuse, and polymorphism.

In the provided code, the `DecoyDuck` class extends the `Duck` class. This means
that `DecoyDuck` is a subclass of `Duck` and it inherits all the non-private fields and
methods of `Duck`.

```java
public class DecoyDuck extends Duck {
    ...
}
```

However, `DecoyDuck` overrides the `quack` and `swim` methods of `Duck`, providing its own
implementation. In this case, the `DecoyDuck` cannot quack or swim, so the methods are
overridden with empty bodies. This is an example of polymorphism, where a subclass can
change the behavior of a method inherited from its superclass.

```java

@Override
public void quack(String name) {
//        DecoyDuck cannot quack
}

@Override
public void swim(String name) {
//        DecoyDuck cannot swim
}
```

The `display` method is an abstract method in the `Duck` class, which means it has no
implementation in the `Duck` class and must be implemented in any non-abstract class that
extends `Duck`. In the `DecoyDuck` class, the `display` method is implemented to return
the string "I am a Decoy Duck".

```java

@Override
public String display() {
    return "I am a Decoy Duck";
}
```

## `Inheritance` in OOP

In Object-Oriented Programming (OOP), inheritance is a mechanism that allows one class to
acquire the properties (fields) and behaviors (methods) of another class. The class whose
properties and behaviors are acquired is known as the **superclass** or **parent class**,
and the class that acquires those properties and behaviors is known as the **subclass** or
**child class**.

Inheritance promotes **code reusability** and **hierarchical classification**, which can
make the code easier to manage and understand. It also enables **polymorphism**, where a
subclass can override methods of the superclass to provide its own implementation.

In Java, inheritance is implemented using the `extends` keyword. For example, in the code
you provided:

```java
public class DecoyDuck extends Duck {
    ...
}
```

Here, `DecoyDuck` is the subclass that inherits from the `Duck` superclass. This
means `DecoyDuck` inherits all the non-private fields and methods of `Duck`. It can also
override the methods of `Duck` to provide its own implementation, as it does with
the `display`, `quack`, and `swim` methods. This is a classic example of inheritance in
OOP.

It's important to note that Java supports **single inheritance**, meaning a class can only
extend from one superclass. However, a class can implement multiple interfaces, which is a
form of **multiple inheritance**.

## Design principle: Take what varies and `encapsulate` it, so it won't affect the rest of the code

"Take what varies and encapsulate it, so it won't affect the rest of your code" means that
you should identify the parts of your code that are likely to change and separate them
from the rest of your code. This way, when changes occur, you only need to update the
encapsulated part without affecting other parts of your code.

For example, consider a software application that communicates with a database. The type
of database (MySQL, PostgreSQL, MongoDB, etc.) might vary. Instead of scattering
database-specific code throughout your application, you could encapsulate it in one place,
like a `Database` class. If you later decide to switch from MySQL to PostgreSQL, you only
need to modify the `Database` class, and the rest of your application remains unaffected.

This principle helps to make your code more flexible, maintainable, and resilient to
change. It's closely related to the **Open/Closed Principle** in OOP, which states that "
software entities (classes, modules, functions, etc.) should be open for extension, but
closed for modification." By encapsulating what varies, you can extend or modify the
behavior of your code without modifying existing code, thereby reducing the risk of
introducing new bugs.

In summary, this principle is about managing change and complexity in software development
by isolating the parts of your code that are most likely to change. This isolation is
achieved through encapsulation, one of the key principles of OOP.

## Program to an interface, not an implementation

This principle suggests that the software components should depend on abstractions, not on
concrete implementations. This leads to a more decoupled system where the components can
be changed or replaced more easily without affecting other parts of the system.

In Java, an interface is a reference type that can contain only constants, method
signatures, default methods, static methods, and nested types. When a class implements an
interface, it inherits the abstract methods of the interface.

For example, consider a `Vehicle` interface with a method `move()`. If you have classes
like `Car`, `Bike`, `Boat` that implement this interface, they provide their own
implementation of the `move()` method. Now, if you have a function that takes a `Vehicle`
as an argument, you can pass any object of a class that implements `Vehicle`. This
function is now programmed to the `Vehicle` interface, not to the specific
implementations (`Car`, `Bike`, `Boat`).

```java
interface Vehicle {
    void move();
}

class Car implements Vehicle {
    public void move() {
        System.out.println("Car is moving");
    }
}

class Bike implements Vehicle {
    public void move() {
        System.out.println("Bike is moving");
    }
}

public class Main {
    public static void startVehicle(Vehicle vehicle) {
        vehicle.move();
    }

    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        startVehicle(myCar);  // Outputs: Car is moving
        startVehicle(myBike); // Outputs: Bike is moving
    }
}
```

In this example, the `startVehicle` function is not concerned with how each vehicle moves.
It only calls the `move` method, and the correct method is executed depending on the
actual type of the `Vehicle`. This is an example of programming to an interface. It makes
the `startVehicle` function flexible and able to handle any new class that
implements `Vehicle`, without changing its code. This is the essence of the principle "
Program to an interface, not an implementation". It promotes flexibility, extensibility,
and modularity in your code.

## Abstract classes can implement interfaces but does not necessarily have to implement all the methods of the interface

When an abstract class implements an interface, it can choose to not provide the
implementation for the interface's methods. It's the responsibility of the concrete
class (a class that extends this abstract class) to provide the implementation for these
methods.

Here's an example:

```java
interface FlyBehaviour {
    void fly();
}

abstract class Duck implements FlyBehaviour {
    // No implementation of fly() here
}

class MallardDuck extends Duck {
    @Override
    public void fly() {
        System.out.println("MallardDuck is flying");
    }
}
```

In this example, `Duck` is an abstract class that implements the `FlyBehaviour` interface
but doesn't provide an implementation for the `fly` method. `MallardDuck` is a concrete
class that extends `Duck` and provides an implementation for the `fly` method.

This feature provides a lot of flexibility in designing your classes and interfaces,
allowing you to decide at what level in the class hierarchy a method should be
implemented. It's a powerful tool for creating well-structured, easily maintainable code.

## Concrete Class

A concrete class in Java is a standard class where you can create instances (objects).
It's called "concrete" because it provides a concrete implementation for all its methods,
meaning it provides the method bodies. It does not contain any abstract methods (methods
without a body).

Here's an example of a concrete class:

```java
public class Dog {
    public void bark() {
        System.out.println("Woof!");
    }
}
```

In this example, `Dog` is a concrete class. You can create an instance of `Dog` and call
its `bark` method.

## Abstract Class

An abstract class, on the other hand, is a class that cannot be instantiated. It often
serves as a base class for other classes. An abstract class can contain abstract methods (
methods without a body) as well as concrete methods (methods with a body). If a class
contains even a single abstract method, the class must be declared abstract.

Here's an example of an abstract class:

```java
public abstract class Animal {
    public abstract void makeSound();
}
```

In this example, `Animal` is an abstract class with an abstract method `makeSound`. You
cannot create an instance of `Animal`, but you can create a subclass that provides an
implementation for `makeSound`, like this:

```java
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
```

In this example, `Cat` is a concrete class that extends the abstract class `Animal` and
provides an implementation for the `makeSound` method.

In summary, the main difference between concrete and abstract classes is that you can
create instances of concrete classes, but not of abstract classes. Abstract classes are
designed to be extended by subclasses, which provide implementations for the abstract
methods.

Source: Conversation with Bing, 3/4/2024
(1) undefined. https://github.com/Calebosam/aws-hackathon.git.
(2) undefined. https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.7/install.sh.

