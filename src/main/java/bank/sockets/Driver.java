package bank.sockets;

import java.io.IOException;
import java.util.Arrays;

import bank.Bank;

public class Driver implements bank.BankDriver {

	@Override
	public void connect(String[] args) throws IOException {
		System.out.println("connect called with arguments " + Arrays.deepToString(args));
		// TODO a connection to the server should be established and the Bank proxy object can be created.
	}

	@Override
	public void disconnect() throws IOException {
		
	}

	@Override
	public Bank getBank() {
		return null;
	}
}
