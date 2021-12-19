package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

public class DemoSwitch 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		/*
		System.out.println("Tell us amount:");
		int amt=scan.nextInt();
		
		switch(amt)
		{
		case 120:System.out.println("Second Class");break;
		case 150:System.out.println("First Class");break;
		case 180:System.out.println("Balcony");break;
		default:System.out.println("No Class available for "+amt);
		}
		*/
		
		/*
		System.out.println("Tell us technology by first letter: ");
		char skill=scan.next().charAt(0);
		
		switch(skill)
		{
		case 'f': case 'F':
			System.out.println("F# dot net framework available");break;
		case 'p': case 'P':
			System.out.println("Python available");break;
		case 'j': case 's':
			System.out.println("Java available");break;
		case 'r': case 'R':
			System.out.println("R programming available");break;
		case 'c': case '+':
			System.out.println("C and CPP available");break;
		default:System.out.println(skill+" not available");
		}
		*/
		
		
		System.out.println("Tell us technology you learnt for finding a job");
		String tech=scan.next();
		
		switch(tech)
		{
		case "java":case "JAVA": case "Javascript": case "javascript":
			System.out.println("Full Stack on "+tech+" available in Zealous");break;
		case "python":case "r": 
			System.out.println("Datascientist/ Automation/ DL available in Zealous for "+tech);break;
		case "php":case "c#":case "dotnet":
			System.out.println("Web developer available in Zealous for "+tech);break;
		default: System.out.println("No roles available for "+tech);
		}
		
		scan.close();
	}
}
