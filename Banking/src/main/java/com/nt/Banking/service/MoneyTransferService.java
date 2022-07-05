package com.nt.Banking.service;

import java.util.Map;

import com.nt.Banking.model.Customers;

public interface MoneyTransferService {

	boolean transferAmount(String senderAccNo, String receiverAccNo, String amount, Map<String, Customers> cutomerList);
}
