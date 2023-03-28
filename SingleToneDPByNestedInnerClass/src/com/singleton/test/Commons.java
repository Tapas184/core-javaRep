package com.singleton.test;

import java.io.Serializable;

public class Commons implements Cloneable,Serializable {
	@Override
	//for visible this method outside of the class
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
