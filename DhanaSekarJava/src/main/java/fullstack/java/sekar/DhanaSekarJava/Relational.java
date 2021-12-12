package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

/*
 * Relational Operators: > >= < <= == !=
 * 
 */

public class Relational 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		/*
		 * System.out.println("Tell us required case: "); int amt=scan.nextInt();
		 * System.out.println(amt%500 == 0);
		 */
		
		System.out.println("Tell us your annual income: ");
		double annual=scan.nextDouble();
		System.out.println("Do i need to pay tax: "+(annual>5.0));
		
		System.out.println("Are you eligible for P.Loan: "+(!(annual>9.1)));
		
		System.out.println("Are you eligible for 10 percent increment: "+(annual<3.5));
		
		
		
		
		
		
		scan.close();
	}
}
