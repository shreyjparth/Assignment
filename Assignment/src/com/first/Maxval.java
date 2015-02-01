package com.first;
import java.util.*;
public class Maxval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1,m2,m3;
		Scanner sc=new Scanner(System.in);
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		int max;
		
		max=(m1>m2)?m1:m2;
		max=(max>m3)?max:m3;
		System.out.println("MAX NUMBER IS:"+max);
		sc.close();

	}

}
