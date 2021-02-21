# bank-assignment 2021

This is the framework which you will extend with subsequent assignments.
To allow you to fully concentrate on the distribution aspect, we have provided a user interface in class `bank.gui.ClientFX`. This program uses the interfaces `bank.Bank` and `bank.Account` to access the functionalities of the bank.

In order to access the implementation of the bank, the `bank.BankDriver` interface is defined. The client program uses this interface to establish or terminate the connection to the server.

	package bank;
	
	public interface BankDriver {
		void connect(String[] args);	// establish connection to the (remote) bank
		void disconnect();	// close connection to the (remote) bank
		Bank getBank();
	}

When the bank launcher is started, a class that implements interface  `BankDriver` must be specified as the first parameter. The launcher then loads this class and invokes method `connect` on an instance of this class and passes the remaining command line arguments as a string array. Arguments such as host or port numbers can be passed to the proxy implementation in this way.

In the example

	java bank.BankLauncher bank.sockets.Driver localhost 1234

the launcher loads the class `bank.sockets.Driver` and calls method `connect` defined in this class and passes as parameter a string array of length 2 with the two elements "localhost" and "1234".


In the following exercises the communication across computer boundaries will be realized with different technologies, i.e. in each exercise you will implement a new class which implements the `BankDriver` interface. Since it is a bit cumbersome to change the runtime arguments that are passed at startup, we have provided a "configuration chooser". The runtime arguments can be provided in the text file `src/main/resources/Servers.txt`. If the launcher `bank.BankLauncher` is started _without_ arguments, then the configuration can be chosen from the configurations provided in the `Servers.txt` file.

The GUI can then be started by double-clicking on the corresponding configuration.

The bank launcher can also be started from the console with the command

	gradlew run

or with

	gradlew run --args="bank.sockets.Driver localhost 1234"

if you want to use a special BankDriver implementation.
