package com.nt.Banking.service;

import java.util.Map;

import com.nt.Banking.model.Customers;

public interface WithdrawService {

	long withdrawAmount(String accNo, String amount, Map<String, Customers> cutomerList);
}
