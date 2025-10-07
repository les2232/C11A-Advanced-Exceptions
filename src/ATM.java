
public class ATM {
    private BankAccount account; //instance variable

    public ATM() {
    account = new BankAccount(500); //initial balance of 500
}

    public void handleTransactions() {
        try {
            account.withdraw(600);
        } catch (NegativeBalanceException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        } 

        try {
            account.quickWithdraw(600);
        } catch (NegativeBalanceException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }

	public static void main(String[] args) {
        new ATM().handleTransactions(); // runs the ATM
	}
}
