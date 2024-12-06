package com.annum.www;

public class Account {

	private String accountNumber;
	private double balance;
	
	public Account(String accountNumber, double balance) 
	{
		//validate accountNumber
		if(accountNumber == null || accountNumber.isEmpty())
		{
			System.err.println("Error: AccountNumber is can not be null or empty");
		   return;
		}
		//validate balance
		if(balance<0)
		{
			System.err.println("Error: balance cannot be negative");
			return;
		}
		this.accountNumber=accountNumber;
		this.balance=balance;
		
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1=new Account("12300929",55000);
		System.out.println("Account numbar is : "+account1.accountNumber);
		System.out.println("Amount   is : "+account1.balance);
		
		System.out.println("=================");
		
		Account account2=new Account("",28192);
		
		System.out.println("=================");

		Account account3= new Account("12893839",-283.20);
	}

}
