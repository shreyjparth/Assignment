package com.first;
import java.util.*;

class Student{
	String name,city;
	int id;
	Student(){
		name="Default";
		id=0;
		city="Not Provided";
	}
	Student(String n,int i,String c){
		name=n;
		id=i;
		city=c;
	}
	void getDetails(){
		System.out.println("The details are:"+" "+name+" "+id+" "+city);
	}
	String getGrade(int a[]){
		int avg=0;
		for(int i=0;i<a.length;i++){
			avg=avg+a[i];
		}
		avg=avg/a.length;
		if(avg>=90){
			return "A";
		}
			else if(avg<90 && avg>=60){
				return "B";
				}
			else{
				return "C";
			}
		}
	}

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String grade;
		
		Student s1=new Student("Ankit",1,"Patna");
		Student s2=new Student("Shrey",2,"Patna");
		System.out.println("Student 1:");
		s1.getDetails();
		int a[]=new int[3];
		System.out.println("Enter Student one marks");
		for(int i=0;i<3;i++){
			a[i]=sc.nextInt();
		}
		grade=s1.getGrade(a);
		System.out.println("Grade is:"+grade);
		System.out.println("Student 2:");
		s2.getDetails();
		int b[]=new int[3];
		System.out.println("Enter Student two marks");
		for(int i=0;i<3;i++){
			a[i]=sc.nextInt();
		}
		grade=s1.getGrade(b);
		System.out.println("Grade is:"+grade);
		
		}

}
