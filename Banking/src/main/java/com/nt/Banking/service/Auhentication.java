package com.nt.Banking.service;

import com.nt.Banking.model.Customers;

public interface Auhentication {

	Customers checkValidCustomer(String accNo)throws Exception;
}
