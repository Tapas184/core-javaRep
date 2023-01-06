package com.tapas.java;
//sum of all degits in given numbers
public class SumOfGivenInputs {

	public static void main(String[] args) {
	
		int n1 = 678495; //input value
		int sum = 0 ; // initial the value
		//iterator till input value not equals to 0
		while(n1>0) {
		int reminder  = n1%10;
		sum = sum+reminder;
		n1 = n1/10;
		}//while
		System.out.println(sum);

	}

}
