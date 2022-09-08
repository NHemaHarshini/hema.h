package com.bct.java8features.functional.interfaces;

/* 
 * Changes of interface on default and abstract method.
 */
interface DefaultAndAbstract {
	
	//default method -- do consist of method body.
	default void print() {
	    System.out.println("Another example of default method in the interface");
	    System.out.println("Interface is mainly develop to obtain 100% abstaract");
	    
}
	
	//abstract method - do not consist of method body.
	public void myMethod(String message);
}

public class ChangesoffunctionalInterface implements DefaultAndAbstract {
	
		
		//implementing abstract method
		@Override
		public void myMethod(String message) {
			System.out.println("Message is : " + message);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangesoffunctionalInterface instance = new ChangesoffunctionalInterface ();
         instance.print();
	}

}
