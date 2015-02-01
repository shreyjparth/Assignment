package com.first;

import java.util.Scanner;

abstract class Account{
	int balance=10000;
	Account(){
		
	}
	public Account(int balance) {
		super();
		this.balance = balance;
	}
	abstract void withdraw(int x);
	abstract void deposit(int x);
	double getBalance(){
		System.out.println("The current balance is:"+balance);
		return balance;
	}
}

class Saving extends Account{
	void withdraw(int x){
		System.out.println("Withdrawing amount:"+x);
		balance=balance-x;
		System.out.println("Amount Remaining:"+balance);	
	}
	void deposit(int x){
		System.out.println("Deposting Amount"+x);
		balance=balance+x;
		System.out.println("New Balance:"+balance);
	}
	double getBalance(){
		System.out.println("The Current balance is:"+balance);
		return balance;
	}
}

class Current extends Account{
	void withdraw(int x){
		System.out.println("Withdrawing amount:"+x);
		balance=balance-x;
		System.out.println("Amount Remaining:"+balance);	
	}
	void deposit(int x){
		System.out.println("Deposting Amount"+x);
		balance=balance+x;
		System.out.println("New Balance:"+balance);
	}
	double getBalance(){
		System.out.println("The Current balance is:"+balance);
		return balance;
	}	
}

public class Absclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Account ref=new Saving();
		Account ref2=new Current();
		System.out.println("Enter Choice");
		int ch;
		ch=sc.nextInt();
		if(ch==1){
			int op=sc.nextInt();
			if(op==1){
				ref.deposit(100);
			}
			else if(op==2){
				ref.withdraw(100);
			}
		}
		else if(ch==2){
			int op=sc.nextInt();
			if(op==1){
				ref2.deposit(100);
				
			}
			else if(op==2){
				ref2.withdraw(100);
			}
		}
		

	}

}
