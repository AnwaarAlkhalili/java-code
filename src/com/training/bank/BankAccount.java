package com.training.bank;
import java.util.Scanner;
class BankAccount { // protected // private // default
	
	String accountHolderName;
	
	void display() {
		int age = 21; // Local variable
		
	}

	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Account Number");
//		int accountNumber = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter Name");
//		String Name = sc.nextLine();
//		System.out.println("Enter Rate of interrest");
//		double roi = sc.nextDouble();
//		System.out.println("Enter Amount");
//		double amount = sc.nextDouble();
//		SavingAccount account1 = new SavingAccount(accountNumber, Name, roi,amount);
//		System.out.println(account1);
		
//		System.out.println("Total amount after one year is: " + account1.calculate(account1.getAmount(),
//				account1.getRoi()));
		
		//must ensure the value not chang max 4 or less than 4
//		String[] names = new String[4];
//		names[0] = "Ahmed";
//		names[1] = "Sara";
//		names[2] = "Hamed";
//		names[3] = "Noor";
		
//		for(int i=0; i<names.length; i++) {
//			System.out.println(names[i]);
//		}
		
	
        Account account1 = new SavingAccount(1234, "John", 1000, 5, 200);
        
        System.out.println(account1.display());
					
		// سأل المستخدم عن عدد العملاء الذين يرغب في إدخال بياناتهم
//		System.out.println("Enter the number of customers:");
//		int numCustomers = sc.nextInt();
//		sc.nextLine(); // لمسح السطر المتبقي

		// مصفوفة لتخزين حسابات العملاء
//		SavingAccount[] accounts = new SavingAccount[numCustomers];

		// حلقة لتمكين المستخدم من إدخال بيانات كل عميل
//		for (int i = 0; i < numCustomers; i++) {
//		    System.out.println("Enter Account Number for Customer " + (i + 1) + ":");
//		    int accountNumber1 = sc.nextInt();
//		    sc.nextLine();  // لمسح السطر المتبقي
		    
//		    System.out.println("Enter Name for Customer " + (i + 1) + ":");
//		    String name = sc.nextLine();
		    
//		    System.out.println("Enter Rate of Interest for Customer " + (i + 1) + ":");
//		    double roi1 = sc.nextDouble();
		    
//		    System.out.println("Enter Amount for Customer " + (i + 1) + ":");
//		    double amount1 = sc.nextDouble();
//		    sc.nextLine();  // لمسح السطر المتبقي
		    
		    // إنشاء حساب توفير لكل عميل باستخدام المدخلات
//		    SavingAccount account = new SavingAccount(accountNumber1, name, roi1, amount1);
//		    accounts[i] = account; // تخزين الحساب في المصفوفة
//		}
		
		

		// طباعة تفاصيل كل حساب والرصيد بعد سنة لكل عميل
//		System.out.println("\nCustomer Account Details:");
//		for (int i = 0; i < numCustomers; i++) {
//		    SavingAccount account = accounts[i];
//		    System.out.println(account); // طباعة تفاصيل الحساب
//		    System.out.println(); // فصل بين الحسابات
//		}
// calculat the max
		
		//String
//		String str1 = new String("David");
//		String str2 = new String("David");
//		String str3 = "Thomas"; //call String literal
//		str1 = str2;
//		System.out.println(str1.equals (str2));
		
//	}
		
//	   System.out.println("Welcome to my Bank!");
//	   System.out.println("Frist Argument: " + args[0]);
	   
//	   BankAccount account1 = new BankAccount();
//	   account1.accountHolderName = "David";
	   
//	   short s = 10;
//	   int i = 5;
//	   s = (short)i;
//	   i = s;
//	   System.out.println(i);
	   
//	SavingAccount account1=new SavingAccount(123, "Anwaar", 1000,5,200);
  
	}

}

/*
 * Create a class name SAVINACCOUNT with attributes ACCOUNTNUMBER, NAME, ROI, AND AMOUNT 
 * create a method calculate inside this class and return the total amount after one year.
 *  
 * 
 */

/*
 * OOPs concepts
 * 
 * Encapsulation: Data Binding : example-class
 * Inheritance: one class in to others main class subclass (relationship)
 * Polymorphism: compile time, run time
 * Abstraction: abstract class or interface
 */

