package com.tapas.java;

public class StringTest {

    public static void main(String[] args) {

	String s1= "tapas";
	String s2 = "tapas";
	StringBuffer sb1 = new StringBuffer("tapas");
	StringBuffer sb2 = new StringBuffer("tapas");
	StringBuilder sbuilder1 = new StringBuilder("tapas");
	StringBuilder sbuilder2 =new StringBuilder("tapas");
	System.out.println("Test :1--");
	System.out.println("s1.equals(s2)"+s1.equals(s2));
	System.out.println("s1==s2"+s1==s2);
	System.out.println("s1.equals(sb1)"+s1.equals(sb1));
	System.out.println("Test :2----");
	System.out.println("sb1.equals(sb2)"+sb1.equals(sb2));
	System.out.println("sb1==sb2");
	System.out.println(sb1==sb2);
	System.out.println(sbuilder1==sbuilder2);
	System.out.println(sbuilder1.equals(sbuilder2));
    }

}
