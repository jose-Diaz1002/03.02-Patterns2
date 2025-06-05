# Software Construction Patterns - Java Projects

## 📌 Description

In this project, we explore essential **software construction patterns**. Think carefully before you build your software!

Each level introduces a new design pattern with a Java-based implementation using Gradle. A `Main` class is included in each project to demonstrate the pattern in action.

---

## 🧱 Level 1 - Builder Pattern

### 🍕 Pizza Order Management System

In this level, we implement the **Builder pattern** to manage pizza orders with customizable configurations.

### Requirements:

- Create a `Pizza` class with the following attributes:
  - `size` (pizza size)
  - `dough` (dough type)
  - `toppings` (list of ingredients)

- Define a `PizzaBuilder` interface with methods to:
  - Set the pizza size
  - Set the dough type
  - Add toppings

- Implement concrete builder classes (e.g., `HawaiianPizzaBuilder`, `VegetarianPizzaBuilder`).

- Create a `MestrePizzer` class that receives a `PizzaBuilder` and constructs the pizza using a specific configuration.

- In the `Main` class:
  - Instantiate different `PizzaBuilder` objects.
  - Use `MestrePizzer` to build and display various types of pizzas.

---

## 👁️ Level 2 - Observer Pattern

### 📈 Stock Market Notification System

In this level, we design a system where a **Stock Agent (Observable)** notifies multiple **Broker Agencies (Observers)** whenever the stock market goes up or down.

### Requirements:

- The observable object must maintain references to all subscribed observers.
- Each observer is notified when there's a change in stock status (up or down).
- Demonstrate the notification mechanism in the `Main` class.

---

## 🔄 Level 3 - Callback Pattern

### 🛍️ Shoe Store Payment Gateway Simulation

In this final level, we simulate a **payment gateway** that receives an encapsulated object representing the payment method.

### Requirements:

- The payment gateway should be agnostic of the specific payment method (Credit Card, PayPal, Bank Account).
- It must invoke the payment and return control to the origin class.
- The payment invoker will be a **Shoe Store** class.
- Demonstrate multiple payment flows in the `Main` class.

---

## 🛠️ Technologies Used

- Java
- Gradle
- Design Patterns: Builder, Observer, Callback

---

## 🚀 How to Run

1. Clone the repository.
2. Open each project in your preferred Java IDE.
3. Build with Gradle.
4. Run the `Main` class in each level's package to see the pattern in action.

---

## 📚 Learning Outcomes

- Understand and implement common software construction patterns.
- Apply abstraction and encapsulation for scalable and maintainable code.
- Gain experience working with Java and Gradle in a modular structure.

