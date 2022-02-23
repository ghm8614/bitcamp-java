package com.bitcamp.web.java.oop.jp01.part03;

public class StringTest03 {

	public static void main(String[] args) {
		String name = "012ABCdef";
		String hi = "Hi !";
		
		String s1 = hi.concat(name);
		System.out.println(s1);	// Hi !012ABCdef
		
		String s2 = s1.substring(7);
		System.out.println(s2);	// ABCdef
		
		int a = name.indexOf("ABC");
		System.out.println(a);	// 3
		System.out.println(name.substring(a));	// ABCdef
		
		int b = name.indexOf("ABC");
		System.out.println(b);	// 3
		System.out.println(name.substring(b));	// ABCdef
		System.out.println(name.substring(b, 5));	// AB  ?
		
		int c = name.indexOf("z");
		System.out.println(c);	// -1   ?
		
	}

}
