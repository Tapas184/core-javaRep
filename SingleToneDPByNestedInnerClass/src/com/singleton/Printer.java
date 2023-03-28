package com.singleton;


public class Printer{
	
	private static boolean flag=false;
	//take private constructor
	//solution for Reflection api problems
	private Printer()  {
		if(flag==true)
			throw new IllegalArgumentException("Object already created");
		flag=true;
		System.out.println("0-Param constructor");
	}
	
	//public static factory method 
	//Solution for Multi threading
	public static Printer getInstance() {
		return PrinterHolder.INSSTANCE;
	}
	
	//take one private static inner class
	private static class PrinterHolder {
		private static Printer INSSTANCE=new Printer();
	}
	
	//solution for cloning problems
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Object is already created");
	}
	//solution for Deserialization
	public Object readResolve() {
		return PrinterHolder.INSSTANCE;
		//throw new IllegalArgumentException("Object already created");
	}
}// end of the class Printer
