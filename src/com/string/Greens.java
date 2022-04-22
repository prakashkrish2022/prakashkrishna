package com.string;

public class Greens {
	public static void main(String[] args) {
		
	   String p1= "GreensTechnology";
	   String p2=" SeleniumAutomationtool";
	   String p3= "velmurugan";
	   String p4= "j a v a p r o g r a m";

	   int length = p1.length();
	   System.out.println(length);
	   
	   String lowerCase = p1.toLowerCase();
	   System.out.println(lowerCase);
	   
	   String upperCase = p2.toUpperCase();
	   System.out.println(upperCase);
	   
	   String trim = p1.trim();
	   System.out.println(trim);
	   
	   boolean equals = p1.equals(p2);
	   System.out.println(equals);
	   
	   boolean equalsIgnoreCase = p1.equalsIgnoreCase(p1);
	   System.out.println(equalsIgnoreCase);
	   
	   int indexOf = p1.indexOf("e");
	   System.out.println(indexOf);
	   
	   int lastIndexOf = p1.lastIndexOf("e");
	   System.out.println(lastIndexOf);
	   
	   char charAt = p1.charAt(7);
	   System.out.println(charAt);
	   
	  boolean contains = p1.contains("greens");
	   System.out.println(contains);
	   
	  String replace = p1.replace("greens", "selenium");
	   System.out.println(replace);
	   
	   
	   
	}
	   

}
