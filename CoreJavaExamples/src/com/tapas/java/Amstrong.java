package com.tapas.java;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = sc.nextInt();
		int original=a;
		int count = Integer.toString(a).length();
		sc.close();
		int remain, sum = 0;
		while (a > 0) {
			remain = a % 10;
			a = a / 10;
			sum = sum + (int) Math.pow(remain, count);
		}
		if (original == sum) {
			System.out.println("Is a amstrong");
		} else {
			System.out.println("not a amstrong");
		}

	}

}
