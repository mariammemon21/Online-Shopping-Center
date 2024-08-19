The GoShopping App is a Java-based application designed to simulate a shopping system, featuring various account types with different privileges and functionalities. This project is an excellent demonstration of object-oriented programming (OOP) concepts, including inheritance, polymorphism, and abstraction.


Features

ShopAcc: The base class for all account types, defining general attributes and methods.
PrimeAcc: An abstract class extending ShopAcc, representing a premium account with benefits like free delivery.
GSPrimeAcc: A concrete implementation of PrimeAcc with customized features for the GoShopping App.
GSNormalAcc: A subclass of ShopAcc, representing a standard user account with basic shopping capabilities.
GoShoppingApp: The main class that drives the application, simulating the entire shopping process.

Project Structure

ShopAcc.java: Defines the base properties and behaviors for all shopping accounts.
PrimeAcc.java: Abstract class for premium accounts, extending the ShopAcc class.
GSPrimeAcc.java: Specific implementation of the PrimeAcc class with custom features.
GSNormalAcc.java: Implementation of a standard shopping account.
GoShoppingApp.java: The main entry point for the application.
