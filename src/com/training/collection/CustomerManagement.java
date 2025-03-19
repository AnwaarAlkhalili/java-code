package com.training.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CustomerManagement {
    private static List<Customer> customers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Customer");
            System.out.println("2. Update Customer");
            System.out.println("3. Delete Customer");
            System.out.println("4. Show All Customers");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    updateCustomer();
                    break;
                case 3:
                    deleteCustomer();
                    break;
                case 4:
                    showCustomers();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void addCustomer() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        customers.add(new Customer(id, name, email));
        System.out.println("Customer added successfully!");
    }

    private static void updateCustomer() {
        System.out.print("Enter Customer ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                System.out.print("Enter new Name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new Email: ");
                String newEmail = scanner.nextLine();
                customer.setName(newName);
                customer.setEmail(newEmail);
                System.out.println("Customer updated successfully!");
                return;
            }
        }
        System.out.println("Customer not found!");
    }

    private static void deleteCustomer() {
        System.out.print("Enter Customer ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                customers.remove(customer);
                System.out.println("Customer deleted successfully!");
                return;
            }
        }
        System.out.println("Customer not found!");
    }

    private static void showCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers found!");
            return;
        }
        System.out.println("\nCustomer List:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}


//to chick or test you can use collection way rather than scanner way
//package com.training.exercise4;
//
//import java.util.ArrayList;
//import java.util.List;
//
//package com.training.exercise4;
//
//
//
//
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        CustomerManager manager = new CustomerManager();
//
//
//
//        // Add customers
//
//        manager.addCustomer(new Customer(1, "sara", "sara1@example.com"));
//
//        manager.addCustomer(new Customer(2, "Jeanan", "jeanan@example.com"));
//
//        manager.addCustomer(new Customer(3, "Anwaar", "anwaar@example.com"));
//
//
//
//
//
//        // Show all customers
//
//        System.out.println("\nAll customers:");
//
//        manager.showAllCustomers();
//
//
//
//        // Update a customer
//
//        manager.updateCustomer(1, "eman", "eman@example.com");
//
//
//
//        // Delete a customer
//
//        manager.deleteCustomer(3);
//
//
//
//        // Show all customers after update and delete
//
//        System.out.println("\nAll customers after update and delete:");
//
//        manager.showAllCustomers();
//
//    }
//
//}

//public class CustomerManager {
//    private List<Customer> customerList;
//
//    // Constructor
//    public CustomerManager() {
//        customerList = new ArrayList<>();
//    }
//
//    // Add a customer
//    public void addCustomer(Customer customer) {
//        customerList.add(customer);
//        System.out.println("Customer added: " + customer);
//    }
//
//    // Update customer information
//    public void updateCustomer(int id, String newName, String newEmail) {
//        for (Customer customer : customerList) {
//            if (customer.getId() == id) {
//                customer.setName(newName);
//                customer.setEmail(newEmail);
//                System.out.println("Customer updated: " + customer);
//                return;
//            }
//        }
//        System.out.println("Customer with id " + id + " not found.");
//    }
//
//    // Delete a customer by ID
//    public void deleteCustomer(int id) {
//        for (Customer customer : customerList) {
//            if (customer.getId() == id) {
//                customerList.remove(customer);
//                System.out.println("Customer deleted: " + customer);
//                return;
//            }
//        }
//        System.out.println("Customer with id " + id + " not found.");
//    }
//
//    // Show all customer details
//    public void showAllCustomers() {
//        if (customerList.isEmpty()) {
//            System.out.println("No customers found.");
//        } else {
//            for (Customer customer : customerList) {
//                System.out.println(customer);
//            }
//        }
//    }
//}
