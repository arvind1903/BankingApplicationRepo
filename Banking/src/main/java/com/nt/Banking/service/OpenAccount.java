package com.nt.Banking.service;

import com.nt.Banking.model.Customers;

public interface OpenAccount {

	Customers registerUser(String firstName,String lastName,String uniqueIDNo,String dob,String openingAmount,String branchName,String stateName);
}
