package com.first;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[3];
		Scanner sc=new Scanner(System.in);
		int avg=0;
		
		for(int i=0;i<3;i++){
			a[i]=sc.nextInt();
		}
		for(int v:a){
			avg=avg+v;
		}
		int x=avg/a.length;
		System.out.println("Average is :"+x);
		String grade;
		if(x>60){
			grade="Pass";
		}
		else{
			grade="Fail";
		}
		System.out.println("Grade:"+grade);
	}

}
