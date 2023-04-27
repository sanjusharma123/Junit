package com.maven.junitproject;

import java.util.Scanner;

public class EvenCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter An Integer");
		Scanner sc = new Scanner(System.in);
		int userNumber = sc.nextInt();
boolean b=isEven(userNumber);
System.out.println(b);
	}

	public static boolean isEven(int userNumber) {
		boolean flag = false;
		if (userNumber % 2 == 0) {
			flag = true;

		}
		return flag;
	}

}
