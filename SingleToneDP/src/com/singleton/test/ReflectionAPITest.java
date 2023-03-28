package com.singleton.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.singleton.Printer;

//Through Reflection api we can break the single tone 
public class ReflectionAPITest {

	public static void main(String[] args) throws ClassNotFoundException {
	  
		Printer p1=null;
		Printer p2=null;
		//create a printer object
		p1=Printer.getInstance();
		System.out.println(p1.hashCode());
		//load the class
		Class c = Class.forName("com.singleton.Printer");
		//get all cons which is declared in printer class through Reflection API
		Constructor [] cons = c.getDeclaredConstructors();
		//get access of private constructor 
		cons[0].setAccessible(true);
		//create 2nd object
		try {
			p2=(Printer) cons[0].newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p1.hashCode()+"......."+p2.hashCode());
		System.out.println("(p1==p2)?="+(p1==p2));

	}

}
