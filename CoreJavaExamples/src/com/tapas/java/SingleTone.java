package com.tapas.java;

public class SingleTone {
	
	private static SingleTone instacne;// private for avalabe for this class and global access bility
	
	private SingleTone() {
		
	}//To prevent to create a new object by new Key word

	public static SingleTone getInstance() {
		if(instacne==null) {//check thr object is already created or not
			synchronized (SingleTone.class) {//in multi threading enviroment one thread can access this class at a time
				if(instacne==null) {
					instacne=new SingleTone();
				}
			}
		}
		return instacne;
	}
}
