package day3;

import java.util.Scanner;

public class EMI_Calculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter loan amount in U.S. dollars ($)...");
		double principal = scanner.nextDouble(); // The value of principal loan amount (P)
		
		System.out.println("Enter annual interest rate percent (%)...");
		double annualInterestRate = scanner.nextDouble();
		
		System.out.println("Enter loan tenure in years...");
		double tenureYears = scanner.nextDouble();
		scanner.close();
		
		double tenureMonths = tenureYears * 12; // The value of total number of payments/months (N)
		
		double monthlyInterestRate = annualInterestRate / (12 * 100); // The value of monthly interest rate (R)
		
		// (EMI) is: EMI = P * R * (1 + R)^N / ((1 + R)^N - 1) where P is the principal loan amount, R is the monthly interest rate, and N is the total number of payments/months.
		
		double emi = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, tenureMonths))
						/ (Math.pow(1 + monthlyInterestRate, tenureMonths) - 1);
		
		System.out.println("Your monthly EMI is: " + emi);

	}

}
