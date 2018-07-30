package com.cg.demo.service;

import java.math.BigDecimal;

import com.cg.demo.beans.Customer;
import com.cg.demo.beans.Wallet;
import com.cg.demo.repo.WalletRepo;
import com.cg.demo.repo.WalletRepoImpl;

public class WalletServiceImpl implements WalletService{
WalletRepo repo=new WalletRepoImpl();
	public Customer createAccount(String name, String mobileNo, BigDecimal amount) {
	Customer cust=new Customer();
	Wallet wall=new Wallet();
	wall.setBalance(amount);
	cust.setMobileNo(mobileNo);
	cust.setName(name);
	cust.setWallet(wall);
	boolean status=repo.save(cust);
	if(status)
	{
		return cust; 
	}
	return null;
	}
	public Customer showBalance(String mobileNo) {
		Customer cust=new Customer();
		cust=repo.findOne(mobileNo);
		if(cust!=null)
		{
			return cust;
		}
		return null;
	}

	public Customer fundTransfer(String source, String target, BigDecimal amount) {
		Customer cust=new Customer();
		Customer cust1=new Customer();
		cust=repo.findOne(source);
		cust1=repo.findOne(target);
		if((cust!=null)&&(cust1!=null))
		{
			Wallet wallet=cust.getWallet();
			BigDecimal money=wallet.getBalance();
			BigDecimal update=money.subtract(amount);
			wallet.setBalance(update);
			
			Wallet wallet1=cust1.getWallet();
			BigDecimal money1=wallet.getBalance();
			BigDecimal update1=money1.add(amount);
			wallet1.setBalance(update1);
			repo.save(cust);
			repo.save(cust1);
			return cust;
			
		}
		return null;
	}

	public Customer depositAmount(String mobileNo, BigDecimal amount) {
		Customer cust=new Customer();
		
		cust=repo.findOne(mobileNo);
		
		if((cust!=null))
		{
			Wallet wallet=cust.getWallet();
			BigDecimal money=wallet.getBalance();
			BigDecimal update=money.add(amount);
			wallet.setBalance(update);
			repo.save(cust);
			return cust;
	}
return null;
}
}
