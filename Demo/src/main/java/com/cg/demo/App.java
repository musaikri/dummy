package com.cg.demo;

import java.math.BigDecimal;
import java.util.Scanner;

import com.cg.demo.beans.Customer;
import com.cg.demo.service.WalletService;
import com.cg.demo.service.WalletServiceImpl;

public class App {

	public static void main(String[] args) {
		WalletService service=new WalletServiceImpl();
		int choice=0;
		do {
			Scanner scanner=new Scanner(System.in);
			printDetails();
			System.out.println("enter the choice:");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter name:");
				String name=scanner.next();
				System.out.println("enter mobile no:");
				String mobileNo=scanner.next();
				System.out.println("enter amount:");
				BigDecimal amount=scanner.nextBigDecimal();
				Customer cust=service.createAccount(name, mobileNo, amount);
				System.out.println(cust.toString());
				break;
			case 2:
				System.out.println("enter mobile no:");
				String mobileNo1=scanner.next();
				Customer cust1=service.showBalance(mobileNo1);
				System.out.println(cust1.toString());
				break;
			case 3:
				System.out.println("enter source mobile no:");
				String source=scanner.next();
				System.out.println("enter target mobile no:");
				String target=scanner.next();
				System.out.println("enter amount:");
				BigDecimal amount1=scanner.nextBigDecimal();
				Customer cust2=service.fundTransfer(source, target, amount1);
				System.out.println(cust2.toString());
				break;
			case 4:
				System.out.println("enter mobile no:");
				String mobileNo2=scanner.next();
				System.out.println("enter amount:");
				BigDecimal amount2=scanner.nextBigDecimal();
				Customer cust3=service.depositAmount(mobileNo2, amount2);
				System.out.println(cust3.toString());
				break;
			case 5:
				System.exit(0);
				System.out.println("thank you");
				break;
				default:
					System.out.println("enter correct option");
					break;
			}
		}while(choice!=5);
	}

	private static void printDetails() {
		System.out.println("1.Create Account");
		System.out.println("2.Show Balance");
		System.out.println("3.Fund Transfer");
		System.out.println("4.Deposit Amount");
		System.out.println("5.Exit");
		
	}

}
