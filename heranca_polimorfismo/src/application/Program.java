package application;

import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
			
		Account acc = new Account(1001, "Vinicius" , 0.0);
		
		BussinesAccount bacc = new BussinesAccount(1002, "Maria ", 0.0, 500.00);
		
		//UPCASTING
		
		Account acc2 = new BussinesAccount(1003, "Bob", 1000.00, 500.00);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 1.10);
		
		
		//DOWNCASTING
		
		BussinesAccount acc4 = (BussinesAccount)acc2;
		acc4.loan(100.0);
		
		//BussinesAccount acc5 = (BussinesAccount)acc3;
		
		if (acc3 instanceof BussinesAccount){
			BussinesAccount acc5 = (BussinesAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
	
		
		//saque classe account normal
		Account acc0 = new Account(1001, "Alex" , 1000.0);
		acc0.withdraw(200.00);
		System.out.println(acc0.getBalance());
		
		// saque classe savingsaccount pos override
		Account acc1 = new SavingsAccount(1010, "Vinicius", 1000.00, 1.10);
			acc1.withdraw(200.00);
			System.out.println(acc1.getBalance());

			//Saque classe bussinesAccount pos override de saque com desconto de 2.0 usando acc2 criado em UPCASTING
			Account acc7 = new BussinesAccount(1020, "Vinni", 1000.00, 500.00);
			acc7.withdraw(200.00);
			System.out.println(acc7.getBalance());
			
			
			
		
	}
	
	

}
