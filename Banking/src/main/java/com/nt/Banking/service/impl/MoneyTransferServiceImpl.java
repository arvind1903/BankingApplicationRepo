package com.nt.Banking.service.impl;

import java.util.Map;

import com.nt.Banking.model.Customers;
import com.nt.Banking.service.MoneyTransferService;

public class MoneyTransferServiceImpl implements MoneyTransferService {

	@Override
	public boolean transferAmount(String senderAccNo, String receiverAccNo, String amount,
			Map<String, Customers> customerList) {
		Customers senderCustomer = customerList.get(senderAccNo);
		
		Customers receiverCustomer = customerList.get(receiverAccNo);
		
		if (senderCustomer == null || receiverCustomer == null) {
			return false;
		}
		
		senderCustomer.setBalanceAmount(Long.toString(Long.parseLong(senderCustomer.getBalanceAmount()) - Long.parseLong(amount)));
		
		receiverCustomer.setBalanceAmount(Long.toString(Long.parseLong(receiverCustomer.getBalanceAmount()) + Long.parseLong(amount)));

		
		return true;
	}
}
