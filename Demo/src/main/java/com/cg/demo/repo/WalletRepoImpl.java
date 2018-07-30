package com.cg.demo.repo;

import java.util.HashMap;
import java.util.Map;

import com.cg.demo.beans.Customer;

public class WalletRepoImpl implements WalletRepo{

	private static Map<String,Customer> customers=new HashMap<String,Customer>();
	public boolean save(Customer customer) {
		customers.put(customer.getMobileNo(),customer);
		return true;
	}

	public Customer findOne(String mobileNo) {
		Customer cust=new Customer();
		if((customers.get(mobileNo))!=null){
		return cust=customers.get(mobileNo);
		}
		return null;
	}

}
