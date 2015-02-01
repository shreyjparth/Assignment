package com.first;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		int n=Integer.parseInt(sc.next()); */
		
		//PATTERN 1
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		// PATTERN 2
		int k=1; 
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=i;j++)
		{
		System.out.print(k+" ");
		k=k+1;
		}
		System.out.println();

	}
		System.out.println();
		// PATTERN 3
		
		for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

}
}