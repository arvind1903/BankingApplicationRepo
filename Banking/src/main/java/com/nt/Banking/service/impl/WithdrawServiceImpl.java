package com.nt.Banking.service.impl;

import java.util.Map;

import com.nt.Banking.model.Customers;
import com.nt.Banking.service.WithdrawService;

public class WithdrawServiceImpl implements WithdrawService{

	@Override
	public long withdrawAmount(String accNo, String amount, Map<String, Customers> customerList) {
		
		Customers customer = customerList.get(accNo);
		
		customer.setBalanceAmount(Long.toString(Long.parseLong(customer.getBalanceAmount()) - Long.parseLong(amount)));
		
		return Long.parseLong(customer.getBalanceAmount());
	}

}
