package com.first;
import java.util.*;

class Emp{
	double total;
	double calBonus(int allow){
		total=allow;
		return total;
	}
	double calBonus(int allow,int carallow){
		total=allow+carallow;
		return total;
	}
	double calBonus(int allow,int carallow,int houseallow){
		total=allow+carallow+houseallow;
		return total;
	}
}

public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double sal;
		int choice;
		System.out.println("Hello");
		System.out.println("Enter Choice");
		System.out.println("1. PROGRAMMER");
		System.out.println("2. MANAGER");
		System.out.println("3. DIRECTOR");
		choice=sc.nextInt();
		if(choice==1){
			Emp e=new Emp();
			sal=e.calBonus(1000);
			System.out.println("Total Allowance is :"+sal);
		}
		else if(choice==2){
			Emp e=new Emp();
			sal=e.calBonus(1000,500);
			System.out.println("Total Allowance is :"+sal);
		}
		else if(choice==3){
			Emp e=new Emp();
			sal=e.calBonus(1000, 500, 500);
			System.out.println("Total Allowance is :"+sal);
		}
		else{
			System.out.println("Faulty Input");
		}

	}

}
