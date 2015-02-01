package com.first;
import java.util.*;
import java.lang.Integer;
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1,m2,m3;
		Scanner sc=new Scanner(System.in);
		m1=Integer.parseInt(sc.next());
		m2=sc.nextInt();
		m3=sc.nextInt();
		
		if(m1>m2 && m1>3){
			System.out.println("MAX IS:"+m1);
		}
		else if(m2>m3 && m2>m1){
			System.out.println("MAX IS:"+m2);
		}
		else{
			System.out.println("MAX IS:"+m3);
		}
	}

}
