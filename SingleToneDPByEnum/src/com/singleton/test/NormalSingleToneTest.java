package com.singleton.test;

import com.singleton.Printer;

public class NormalSingleToneTest {

	public static void main(String[] args) {
		Printer p1 = Printer.INSTANCE;
		Printer p2 = Printer.INSTANCE;
		System.out.println("P1 HashCode is :"+p1.hashCode()+"......"+"P2 HashCode is :"+p2.hashCode());
		System.out.println("(p1==p2)"+(p1==p2));

	}

}
