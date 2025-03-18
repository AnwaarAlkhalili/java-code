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

package com.training.bank;
import java.util.ArrayList;
import java.util.Scanner;
class BankAccount { // protected // private // default
	
	String accountHolderName;
	
	void display() {
		int age = 21; // Local variable
		
	}
     
    private static ArrayList<SavingAccount> accounts = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
	
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
        
        



                while (true) {  // استمرار عرض القائمة
                    System.out.println("Select an option:");
                    System.out.println("1. Add an Account");
                    System.out.println("2. Deposit Money");
                    System.out.println("3. Withdraw Money");
                    System.out.println("4. Check Balance");
                    System.out.println("5. Exit");

                    int choice = sc.nextInt();  // قراءة الاختيار
                    sc.nextLine();  // استهلاك السطر بعد الإدخال

                    switch (choice) {
                        case 1:
                            addAccount();  // إضافة حساب جديد
                            break;
                        case 2:
                            depositMoney();  // إيداع الأموال
                            break;
                        case 3:
                            withdrawMoney();  // سحب الأموال
                            break;
                        case 4:
                            checkBalance();  // عرض الرصيد
                            break;
                        case 5:
                            System.out.println("Exiting the application...");
                            System.exit(0);  // الخروج من البرنامج
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");  // خيار غير صحيح
                    }
                }
            }

            // إضافة حساب جديد
            public static void addAccount() {
                System.out.println("Enter Account Number:");
                int accountNumber = sc.nextInt();
                sc.nextLine();  // استهلاك السطر المتبقي
                System.out.println("Enter Account Holder Name:");
                String name = sc.nextLine();
                System.out.println("Enter Rate of Interest (ROI):");
                double roi = sc.nextDouble();
                System.out.println("Enter Amount:");
                double amount = sc.nextDouble();
                System.out.println("Enter Minimum Balance:");
                double minBalance = sc.nextDouble();

                SavingAccount newAccount = new SavingAccount(accountNumber, name, roi, amount, minBalance);
                accounts.add(newAccount);
                System.out.println("Account created successfully!");
            }

            // إيداع الأموال في الحساب
            public static void depositMoney() {
                System.out.println("Enter Account Number to Deposit:");
                int accountNumber = sc.nextInt();
                System.out.println("Enter Amount to Deposit:");
                double depositAmount = sc.nextDouble();

                boolean accountFound = false;
                for (SavingAccount account : accounts) {
                    if (account.getAccountNumber() == accountNumber) {
                        account.setAmount(account.getAmount() + depositAmount);
                        System.out.println("Deposited " + depositAmount + " successfully!");
                        accountFound = true;
                        break;
                    }
                }

                if (!accountFound) {
                    System.out.println("Account not found.");
                }
            }

            // سحب الأموال من الحساب
            public static void withdrawMoney() {
                System.out.println("Enter Account Number to Withdraw from:");
                int accountNumber = sc.nextInt();
                System.out.println("Enter Amount to Withdraw:");
                double withdrawAmount = sc.nextDouble();

                boolean accountFound = false; // متغير للتأكد من وجود الحساب
                for (SavingAccount account : accounts) { // التحقق من وجود الحساب بناءً على رقم الحساب
                    if (account.getAccountNumber() == accountNumber) {
                        accountFound = true; // إذا تم العثور على الحساب
                        if (account.getAmount() - withdrawAmount >= account.getMinBalance()) { // التحقق من أن الرصيد بعد السحب لا يقل عن الحد الأدنى
                            account.setAmount(account.getAmount() - withdrawAmount); // تعديل الرصيد
                            System.out.println("Withdrawn " + withdrawAmount + " successfully! New balance: " + account.getAmount());
                        } else { // إذا كان الرصيد بعد السحب سيقل عن الحد الأدنى
                            System.out.println("Error: Insufficient funds to maintain minimum balance.");
                        }
                        break; // الخروج من الحلقة عند العثور على الحساب
                    }
                }

                if (!accountFound) { // إذا لم يتم العثور على الحساب
                    System.out.println("Account not found!");
                }

            }

            // عرض الرصيد في الحساب
            public static void checkBalance() {
                System.out.println("Enter Account Number to Check Balance:");
                int accountNumber = sc.nextInt();

                boolean accountFound = false;
                for (SavingAccount account : accounts) {
                    if (account.getAccountNumber() == accountNumber) {
                        System.out.println("Account Holder: " + account.getAccountHolderName());
                        System.out.println("Balance: " + account.getAmount());
                        accountFound = true;
                        break;
                    }
                }

                if (!accountFound) {
                    System.out.println("Account not found.");
                }
            }
        

  
	}





