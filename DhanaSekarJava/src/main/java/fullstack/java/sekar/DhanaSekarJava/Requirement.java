package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

public class Requirement 
{
	public static void main(String[] args) 
	{
		String tech="", location="";
		double salary=0.0;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Welcome to ZEALOUS TECH CORP");
		System.out.println("Tell us your desired job technology: ");
		tech=scan.nextLine();
		System.out.println("Tell us your desired salary: ");
		salary=scan.nextDouble();
		System.out.println("Tell us your desired job location: ");
		location=scan.next();
		
		
		System.out.println("Your request has submitted with "+tech+" location of "+location+" for the package "+salary);
		
		scan.close();
	}
}
