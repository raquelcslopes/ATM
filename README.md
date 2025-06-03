# ATM

This project is a simulation of an Automated Teller Machine (ATM) system in Java.

## Features
- Card management
- Withdraw and deposit operations
- Balance checking
- Permission control and custom exceptions

## Project Structure
- `ATM.java`: Main ATM logic
- `Card.java`: Bank card representation
- `ATMException.java`: Base exception for the system
- `NotEnoughFundsException.java`: Exception for insufficient funds
- `NotEnoughPermissionsException.java`: Exception for insufficient permissions
- `Main.java`: Main class to run the program

## How to Run
1. Compile all Java files:
   ```sh
   javac src/*.java
   ```
2. Run the main class:
   ```sh
   java -cp src Main
   ```

## Requirements
- Java 8 or higher
