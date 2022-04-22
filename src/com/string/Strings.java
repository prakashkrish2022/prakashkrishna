package com.string;

public class Strings {
	public static void main(String[] args) {
		String s="Java";
		String s1="java";
		String s2 = "selenium class";
		String s3 ="       Python class   ";
		String a="apple";
		String a1="Apple";

		//	Find the length
		int length = s.length();
		System.out.println(length);

		//To change uppercase
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);

		//	To change lowercase
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);

		//	To compare the two strings with case sencitive
		boolean equals = s.equals(s1);
		System.out.println(equals);

		//	To compare the two strings without case sencitive
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);

		//	To get a index position of particular letter(First occured)
		int indexOf = s.indexOf("a");
		System.out.println(indexOf);

		//			To get a index position of particular letter(First occured)
		int lastIndexOf = s.lastIndexOf("a");
		System.out.println(lastIndexOf);

		//	To get a particular character from string by using index 
		char charAt = s.charAt(2);
		System.out.println(charAt);

		//	To check whether the given value is present or not
		boolean contains = s2.contains("Selenium");
		System.out.println(contains);

		//	To replace the character
		String replace = s2.replace("selenium", "java");
		System.out.println(replace);

		//	To check whether our string is starts with particular value or not
		boolean startsWith = s2.startsWith("selenium");
		System.out.println(startsWith);

		//	To check whether our string is ends with particular value or not
		boolean endsWith = s2.endsWith("class");
		System.out.println(endsWith);

		//	To check given string is empty or not
		boolean empty = s3.isEmpty();
		System.out.println(empty);

		//	To remove the unwanted space from the string
		System.out.println(s3);
		String trim = s3.trim();
		System.out.println(trim);

		//	To join the two strings
		String concat = s.concat(s2);
		System.out.println(concat);

		//	To given string is starts with which position
		String subString = s2.substring(3);
		System.out.println(subString);

		//	To given string is starts with which position
		String substring2 = s2.substring(2, 11);
		System.out.println(substring2);

	//	Compare two string
		int compareTo = a.compareTo(a1);
		System.out.println(compareTo);



 

	}


}
