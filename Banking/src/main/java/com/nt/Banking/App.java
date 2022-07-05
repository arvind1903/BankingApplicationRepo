package com.nt.Banking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.nt.Banking.model.Customers;
import com.nt.Banking.service.BankingService;
import com.nt.Banking.service.impl.BankingServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BankingService service = new BankingServiceImpl();
    	System.out.println("Welcome to State Bank of India");
    	System.out.println("Please select the option from below");
    	
    	Map<String,Customers> cutomerList = new HashMap();    	
    	List<String> bankingOption =  new ArrayList<String>();
    	
    	bankingOption.add("1.Open Account");
    	bankingOption.add("2.Check Balance");
    	bankingOption.add("3.Deposit Amount");
    	bankingOption.add("4.Withdraw Amount");
    	bankingOption.add("5.Transfer Amount");
    	
    	bankingOption.forEach(cust->{
    		System.out.println(cust);
    	});
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	String inputOption = scanner.next();
    	
    	boolean flag = true;
    	
		while (flag) {

			switch (inputOption) {

			case "1":
				
				System.out.println(" Customer First Name ");
				String name = scanner.next();
				
				System.out.println(" Customer Last Name");
				String lastName = scanner.next();
				
				System.out.println(" Customer aadhar number");
				String aadharNo = scanner.next();
				
				System.out.println(" Customer Date of Birth");
				String dob = scanner.next();
				
				System.out.println(" please pay minimum opening balance amount");
				String amount = scanner.next();
				
				
				//Date of birth conversion
				dob = dob.replace("-", "");
				
				Customers customer = service.openBankAccount(name, lastName, aadharNo, dob, amount, "SBI00011",
						"MH");

				cutomerList.put(customer.getAccountNo(), customer);
				System.out.println(" your Account is opened Successfully "+customer.getAccountNo());
				break;
			case "2":
				
				System.out.println(" Enter Account Number");
				String accNo = scanner.next();
				long balance = service.checkBalance(accNo, cutomerList);
				System.out.println(" Balance in account "+balance);
				break;
			case "3":
				
				System.out.println(" please enter Deposit Amount");
				amount = scanner.next();
				
				System.out.println(" Enter the Account Number");
				accNo = scanner.next();
				balance =  service.depositAmount(accNo,amount,cutomerList);
				System.out.println(" current balance "+balance);
				
				break;
			case "4":
				System.out.println(" Enter the Account Number");
				accNo = scanner.next();
				
				System.out.println(" please enter Withdraw Amount ");
				amount = scanner.next();
				balance =  service.withdrawAmount(accNo,amount,cutomerList);
				break;
			case "5":
				
				System.out.println("Enter Sender Account Number");
				String senderAccNo = scanner.next();
				
				System.out.println("Enter Receiver Account Number");
				String receiverAccNo = scanner.next();
				
				System.out.println("Enter the Amount to transfer");
				amount = scanner.next();
				
				service.transferAmount(senderAccNo,receiverAccNo,amount,cutomerList);
				
				break;
			default:
				flag = false;
				System.out.println("Logging Out.. please Visit Again");
				return;
			}
			
			bankingOption.forEach(cust->{
	    		System.out.println(cust);
	    	});

			inputOption = scanner.next();
		}
    	
    	System.out.println(" exit the system");
    	
    	
    }
}
