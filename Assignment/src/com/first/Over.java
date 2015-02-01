/*
NOTE : INSTEAD OF THE SHAPE EXAMPLE
*/
package com.first;

public class Over {
	 
	public static void main(String args[]) {
		Company a = new Company();
		Company b = new eBay();
		Company c = new Flipkart();
 
		a.address();// Runs the method in Company class
		b.address();// Runs the method in eBay class
		c.address();// Runs the method in Flipkart class
	}
}
 
class Company {
 
	public void address() {
		System.out.println("This is Address of Crunchify Company...");
	}
}
 
class eBay extends Company {
 
	public void address() {
		System.out.println("This is eBay's Address...");
	}
}

class Flipkart extends Company{
	public void address(){
		System.out.println("This is Flipkart's Address...");
	}
}
