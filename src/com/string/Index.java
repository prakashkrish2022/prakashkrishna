package com.string;

public class Index {

	public static void main(String[] args) { 

		 String m1= "GreensTechnology" ;
        
String m2= "SeleniumAutomationtool ";
       //  Find the index of o

String m3= "elmurugan ";
        
String m4= "j a v a p r o g r a m"; 
       
String m5= "9095484678"; 
       //  Find the index of 8

//Find the last index of o
int lastIndexOf = m1.lastIndexOf('o');
	System.out.println(lastIndexOf);
	
	// Find the index of n
int indexOf = m2.indexOf('n');
System.out.println(indexOf);

//Find the  index of  (emptyspace)
int indexOf2 = m4.indexOf(" ");
	System.out.println(indexOf2);
	
	//Find the last index of  (emptyspace)
	int lastIndexOf2 = m4.lastIndexOf(" ");
	System.out.println(lastIndexOf2);
	
	
	int indexOf3 = m5.indexOf('8');
	System.out.println(indexOf3);
	
	
	String replace = m1.replace("G", "g");
	System.out.println(replace);
	
	String concat = m1.concat("selenium");
	System.out.println(concat);
	
	
	
	}

}
