# EMI Calculator (Java)

A simple **Java console application** that calculates the **Equated Monthly Installment (EMI)** for a loan based on user input.

This project is useful for understanding:

* Basic Java syntax
* User input using `Scanner`
* Mathematical formulas in Java
* Loan EMI calculation logic

---

## 📌 What is EMI?

**EMI (Equated Monthly Installment)** is the fixed payment amount a borrower pays every month to repay a loan, including interest and principal.

---

## 🧮 EMI Formula Used

[
\text{EMI} = \frac{P \times R \times (1 + R)^N}{(1 + R)^N - 1}
]

Where:

* **P** = Principal loan amount
* **R** = Monthly interest rate
* **N** = Total number of monthly payments

---

## 🚀 Features

* Takes loan details as user input
* Converts annual interest rate to monthly rate
* Converts loan tenure from years to months
* Calculates and displays monthly EMI

---

## 🛠️ Technologies Used

* Java
* Java Math Library (`Math.pow`)
* Java Scanner (`java.util.Scanner`)

---

## ▶️ How to Run

1. Clone or download the repository
2. Open the project in any Java IDE (IntelliJ, Eclipse, VS Code, etc.)
3. Compile and run the `EMI_Calculator.java` file
4. Enter the required values when prompted

---

## 💻 Sample Input

```
Enter loan amount in U.S. dollars ($)...
10000
Enter annual interest rate percent (%)...
10
Enter loan tenure in years...
2
```

## 📤 Sample Output

```
Your estimated monthly EMI payment is: $461.45
```

*(Output value may vary slightly due to decimal precision)*

---

## 📂 Project Structure

```
day3/
 └── EMI_Calculator.java
```

---

## 📘 Code Overview

```java
double emi = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, tenureMonths))
             / (Math.pow(1 + monthlyInterestRate, tenureMonths) - 1);
```

This line applies the EMI formula using Java’s `Math.pow()` function.

---

## ✅ Requirements

* Java JDK 8 or higher
* Basic understanding of Java and mathematics

---

## 🧑‍💻 Author

Created as a learning exercise to practice Java fundamentals and real-world financial calculations.

