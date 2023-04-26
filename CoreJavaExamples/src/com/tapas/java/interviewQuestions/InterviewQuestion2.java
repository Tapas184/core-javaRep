package com.tapas.java.interviewQuestions;

import java.util.Arrays;

public class InterviewQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//find the median
		int[] A = {1,2,3,4,5,6};
		int left=6;
		int right=5;
		int median=0;
		Arrays.sort(A);
		System.out.println(A);
		if(A.length>1) {
			median=(left+right)/2;
			System.out.println(median);
		}
		else
			median=A[0];
		
	}

}
