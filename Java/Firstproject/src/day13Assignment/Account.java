package day13Assignment;

import java.util.ArrayList;

public class Account{

	ArrayList<String> myStringArray;
	ArrayList<Double> myDoubleArray;
	
	Account(){
		myStringArray = new ArrayList<String>();
		myDoubleArray = new ArrayList<Double>();
		
	}
	
	void addMembers() {
		
		myStringArray.add((String)"Customer Name: Prakash");
		myStringArray.add((String)"Account Number : 50100164684872");
		myStringArray.add((String)"Phone Number : 9789892159");
		myDoubleArray.add((double)200.20);
		//myArray.add("Hello");//not possible to add
		//myArray.add(1288.22);
		//myArray.add(new Movie(101,"GGG",12.2f));//not possible to add
		//myArray.add(true);//not possible to add
		//myArray.add('w');//not possible to add
	}
	
	void printCollection() {
		/*for (int i = 0; i < myArray.size(); i++) {
			System.out.println(myArray.get(i));
		}*/
	
	for (String mynum1 : myStringArray) {
	System.out.println(mynum1);
	}
	for (Double mynum : myDoubleArray) {
		System.out.println("Balance:" +mynum);
		//System.out.println(mynum);
	}
	}
	
	//void sumCollection() {
		//double sum =0;
		/*for (int i = 0; i < myArray.size(); i++) {
			sum = sum + Double.parseDouble(myArray.get(i).toString());
			System.out.println("The sum till now is "+sum);
		}*/
		//for (Double myNum : myArray)  {
			//sum = sum + Double.parseDouble(myNum.toString());
			//System.out.println("The sum till now is "+sum);
	//	}
		//System.out.println("The final sum is "+sum);
//	}
	public static void main(String[] args) {
		Account ac = new Account();
		ac.addMembers();
		ac.printCollection();
		//ge.sumCollection();

	}

}