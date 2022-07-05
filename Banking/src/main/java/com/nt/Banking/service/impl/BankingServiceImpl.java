package com.nt.Banking.service.impl;

import java.util.Map;

import com.nt.Banking.model.Customers;
import com.nt.Banking.service.BankingService;
import com.nt.Banking.service.MoneyTransferService;
import com.nt.Banking.service.OpenAccount;
import com.nt.Banking.service.WithdrawService;

public class BankingServiceImpl implements BankingService{

	private OpenAccount openAccountSevice = new OpenAccountServiceImpl();
	private MoneyTransferService moneyTransferService = new MoneyTransferServiceImpl();
	private WithdrawService withdrawService = new WithdrawServiceImpl();
	
	@Override
	public Customers openBankAccount(String firstName, String lastName, String aadharID,String dob, String openingAmount,String branchName,String stateName) {
		Customers customer =	openAccountSevice.registerUser(firstName, lastName, aadharID,dob, openingAmount,branchName,stateName);
		return customer;
	}
	
	

	@Override
	public long checkBalance(String accountNo,Map<String, Customers> customerList) {
		
		Customers customer = customerList.get(accountNo);
		
		return Long.parseLong(customer.getBalanceAmount());
	}

	@Override
	public long depositAmount(String accNo, String amount,Map<String, Customers> customerList) {
		
		Customers customer = customerList.get(accNo);
		
		customer.setBalanceAmount(Long.toString(Long.parseLong(customer.getBalanceAmount()) + Long.parseLong(amount)));
		
		return Long.parseLong(customer.getBalanceAmount());
	}

	@Override
	public long withdrawAmount(String accNo, String amount, Map<String, Customers> customerList) {
		return withdrawService.withdrawAmount(accNo, amount, customerList);
	}

	@Override
	public boolean transferAmount(String senderAccNo, String receiverAccNo, String amount,
			Map<String, Customers> customerList) {
		
		boolean flag = moneyTransferService.transferAmount(senderAccNo, receiverAccNo, amount, customerList);
		
		return flag;
	}
	
	
}
