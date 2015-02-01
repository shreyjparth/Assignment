package com.first;
import java.util.*;

public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Program for displaying pattern of *");
        System.out.print("Enter the maximum number of *");
        int n = Integer.parseInt(sc.next());
       
        System.out.println("\nHere is the Diamond of Stars\n");

        for (int i = 1; i <= n; i++)
        {
              for (int j = 0; j < (n - i); j++)
                    System.out.print(" ");
              for (int j = 1; j <= i; j++)
                    System.out.print("*");
              for (int k = 1; k < i; k++)
                    System.out.print("*");
              System.out.println();
        }

        for (int i = n - 1; i >= 1; i--)
        {
              for (int j = 0; j < (n - i); j++)
                    System.out.print(" ");
              for (int j = 1; j <= i; j++)
                    System.out.print("*");
              for (int k = 1; k < i; k++)
                    System.out.print("*");
              System.out.println();
        }

        System.out.println();
        sc.close();

	}

}
