package com.nt.Banking.service.impl;

import com.nt.Banking.model.Customers;
import com.nt.Banking.service.OpenAccount;
import com.nt.Banking.utility.Utility;

public class OpenAccountServiceImpl implements OpenAccount{

	@Override
	public Customers registerUser(String firstName, String lastName, String uniqueIDNo,String dob, String openingAmount,String branchName,String stateName) {
		
		Customers cust = new Customers();
		cust.setFirstName(firstName);
		cust.setLastName(lastName);
		cust.setBalanceAmount(openingAmount);
		cust.setUniqueIDno(uniqueIDNo);
		cust.setAccountNo(Utility.createAccountNumber(dob, branchName, stateName));
		
		return cust;
	}

}
