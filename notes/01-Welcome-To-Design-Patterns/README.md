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
