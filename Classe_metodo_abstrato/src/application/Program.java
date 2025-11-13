package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();

		list.add(new SavingsAccount(1001, "alex", 500.0, 1.0));
		list.add(new BussinesAccount(1002, "Vini", 500.00, 100.00));
		list.add(new SavingsAccount(1003, "Bruno", 100.00, 1.0));
		list.add(new BussinesAccount(1004, "Bia", 400.00, 300.00));
		list.add(new SavingsAccount(1006, "Luiz", 700.00, 1.2));

		double sum = 0.0;

		for (Account acc : list) {
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);

		for (Account acc : list) {
			 acc.deposit(10.0);
		}
		for (Account acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n",acc.getNumber(), acc.getBalance());
		}
	}

}
