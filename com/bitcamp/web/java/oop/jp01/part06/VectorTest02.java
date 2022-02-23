package com.bitcamp.web.java.oop.jp01.part06;

import java.util.Vector;

public class VectorTest02 extends Vector {
	
	public VectorTest02() {
		super();
	}
	public VectorTest02(int initialCapacity, int capacityIncrement) {
		super(initialCapacity, capacityIncrement);
	}
	
	public void printString(Vector vector) {
//		for(int i = 0; i < vector.size(); i++) {
//			System.out.print((String)vector.elementAt(i));
//		}
		
		for(Object object : vector) {
			System.out.println((String)object);
		}
	}

	public static void main(String[] args) {
		VectorTest02 vectorTest = new VectorTest02(10, 10);
		
		String s1 = new String("1.»´");
		vectorTest.add(s1);
		vectorTest.add(new String("2.µø"));
		vectorTest.add("3.¥‘ æ»≥Á«œººø‰");
		
		vectorTest.printString(vectorTest);
		
		System.out.println("\n ==> API »Æ¿Œ");
		vectorTest.insertElementAt("4.±Ê",1);
		vectorTest.printString(vectorTest);
		
		System.out.println("\n ==> API »Æ¿Œ");
		vectorTest.setElementAt("5.,»´±Êº¯",3);
		vectorTest.printString(vectorTest);
		
		System.out.println("\n ==> API »Æ¿Œ");
		vectorTest.removeElementAt(3);
		vectorTest.printString(vectorTest);
	}//end of main

}//end of class
