package com.nt.Banking.utility;

public class Utility {

	
	public static String createAccountNumber(String dob,String branchName,String stateName) {
		return stateName+branchName+dob;
		
	}
}
