package com.tapas.java.interviewquestions;

import java.util.Random;
import java.util.Scanner;

/*
 * Print the random 5 number with in 10 to 99 using java 8
 * Input- n
 * out put-n
 * 25
 * 26
 * 89
 * 45
 * 53
 */
public class InterviewQuestions2 {

	public static void main(String[] args) {

		System.out.println("Enter the number ");
		try (Scanner sc = new Scanner(System.in)) {
			int number = sc.nextInt();
			//Create a random Object
			Random random = new Random();
			random.ints(10, 99).limit(number).forEach(System.out::println);
		}//try
		catch (Exception e) {
			e.getMessage();
		}//catch
	}//main

}//InterviewQuestions2
