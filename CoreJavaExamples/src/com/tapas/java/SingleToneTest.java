package com.tapas.java;

public class SingleToneTest {

	public static void main(String[] args) {

		SingleTone test1 = SingleTone.getInstance();
		SingleTone test2 = SingleTone.getInstance();
		
		if(test1==test2) {
			System.out.println("Both are same object");
		}
		else
			System.out.println("Both are different object");
	}

}
