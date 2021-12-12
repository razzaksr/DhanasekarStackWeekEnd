package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

// Arithmetic: + - * / %

public class OperArith
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		/*
		 * System.out.println("Tell us amount wish to debit: ");
		 * 
		 * int amt=scan.nextInt(); System.out.println("Amount status: "+(amt%2000==0));
		 * 
		 * int hai=255;
		 * 
		 * String reversed=""; reversed=reversed+(hai%10);//reminder hai=hai/10;//
		 * quotient reversed=reversed+(hai%10);// reminder hai=hai/10;// quotient
		 * reversed=reversed+(hai%10);// reminder
		 * 
		 * System.out.println(reversed);
		 * 
		 * 
		 * Double exp1,exp2; exp1=scan.nextDouble();// 8 exp2=scan.nextDouble();// 9
		 * 
		 * System.out.println("Person1's experience: "+exp1+" Person2's experience: "
		 * +exp2);
		 * 
		 * exp1=exp1*exp2; exp2=exp1/exp2; exp1=exp1/exp2;
		 * 
		 * System.out.println("Person1's experience: "+exp1+" Person2's experience: "
		 * +exp2);
		 */
		/*
		 * System.out.println("Tell us deposit amount: "); int amt=scan.nextInt();
		 * System.out.println("Tell us year: "); int year=scan.nextInt();
		 * 
		 * double interest=(amt*6.5)/100;
		 * 
		 * interest=interest*year;
		 * 
		 * double maturity=amt+interest;
		 * 
		 * System.out.println("Maturity of the year: "+maturity);
		 */
		
		/*
		 * System.out.println("Tell us maturity value:"); int maturity=scan.nextInt();
		 * System.out.println("Tell us year: "); int year=scan.nextInt();
		 * 
		 * double interest=(maturity*6.5)/100;
		 * 
		 * interest=interest*year;
		 * 
		 * double principle=maturity-interest;
		 * 
		 * System.out.println("Deposition amount should be "
		 * +principle+" for the maturity "+maturity+" of "+year+" year");
		 */
		
		System.out.println("swap");
		
		Double exp1,exp2; exp1=scan.nextDouble();// 8 
		exp2=scan.nextDouble();// 9
		 
		System.out.println("Person1's experience: "+exp1+" Person2's experience: "+exp2);
		exp1=exp1+exp2; 
		exp2=exp1-exp2; 
		exp1=exp1-exp2;
		System.out.println("Person1's experience: "+exp1+" Person2's experience: "+exp2);
		
		scan.close();
	}
}
