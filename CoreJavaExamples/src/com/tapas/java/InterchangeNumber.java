package com.tapas.java;

import java.util.Scanner;

public class InterchangeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		System.out.println("Position of the number your want to change :");
		int pos1=sc.nextInt();
		System.out.println("Enter 2nd position of the number you want to change");
		int pos2=sc.nextInt();
		sc.close();
		if(Integer.toString(num).length()<2)
			System.out.println("Error:: Interchange Not be possible number length is lessthan 2");
		else if(pos1>Integer.toString(num).length() || pos2>Integer.toString(num).length())
			System.out.println("Error:: Interchange Not be possible position is greater than number length");
		else {
		int result = interchanged(num,pos1,pos2);
		System.out.println("After Change position of the number::"+result);
		}
	}

	public static int interchanged(int num, int  pos1, int pos2) {
		/*int length=Integer.toString(num).length();
		String[] ch = Integer.toString(num)
				           .split("");
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<length;i++) {
			if(i==pos1-1) {
				String s1=ch[i];
				ch[i]=ch[pos2-1];
				ch[pos2-1]=s1;
				
			}
		}
		for(String sr:ch) {
			sb.append(sr);
		}
		
		return Integer.parseInt(sb.toString());*/
		
		StringBuilder sb = new StringBuilder(num+""); //Num=123 , pos1=2 ,pos2=3
		char ch1 = sb.charAt(pos1-1); //ch1=2
		char ch2 =sb.charAt(pos2-1); //ch2=3
		sb.deleteCharAt(pos1-1); //sb=13
		sb.insert(pos1-1, ch2);//sb=133
		sb.insert(pos2-1, ch1);//sb=1323
		sb.deleteCharAt(pos2);//sb=132
		
		return Integer.parseInt(sb.toString());
	}

}
