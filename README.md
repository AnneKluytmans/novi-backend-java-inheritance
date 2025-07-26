# Java Inheritance Practice – NOVI Backend Module Assignment

## About the Project

This repository contains my solutions for the **Inheritance Practice** assignment from the Backend Java module at [Novi University](https://www.novi.nl).

The goal of this assignment is to deepen understanding of **inheritance**, **abstract classes**, and **method overriding** in Java. By building a class hierarchy starting with an abstract `Animal` superclass and extending it into pets and zoo animals, I practice structuring real-world objects using object-oriented principles.

---

## Table of Contents

- [Tech Stack](#tech-stack)
- [Class Structure](#class-structure)
- [Key Features](#key-features)
- [How to Run](#how-to-run)
- [Credits](#credits)
- [License](#license)

---

## Tech Stack

- **Java 17+**
- **IntelliJ IDEA**

---

## Class Structure

             Animal (abstract)
            /                \
          Pet             ZooAnimal
         /   \         /      |      \
       Dog   Cat     Lion   Tiger   Wolf

---

## Key Features

- Abstract `Animal` class with common properties and abstract methods
- Subclasses `Pet` and `ZooAnimal` extend `Animal`
- Concrete animal classes:
    - `Dog`, `Cat` → extend `Pet`
    - `Lion`, `Tiger`, `Wolf` → extend `ZooAnimal`
- Method overriding to implement unique behavior per animal
- Instantiation and method calls in a `Main` class to demonstrate runtime behavior

---

## How to Run

1. Open the project in **IntelliJ IDEA**
2. Locate the `Main` class in `src/main/java`
3. Run the `inheritance()` method using the green play button or use the terminal:
```bash
./mvnw clean compile exec:java
```

## Credits
> "This assignment was developed as part of the Backend Java module in the NOVI Software Development program. All instructions, logic, and structure are part of the official coursework."

## License
> "This repository is intended for educational purposes only. You are welcome to use the code for learning, but not for commercial use."