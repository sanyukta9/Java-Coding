
/**
 * Assume that two brothers, Joe and John, share a common bank account. 
 * They both can, independently, read the balance, make a deposit, and withdraw some money. 
 * Implement  java application demonstrate how the transaction in a bank can be carried out concurrently.
 */


public class concurrencyBankUsingThreads {
			public static void main(String[] args) {
				Account acc=new Account(25.0,111);
				AccountHolder joe=new AccountHolder(acc);
				AccountHolder john=new AccountHolder(acc);			
				Thread t1=new Thread(joe);
				Thread t2=new Thread(john);
				t1.start();
				t2.start();
			}
}

class Account{
	private double balance;
	private int accountNo;
	
	Account(double balance, int accountno){
		this.balance=balance;
		this.accountNo=accountno;
	}
	
	public synchronized  void checkBalance() {
		System.out.println("Account No: "+this.accountNo+" Balance: "+this.balance);
	}
	
	public synchronized void deposit(double amount) {
		this.balance+=amount;
	}
	
	public synchronized void withdraw(double amount) {
		if(amount<=this.balance)
		this.balance-=amount;
	}
}
class AccountHolder implements Runnable{
	Account account;
	public AccountHolder(Account account){
		this.account=account;
	}	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.account.deposit(100.0);
		this.account.withdraw(25.0);
		this.account.deposit(75.0);
		this.account.withdraw(100.0);
		this.account.checkBalance();
	}
}