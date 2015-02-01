package com.first;
import java.util.*;

class Employee1{
	void greet(String s){
		System.out.println("Welcome"+" "+s);
	}
}
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e=new Employee1();
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter Name");
		s=sc.next();
		e.greet(s);
		sc.close();

	}

}
