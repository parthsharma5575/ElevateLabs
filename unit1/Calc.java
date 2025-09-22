package com.learning.unit1;

import java.util.Scanner;

public class Calc {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter first digit : ");
			int a=sc.nextInt();
			System.out.println("Enter second digit : ");
			int b=sc.nextInt();
			System.out.println("Enter 1 for multiply");
			System.out.println("Enter 2 for divide");
			System.out.println("Enter 3 for addition");
			System.out.println("Enter 4 for subtraction");
			System.out.println("Enter 5 for exit");
			int choice=sc.nextInt();
			if(choice==5) {
				System.out.println("Exit...");
				break;
			}
			switch(choice) {
			case 1:
				multiply(a,b);
				break;
			case 2:
				divide(a,b);
				break;
			case 3:
				add(a,b);
				break;
			case 4:
				sub(a,b);
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
		
	}
	public static void divide(int a,int b) {
		if(b==0)System.out.println("Divide by 0 not possible");
		else {
			System.out.println(a+" divided by "+b +" = "+(a/b));
		}
	}
	public static void multiply(int a,int b) {
		System.out.println(a+" multiply by "+b +" = "+ (a*b));

	}
	public static void add(int a,int b) {
		System.out.println(a+" summation "+b +" = "+ (a+b));

	}
	public static void sub(int a,int b) {
		System.out.println(a+" subtraction "+b +" = "+ (a-b));

	}
}
