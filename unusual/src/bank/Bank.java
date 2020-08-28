package bank;

import javax.naming.NamingException;

public class Bank {
	double balance=100;
	public Bank(double balance) {
		
	}
	public void withDrawal(double dAmount)throws Exception{
		if(dAmount>balance) {
			throw new InsufficientResourcesException();
		}if(dAmount<0) {
			throw new NamingException();
		}
		balance = balance - dAmount;
	}

}
