package com.singleton;

public class Printer{
	 /**for holding the created object 
	  * private for we can use this within the class
	 static we are using this inside the static method instance variable we can't
	 use so need to take static variable
	  */
	private static Printer INSTANCE;

	
	/**private static Printer INSTANCE = new
	 * Printer();(Soln-MultiThreading-EagerInstanciation)
	 * for Reflection API solution for temporary
	 */
	private static boolean flag;
	
	
	/**for Out side can't create Object so we take private Constructor
	 * 
	 */ 
	private Printer() {
		if(flag)
			throw new IllegalArgumentException("object already created");
		flag=true;
		System.out.println("0-Param constructor");

	}

	/**for visible Out side of the class we should take public modifire and Static
	 * for without create  object we can call this method by class name
	 * return type should be class type
	 */

	/*public static Printer getInstance() {
		
		//for object creation check whether object is created or not
		//if Printer object is null
			if(INSTANCE==null) {
					INSTANCE=new Printer();
			}
		//then create object
		//if already created return the same object
		return INSTANCE;
	}*/
	// ==========by synchronized method we can achieve the singleton behavior================
	/*public synchronized static Printer getInstance() {
			
			//for object creation check whether object is created or not
			//if Printer object is null
				if(INSTANCE==null) {
						INSTANCE=new Printer();
				}
			//then create object
			//if already created return the same object
			return INSTANCE;
		}*/
	public static Printer getInstance() {
		// Double null check for multithread
		if (INSTANCE == null) {
			synchronized (Printer.class) {
				if (INSTANCE == null)
					INSTANCE = new Printer();
			}
		}
		/**then create object
		 * if already created return the same object
		 */
		return INSTANCE;
	}
	/**Resolution for cloning Object creation
	 * over riding cone() here
	 */
		@Override
		public Object clone() throws CloneNotSupportedException {
			throw  new  CloneNotSupportedException("Clone is not Supported Exception");
		}
		
		//===============solution for Deserialization-Way-1=====================
		/*		public Object readResolve() {
					System.out.println("Printer.readResolve()");
					return INSTANCE;
				}*/
		//=====================way no-2 for solution for Deserialization===================
		/**throwing exception
		 * Object is return type for you can  return object also
		 * 
		 */
		public Object readResolve() {
			throw new IllegalArgumentException("do not access to create the new object");
		}
}// end of the class Printer
