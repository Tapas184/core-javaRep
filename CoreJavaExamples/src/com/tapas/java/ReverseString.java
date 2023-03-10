package com.tapas.java;

public class ReverseString {

	public static void main(String[] args) {
		String input = "Tapas Kumar Rout";
		String[] s = input.split(" ");
		System.out.println(s);
		String rev="";
		for(int i=0; i<s.length;i++) {
			char[] ch = s[i].toCharArray();
			  for(int j=ch.length-1; j>=0;j--) {
				  rev+=ch[j];
			  }
			  rev=rev+" ";
		}
		System.out.println(rev);
	}


}
