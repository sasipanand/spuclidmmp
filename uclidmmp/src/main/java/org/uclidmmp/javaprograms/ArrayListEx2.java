package org.uclidmmp.javaprograms;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		//Same Example with storing 5 string values
		//Example for findElements
		//add(),size(),get()
		
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("selenium");
	//	aList.add(10.0);
		System.out.println("Total count of List " + aList.size());
		System.out.println("First value stored in the List" + aList.get(0));
		
		for(int i=0;i<aList.size();i++)
		{
			System.out.println(aList.get(i));
		}

		 
		
	}
	
}

//
//char ch='a';
//String s="selenium";
//int i =10;
