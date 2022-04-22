package org.cts.java;
import org.zoho.java.Client;
public class Employee {

	public void employeeName() {
		System.out.println("employeeName is prakash");
	}
	public void employeeId() {
		System.out.println("employeeId is 3565");
	}
	 public static void main(String []arrays){
		 Employee K=new Employee();
		 K.employeeName();
	     K.employeeId();
	     Client P=new Client();
	     P.clientId();
	     P.clientName();
	 }
	 
}
