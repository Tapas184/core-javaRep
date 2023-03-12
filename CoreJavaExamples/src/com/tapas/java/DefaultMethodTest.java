package com.tapas.java;

interface I1{
	default void m1() {
		System.out.println("I1 method m1");
	}
}
interface I2{
	default void m1() {
		System.out.println("I2 default method m1");
	}
}
public class DefaultMethodTest implements I1,I2 {

	public static void main(String[] args) {
		DefaultMethodTest test = new DefaultMethodTest();
		test.m1();
		

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		I2.super.m1();
	}
	


}
