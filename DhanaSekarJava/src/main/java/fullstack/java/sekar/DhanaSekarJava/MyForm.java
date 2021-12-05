package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

public class MyForm 
{
	public static void main(String[] args) 
	{
		/*
		 * String name="Dhanasekar";// literal String pan=new String("ABCD98763E");//
		 * non literal long aadhar=98765432103L; long mobile=9876543210L; String
		 * email="dhanasekar@gmail.com";
		 */
		
		// initialization
		String name="", pan="", email="";
		long aadhar=0L, mobile=0L;
		
		Scanner sekar=new Scanner(System.in);
		
		
		System.out.println("---------Welcome to Bajaj FinServ----------");
		System.out.println("Tell us your name: ");
		name=sekar.next();
		System.out.println("Tell us PAN number: ");
		pan=sekar.next();
		System.out.println("Tell us Aadhaar number: ");
		aadhar=sekar.nextLong();
		System.out.println("Tell us your contact number: ");
		mobile=sekar.nextLong();
		System.out.println("Tell us your email: ");
		email=sekar.next();

		
		
		
		System.out.println("Dear "+name+", Thanks for registering LOAN application and further updates will sent to "+mobile+" also "+email);
		
		sekar.close();
	}
}
