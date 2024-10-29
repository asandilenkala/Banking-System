Banking ATM System

This project is a simple Banking ATM System built using Java for the frontend and MySQL for the backend. The system enables users to log in, view account details, and perform transactions in a simulated banking environment.
Features

    Login Authentication: Secure login for users based on Card Number and PIN.
    Account Management: Users can view their account information and perform basic transactions.
    Database Integration: Uses MySQL to store user account and transaction data.

Technologies Used

    Java: For the frontend UI and business logic.
    Swing: Java's GUI toolkit for building the interface.
    MySQL: Backend database for storing account and transaction details.
    JDBC (Java Database Connectivity): For connecting Java with MySQL.

Requirements

    Java Development Kit (JDK) 8 or above.
    MySQL version 5.7 or above.
    JDBC Driver for MySQL (Connector/J).

Setup Instructions
1. Clone the Repository

bash

git clone <repository-url>
cd <project-folder>

2. Set Up the Database

    Open MySQL and create a new database:

    sql

CREATE DATABASE bankingSystem;

Create tables for storing account information and transactions:

sql

    CREATE TABLE login (
        cardno VARCHAR(20) PRIMARY KEY,
        pin VARCHAR(20)
    );

    CREATE TABLE signUp (
        form VARCHAR(20),
        firstName VARCHAR(50),
        lastName VARCHAR(50),
        dob DATE,
        gender VARCHAR(10),
        email VARCHAR(50),
        marital VARCHAR(20),
        address VARCHAR(100),
        city VARCHAR(50),
        state VARCHAR(50),
        pin VARCHAR(20)
    );

    CREATE TABLE transactions (
        id INT AUTO_INCREMENT PRIMARY KEY,
        cardno VARCHAR(20),
        date DATE,
        type VARCHAR(20),
        amount DECIMAL(10, 2)
    );

3. Configure Database Connection

Update the DBModel class with your MySQL credentials:

java

connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingSystem", "root", "yourPassword");

4. Run the Application

Compile and run the application:

bash

javac Login.java
java Login

Usage

    Launch the application.
    Enter your Card Number and PIN to log in.
    Use the Sign Up option if you don't have an account.
    View account details or perform transactions after logging in.

Sample Screenshots

Contributing

Contributions are welcome! Please open a pull request with your proposed changes.
License

This project is licensed under the MIT License.
