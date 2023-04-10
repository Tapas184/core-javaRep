package com.singleton;

public enum Printer {
	
	//take a constance
	INSTANCE;
	
	//business method
	public void printData(String msg) {
		System.out.println("Hello");
	}

}
/**@Advantages of taking single tone as enum
 * Easy to develop
 * It perform eager instantiation of it's constants so no multi-threading issue
 * cloning is not possible on enum based object, because cone() is already overridden in
 * extended Enum class
 * Enum is implementing serialization internally,
 * per jvm for Enum one object will be created internally.
 * no worry about de-serialization
 * no constructor is there so no worry about reflection api
 * if we try to create object throw reflection api we will get IllegalArgumentException
 */
/*@Disadvantages
 * Eager Instantiation though we are not required object then also object created
 * We can not make other classes extending from singleton enum because
 * all enum are final class internally
 * In enum class every constant is a object of that class
 * 
 */
