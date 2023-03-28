package com.singleton.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.singleton.Printer;

public class DeserializationTest {
	
	public static Object serialisation(Object obj) {
		try {
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("E:/singleton.src")); //by the object output stream 
		os.writeObject(obj); //we write the data to file
		os.flush();
		os.close();
		System.out.println("Serialization happend");
		}
		catch(FileNotFoundException fnf) {
			fnf.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return obj;
	}//method for serialisation
	
	public static Object deserialisation() {
		Object obj=null;
		try {
			// the Object Inputstream we can read the data from file
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/singleton.src"));
			obj=ois.readObject();	
		ois.close();
		System.out.println("Deserialization happend");
		}
		
		catch(FileNotFoundException fnf) {
			fnf.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return obj;
	}
	
	
	
	
	public static void main(String[] args) {
		Printer p1=null;
		Printer p2 = null;
		
		//create object
		p1 = Printer.INSTANCE;
		//call the serialization method
		DeserializationTest.serialisation(p1);
		System.out.println(p1.hashCode());
		
	p2=(Printer)DeserializationTest.deserialisation();
	
	System.out.println(p2.hashCode()+"........"+p1.hashCode());
	System.out.println("(p1==p2)?="+(p1==p2));
		
		

	}

}
