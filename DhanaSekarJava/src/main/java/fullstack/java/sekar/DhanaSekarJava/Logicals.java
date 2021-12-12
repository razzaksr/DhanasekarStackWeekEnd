package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

/*
 * Logical Operator: && || 
 * (rel)&&(rel)
 */

public class Logicals
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tell us salary: ");
		double annual=scan.nextDouble();
		System.out.println("Tell us Year's of ITR: ");
		int noYear=scan.nextInt();
		
		System.out.println("Am i eligible for ICICI credit card limit of 1Lack: "+((annual>=4.5)&&(annual<7.1)));
		
		System.out.println("Am i eligible for Business Loan: "+((noYear>=5)&&(annual>=9)));
		
		System.out.println("Am i eligible for Auto Loan: "+((noYear>=4)||(annual>=6.2)));
		
		scan.close();
	}
}
