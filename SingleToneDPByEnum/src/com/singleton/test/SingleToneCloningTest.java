package com.singleton.test;

import com.singleton.Printer;

public class SingleToneCloningTest {

	public static void main(String[] args) {
		
		Printer p1 =null, p2=null;
		//creates the object
		p1=Printer.INSTANCE;
		//I want to clone the object
		try {
		//p2=(Printer)p1.clone();
		System.out.println("p1 :"+p1.hashCode()+" .... p2:"+p2.hashCode());
		System.out.println("(p1==p2)?="+(p1==p2));
		}
		/*catch(CloneNotSupportedException cnse) {
			//cnse.getMessage();
			cnse.printStackTrace();
		}*/
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
