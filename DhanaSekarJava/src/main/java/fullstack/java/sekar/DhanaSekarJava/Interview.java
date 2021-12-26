package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

public class Interview 
{
	public static void main(String[] args) 
	{
		System.out.println("------------------welcome to TCS campus interview----------------------");
		Scanner scan=new Scanner(System.in);
		/*
		String skill="";int enrolled=30, recruited=0;
		
		while(enrolled>0)
		{
			System.out.println("Tell us technology u knew: ");
			skill=scan.nextLine();
			skill=skill.toLowerCase();
			switch(skill)
			{
			case "java":case "java script":
				System.out.println("We'll recruite you for web developer role");
				recruited++;
				break;
			case "python":case "r":
				System.out.println("We'll recruite you for Datascientist role");
				recruited++;
				break;
			default:System.out.println("Please update your skill");
			}
			enrolled--;
		}
		
		System.out.println("Recruited people: "+recruited);
		*/
		
		String skill="";int required=30;
		
		while(required>0)
		{
			System.out.println("Tell us technology u knew: ");
			skill=scan.nextLine();
			skill=skill.toLowerCase();
			switch(skill)
			{
			case "java":case "java script":
				System.out.println("We'll recruite you for web developer role");
				required--;
				break;
			case "python":case "r":
				System.out.println("We'll recruite you for Datascientist role");
				required--;
				break;
			default:System.out.println("Please update your skill");
			}
		}
		
		System.out.println("Best wishes for Recruited people");
		
		scan.close();
	}
}
