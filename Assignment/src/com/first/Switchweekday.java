package com.first;
import java.util.*;
public class Switchweekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day today:");
		ch=sc.next();
		switch(ch){
		case "Monday" :
			System.out.println("Weekday");
			break;
		case "Tuesday" :
			System.out.println("Weekday");
			break;
		case "Wednesday" :
			System.out.println("Weekday");
			break;
		case "Thursday" :
			System.out.println("Weekday");
			break;
		case "Friday" :
			System.out.println("Weekday");
			break;
		case "Saturday" :
			System.out.println("Holiday");
			break;
		case "Sunday" :
			System.out.println("Holiday");
			break;
		default:
			System.out.println("WRONG INPUT");
			break;
		}

	}

}
