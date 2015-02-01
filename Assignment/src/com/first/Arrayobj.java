package com.first;
import java.util.*;

class Course{
	String name;
	int dur;
	int fee;
	Course(){
		name="Not Given";
		dur=0;
		fee=0;
	}
	
	Course(String s,int a,int b){
		name=s;
		dur=a;
		fee=b;
	}
}

public class Arrayobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Course c[]=new Course[4];
		
		for(int i=0;i<c.length;i++){
			System.out.println("Enter Course"+" "+i+" "+"details");
			c[i]=new Course();
			c[i].name=sc.next();
			c[i].dur=sc.nextInt();
			c[i].fee=sc.nextInt();
		}
		System.out.println("The courses are:");
		for(Course x:c){
			System.out.println("Name:"+x.name+" "+"Duration:"+x.dur+" "+"Fee"+x.fee);
		}
		

	}

}
