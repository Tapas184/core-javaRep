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
 * Easy to devlop
 * It perform eager instantiation of it's constants so no multithreading issue
 * cloning is not possible on enum based object, because cone() is akready overriden in
 * extended enum class
 * Enum is implementing serialization internally,
 * per jvm for enum one object will be created internally.
 * no worry about deserialization
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
