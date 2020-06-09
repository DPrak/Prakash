package bank;

public class Bank {
	Account[] accounts;//array of our own type

    Bank(){
	 
	   accounts = new Account[5];

	}
   
   void addAccount() {
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account();//creating an object for every ref using the iteration
			accounts[i].getAccountDetailsFromUser();
		}
	}
	
	void printDetails() {
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].printAccountDetails();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank();
	
		bank.addAccount();
		bank.printDetails();

	}

}