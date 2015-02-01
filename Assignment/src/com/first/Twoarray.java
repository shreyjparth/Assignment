package com.first;
import java.util.*;

public class Twoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Dimension X and Y");
		x=sc.nextInt();
		y=sc.nextInt();
		
		int a[][]=new int[x][y];
		
		System.out.println("Input the Array Values");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
				}
		}
		System.out.println("The values enter were:");
		for(int v[]:a){
			for(int d:v){
				System.out.println(d);
			}
		}
	}
}
