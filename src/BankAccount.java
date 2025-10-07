
public class BankAccount {
	double balance = 0;
	
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}


	public void withdraw(double w) throws NegativeBalanceException{
		if (w > balance) {
			throw new NegativeBalanceException(balance-w);
		} else {
			balance -= w;
		}
	}

	public void quickWithdraw(double w) throws NegativeBalanceException {
		if (w > balance) {
			throw new NegativeBalanceException();
		} else {
			balance -= w;
		}
	}
}
