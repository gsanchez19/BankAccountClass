
public class BankAccount {

	private String name;
	private int accNum;
	private double balance;
	
	BankAccount()
	{
	
	name = "name";
	accNum = 55555	;
	balance = 0;
	
	}
	
	BankAccount(String name, int accNum, double balance)
	{
	this.name = name;
	this.accNum = accNum;
	this.balance = balance;	
	}
	
	public void deposit(double depositnum) 
	{
	balance += depositnum;
	}

	public void withdraw(double withdrawnum)
	{
	balance -= withdrawnum;
	}
	
	public  double getBalance()
	{
	return balance;
	}
	
	public String toString()
	{	
	return "The account is owned under the name: " + name + ", the account number is " + accNum + " and the current balance is" + balance;
	}


}

	