package com.first;
import java.util.*;
public class Arraymax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("Enter the size of array");
		x=sc.nextInt();
		int a[]=new int[x];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		sc.close();
		int max=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println("MAX NUMBER IS :"+max);
		
	}

}
