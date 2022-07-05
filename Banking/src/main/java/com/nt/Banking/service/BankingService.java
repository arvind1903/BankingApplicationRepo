package com.nt.Banking.service;

import java.util.Map;

import com.nt.Banking.model.Customers;

public interface BankingService {
	
	Customers openBankAccount(String firstName,String lastName,String aadharID,String dob,String openingAmount,String branchName,String stateName);
	
	long checkBalance(String accountNo,Map<String, Customers> consumerList);

	long depositAmount(String accNo, String amount,Map<String, Customers> customerList);

	long withdrawAmount(String accNo, String amount, Map<String, Customers> cutomerList);

	boolean transferAmount(String senderAccNo, String receiverAccNo, String amount, Map<String, Customers> cutomerList);
}
