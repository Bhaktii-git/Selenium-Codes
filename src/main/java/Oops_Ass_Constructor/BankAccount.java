package Oops_Ass_Constructor;

import java.awt.geom.Arc2D.Double;

public class BankAccount {
	
	String accountHolderName;
	String accountNumber;
	double balance;
	
	public BankAccount()
	{
		accountHolderName ="Priya Sharma";
		accountNumber="987654321";
		balance=1000;
		
		
	}
	public double checkBalance()
	{
		
		return balance;
	}
	public double deposit(double amount ) {
		 balance=balance +amount;
		System.out.println ("Deposite of " +amount+" Suscessfully.Updated Balance:"+balance);
		return balance;	
		
	}
	
	public double withdrow(double amount) {
		
		if (balance> amount  ) {
			balance=balance -amount;
			System.out.println ("withdrow  of " +amount+" Suscessfully.Updated Balance:"+balance);
		}else {
			System.out.println ("Insufficient Balance. Current Balance is "+balance);
		}
		
		return balance ;
		
	}
	public static void main(String[] args) {
		
		BankAccount a=new BankAccount();
		System.out.println("Account Holder: "+a.accountHolderName);
		System.out.println("Account Number : "+a.accountNumber);
		a.deposit(5000);
		a.checkBalance();
		a.withdrow(3000);
		System.out.println("Current Balance :"+a.checkBalance());
		
		
		

	}

}
