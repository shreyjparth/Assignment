package com.first;
import java.util.*;
public class Arraystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Names");
		int x=Integer.parseInt(sc.next());
		System.out.println("Enter the Names now");
		String a[]=new String[x];
		
		for(int i=0;i<a.length;i++){
			a[i]=sc.next();
		}
		System.out.println("Enter Name to find:");
		String s=sc.next();
		int flag=0;
		for(int i=0;i<a.length;i++){
			if(a[i].equals(s))
			{
				System.out.println("Found"+a[i]);
				flag=1;
			}
		}
		if(flag==0){
				System.out.println("NOT FOUND");
			
		}
		sc.close();
	}

}
