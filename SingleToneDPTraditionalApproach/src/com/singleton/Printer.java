package com.singleton;

import com.singleton.test.Commons;

public class Printer extends Commons{

	private static Printer INSTANCE;
	private boolean flag;
	
	private Printer() {
		if(flag) {
		throw new IllegalArgumentException("Object already created");
		}
		flag=true;
	}
	
	public static Printer getInstance() {
		if(INSTANCE == null) 
			synchronized (Printer.class) {
				if(INSTANCE==null)
					INSTANCE=new Printer();
			}//synchronized
		return INSTANCE;
	}//method
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("cloneNotSupported");
	}
	
	public Object readResolve() {
		//throw new IllegalArgumentException("Object already created");
		return INSTANCE;
	}
}// end of the class Printer
