package com.tapas.java.interviewquestions;

public class StringExample {

	public static void main(String[] args) {

		String s = "tapas";
		String s1="tapas";
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		String s2= new String("tapas");
		String s3= new String("tapas");
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		StringBuffer sb = new StringBuffer("tapas");
		StringBuffer sb1 = new StringBuffer("tapas");
		System.out.println(sb.equals(sb1));
		System.out.println(sb==sb1);
	}

}
