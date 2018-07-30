package com.cg.demo.repo;

import com.cg.demo.beans.Customer;

public interface WalletRepo {
public boolean save(Customer customer);
public Customer findOne(String mobileNo);
}
