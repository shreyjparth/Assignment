package com.first;
import java.util.*;

class Bank{
	int balance;
	Bank(){
		
	}
	Bank(int x){
		balance =x;
	}
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
	void getBalance(){
		System.out.println("The Current balance is:"+balance);
	}
}

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Startin amount");
		int bal=sc.nextInt();
		Bank b=new Bank(bal);
		int ch;
		do{
		System.out.println("Enter choice:");
		System.out.println("1.Withdraw");
		System.out.println("2.Depsit");
		System.out.println("3.Get Current Balance");
		System.out.println("4.Exit");
		ch=sc.nextInt();
		if(ch==1){
			System.out.println("Enter amount");
			int w=sc.nextInt();
			b.withdraw(w);
		}
		else if(ch==2){
			System.out.println("Enter amount");
			int d=sc.nextInt();
			b.deposit(d);
		}
		else if(ch==3){
			b.getBalance();
		}
		}while(ch!=4);
		sc.close();	
	}

}
