// Example of a brief java program
import java.util.Scanner;

public class CreditCard {

	// Instance variables:
	private String customer;	// name of the customer
	private String bank;		// name of the bank
	private String account;		// account ID
	private int limit;		// credit limit
	protected double balance;	// current balance

	// Constructors:
	public CreditCard(String cust, String bk, String acnt, int lim, double initBal) {

		customer = cust;
		bank = bk;
		account = acnt;
		limit = lim;
		balance = initBal;
	}

	public CreditCard(String cust, String bk, String acnt, int lim) {
		this(cust, bk, acnt, lim, 0.0);		//use balance zero as default
	}

	// Accessor methods:
	public String getCustomer() { return customer; }
	public String getBank() {return bank; }
	public String getAccount() {return account; }
	public int getLimit() { return limit; }
	public double getBalance() { return balance; }

	// Update methods:
	public boolean charge(double price) {		// make a charge
		if(price + balance  > limit)		// if charge would surpass limit
			return false;			// refuse the charge
		// at this point, the charge is succeful
		balance += price;			// update the balance	
		return true;				// announce the good news
	}

	public void makePayment(double amount) {	// make a payment
		balance -= amount;
	}

	// Utility method to print a  card's information
	public static void printSummary(CreditCard card) {
		System.out.println("Customer = " + card.customer);
		System.out.println("Bank = " + card.bank);
		System.out.println("Account = " + card.account);
		System.out.println("Balance = " + card.balance);
		System.out.println("Limit = " + card.limit);
	}

	// main method
	public static void main(String args[]) {

		CreditCard[] wallet = new CreditCard[3];
		wallet[0] = new CreditCard("opas350", "Bank1"," 4444 4444 4444", 5000);
		wallet[1] = new CreditCard("opas350Z1", "Bank2", "3333 3333 3333", 3500);
		wallet[2] = new CreditCard("opas350Z2", "Bank3", "1111 1111 1111", 300);

		for(int val = 1; val <= 16; val++) {
			wallet[0].charge(3*val);
			wallet[1].charge(2*val);
			wallet[2].charge(val);
		}

		for(CreditCard card : wallet) {
			CreditCard.printSummary(card);
			while(card.getBalance() > 200.0) {
				card.makePayment(200);
				System.out.println("New Balance = " +card.getBalance());
			}
		}
	}
}


