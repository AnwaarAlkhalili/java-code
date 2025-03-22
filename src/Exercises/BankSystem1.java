package Exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount1> accounts = new ArrayList<>();

        // Ask user for account details
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        // Create a new account
        BankAccount1 account = new BankAccount1(accountNumber, accountHolder, balance);
        accounts.add(account);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Account Info");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Enter deposit amount: ");
                    double amount = scanner.nextDouble();
                    account.deposit(amount);
                } else if (choice == 2) {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = scanner.nextDouble();
                    account.withdraw(amount);
                } else if (choice == 3) {
                    System.out.println(account.getAccountInfo());
                } else if (choice == 4) {
                    System.out.println("Exiting... Thank you!");
                    break;
                } else {
                    System.out.println("Invalid choice! Please try again.");
                }
            } catch (BankAccount1.InvalidAmountException | BankAccount1.InsufficientFundsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}

