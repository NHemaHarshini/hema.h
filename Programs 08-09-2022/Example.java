package com.bct.java8features.methodreferences;

import java.util.Arrays;

//Method reference to an instance method of an arbitrary object of a particular type.


public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Collection
		String[] stringArray = {
				"Hema","Ram","Sitha","harshini","Ganapathi","shiva","Lakshmi"
				
		};
		/*
		 * Method reference to an instance method of an arbitrary object of a particular type
		 */
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for(String data:stringArray) {
			System.out.println(data);
		}

	}

}
