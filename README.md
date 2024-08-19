The GoShopping App is a Java-based application that simulates a shopping system with different types of user accounts. This project provides an object-oriented approach to handling various customer account types and their shopping experiences. The application is designed with a focus on inheritance, polymorphism, and abstraction, showcasing the principles of object-oriented programming.

Features
ShopAcc Class: The base class that defines the general properties and methods of a shopping account.
PrimeAcc Class: Inherits from ShopAcc and represents a premium account with additional benefits like free delivery.
GSPrimeAcc Class: A specific implementation of PrimeAcc for the GoShopping App, adding more customized features.
GSNormalAcc Class: Inherits from ShopAcc and represents a normal account with standard shopping options.
GoShoppingApp Class: The main driver class that ties together the various account types and simulates the shopping experience.
Key Concepts
Inheritance: The project demonstrates how different types of accounts (Prime, Normal) inherit common properties from a base class (ShopAcc).
Polymorphism: Methods are overridden in child classes to provide specific implementations while maintaining a common interface.
Abstraction: The project uses abstract classes to define the core functionalities, which are then implemented by concrete classes.
Getting Started
Clone the repository:
bash
Copy code
git clone https://github.com/yourusername/GoShoppingApp.git
Compile the Java files:
bash
Copy code
javac *.java
Run the application:
bash
Copy code
java GoShoppingApp
Requirements
Java 8 or above
Project Structure
ShopAcc.java: Base class for all account types.
PrimeAcc.java: Abstract class for premium accounts.
GSPrimeAcc.java: Implementation of premium accounts for the GoShopping App.
GSNormalAcc.java: Implementation of normal accounts for the GoShopping App.
GoShoppingApp.java: Main class to execute the application.
