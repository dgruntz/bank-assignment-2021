/*
 * Copyright (c) 2020 Fachhochschule Nordwestschweiz (FHNW)
 * All Rights Reserved. 
 */

package bank.local;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import bank.InactiveException;
import bank.OverdrawException;

public class Driver implements bank.BankDriver {
	private Bank bank = null;

	@Override
	public void connect(String[] args) {
		bank = new Bank();
		System.out.println("connected...");
	}

	@Override
	public void disconnect() {
		bank = null;
		System.out.println("disconnected...");
	}

	@Override
	public bank.Bank getBank() {
		return bank;
	}

	public static class Bank implements bank.Bank {

		private final Map<String, Account> accounts = new HashMap<>();

		@Override
		public Set<String> getAccountNumbers() {
			System.out.println("Bank.getAccountNumbers has to be implemented");
			return new HashSet<String>(); // TODO has to be replaced
		}

		@Override
		public String createAccount(String owner) {
			// TODO has to be implemented
			System.out.println("Bank.createAccount has to be implemented");
			return null;
		}

		@Override
		public boolean closeAccount(String number) {
			// TODO has to be implemented
			System.out.println("Bank.closeAccount has to be implemented");
			return false;
		}

		@Override
		public bank.Account getAccount(String number) {
			return accounts.get(number);
		}

		@Override
		public void transfer(bank.Account from, bank.Account to, double amount)
				throws IOException, InactiveException, OverdrawException {
			// TODO has to be implemented
			System.out.println("Bank.transfer has to be implemented");
		}

	}

	private static class Account implements bank.Account {
		private String number;
		private String owner;
		private double balance;
		private boolean active = true;

		private Account(String owner) {
			this.owner = owner;
			// TODO account number has to be set here or has to be passed using the constructor
		}

		@Override
		public double getBalance() {
			return balance;
		}

		@Override
		public String getOwner() {
			return owner;
		}

		@Override
		public String getNumber() {
			return number;
		}

		@Override
		public boolean isActive() {
			return active;
		}

		@Override
		public void deposit(double amount) throws InactiveException {
			// TODO has to be implemented
			System.out.println("Account.deposit has to be implemented");
		}

		@Override
		public void withdraw(double amount) throws InactiveException, OverdrawException {
			// TODO has to be implemented
			System.out.println("Account.withdraw has to be implemented");
		}

	}

}