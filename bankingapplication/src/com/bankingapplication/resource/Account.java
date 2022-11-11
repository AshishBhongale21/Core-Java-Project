package com.bankingapplication.resource;

import java.util.Scanner;

public class Account {

	// Class Variables
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;

	// Class Constructor
	public Account(String customerName, String customerId, int balance) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.balance = balance;
	}

	// Depositing Money
	public void depositeMoney(int amount) {

		if (amount != 0) {
			balance += amount;
			previousTransaction = amount;
		}
	}

	// Withdrawing Money
	public void withrawing(int amount) {
		if (amount <= balance) {
			balance -= amount;
			previousTransaction = -amount;
		}
		else  {
			System.out.println("Insuffuciant Amount");
		}
	}

	// Previous Transaction
	public void getpreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited : " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withrawn : " + Math.abs(previousTransaction));
		} else {
			System.out.println("No Trensaction Occured");
		}
	}

	// Function to calculation interest of current fund after a number of years

	public void calculateIntrest(int years) {
		double interestRate = 0.2;
		double newBalance = (balance * interestRate * years) + balance;
		System.out.println("The Current intrace Rate is " + (100 * interestRate));
		System.out.println("After " + years + "Years, of your balace will be : " + newBalance);
	}

	// To showing the main Menu
	public void showMenu() {
		    int option = 0;
		    Scanner scanner = new Scanner(System.in); 
	        
			System.out.println("Welcome " + customerName + "...!");
			System.out.println("Your ID is : " + customerId);
			System.out.println("\n");
			System.out.println("What would you like to do? ");
			System.out.println("1 : Check Your Balance.");
			System.out.println("2 : Deposite Your Amount");
			System.out.println("3 : Withdraw Your Amount");
			System.out.println("4 : View Previous Transaction");
			System.out.println("5 " + ": Calculate Your Intreset");
			System.out.println("6 : Exit ");

			do {
				System.out.println();
				System.out.println("Enter An Option : ");
				int option1 = scanner.nextInt();
				System.out.println();

				switch (option1) {
				case 1:
					System.out.println("==============================");
					System.out.println("Balance = $" + balance);
					System.out.println("==============================");
					System.out.println();
					break;

				case 2:
					System.out.println("Enter An Ammount to Deposit :");
					int amount = scanner.nextInt();
					depositeMoney(amount);
					System.out.println();
					break;

				case 3:
					System.out.println("Enter An Ammount to Withdraw");
					int amount2 = scanner.nextInt();
					withrawing(amount2);
					System.out.println();
					break;

				case 4:
					System.out.println("==============================");
					getpreviousTransaction();
					System.out.println("==============================");
					System.out.println();
					break;

				case 5:
					System.out.println("Enter How many yeras of accured intrest : ");
					int years = scanner.nextInt();
					calculateIntrest(years);
					System.out.println();
					break;

				case 6:
					System.out.println("==============================");

					break;

				default:
					System.out.println(" Error: invalid enter. Please enter 1,2,3,4,5,6");
					break;
				}
			} while (option != 6);
			System.out.println(" Thank you for banking with us...!");
		}
	}
	

