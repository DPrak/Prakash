package aasessmentMarkEvaluation;


import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	ArrayList<Account>accountList;
	ArrayList<Transaction>transactionList;
	Scanner scanner;
	
	Bank(){
		accountList = new ArrayList<Account>();
		transactionList = new ArrayList<Transaction>();
		scanner = new Scanner(System.in);
	}
	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}
	public void setTransactionList(ArrayList<Transaction> transactionList) {
		this.transactionList = transactionList;
	}
	void addAccounts(Account aObject, Transaction tObject) {
		
		aObject.takeAccountDetailsFromUser(tObject);
		setAccountList(tObject.getAccountList());
		System.out.println("Accounts added successfully");
	}
	void doTransaction(Transaction tObject, Bank bObject)
	{
		tObject.transact(bObject);
		System.out.println("Transaction completed successfully");
	}
	void populateAccounts(Transaction tObject){
		transactionList.add(tObject);
	}
	void printAccounts() {
		for(Account acc:accountList) {
			System.out.println(acc);
		}
	}
	void printTransactions() {
		for(Transaction trans:transactionList) {
			System.out.println(trans);
		}
	}

	public static void main(String[] args) {
		
		Bank bObject = new Bank();
		Account aObj = new Account();
		Transaction tObj = new Transaction();
		bObject.addAccounts(aObj, tObj);
		bObject.doTransaction(tObj, bObject);
		bObject.printAccounts();
		bObject.printTransactions(); 
	}

}