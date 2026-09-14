# Cafe Order Builder — Assignment #1 (Builder Pattern)

## What this is

A demonstration of the **Builder** creational design pattern using a
coffee-shop **drink order** as the product. A drink has several
optional customizations (size, milk, shots, syrup, temperature,
whipped cream), and different "kinds" of orders (a hot espresso drink
vs. an iced drink) need different default configurations — that's the
step-by-step, multiple-representation scenario Builder is meant for.

## Structure

| File | Role |
|---|---|
| `Drink.java` | **Product** — the finished, immutable drink order |
| `DrinkBuilder.java` | **Builder** — abstract class declaring the fluent construction steps, shared fields and validation |
| `HotDrinkBuilder.java` | **ConcreteBuilder** — hot, whole-milk, single-shot drink |
| `IcedDrinkBuilder.java` | **ConcreteBuilder** — iced, oat-milk drink with extra shots and whipped cream |
| `Main.java` | **Client** — demo that exercises both builders and the validation guard |

No Director class — it's optional in the assignment brief, so the
client configures drinks directly through fluent chaining.

## How to build each representation

```java
Drink hotLatte = new HotDrinkBuilder()
        .setSize("Medium")
        .setSyrup("Vanilla")
        .build();

Drink icedMocha = new IcedDrinkBuilder()
        .setSize("Large")
        .setSyrup("Chocolate")
        .build();
```

Calling `.build()` without first calling `.setSize(...)` throws an
`IllegalStateException` — every `Drink` produced is guaranteed to
have a size.

## How to run

```bash
javac -d out src/cafebuilder/*.java
java -cp out cafebuilder.Main
```

Requires JDK 17+.
