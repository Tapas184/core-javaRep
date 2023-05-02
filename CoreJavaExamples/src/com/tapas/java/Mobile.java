package com.tapas.java;

public class Mobile {

	private static Mobile Instance;

	private static boolean flag;
	
	private Mobile() {
		if(flag)
			throw new IllegalArgumentException("Object Already Created");
		flag=true;
		}
	public static Mobile getInstacne() {
		if(Instance==null)
			synchronized (Mobile.class) {
				if(Instance==null)
					Instance=new Mobile();
			}
		return Instance;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException("Object Cloned not supported");
	}
	
	public Object readResolver() {
		throw new IllegalArgumentException("Object Already Created");
	}
	
}//end of the class Mobile
