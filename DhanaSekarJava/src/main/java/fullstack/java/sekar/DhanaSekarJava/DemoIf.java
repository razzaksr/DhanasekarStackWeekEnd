package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

public class DemoIf 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		/*
		int total=10;
		System.out.println("Tell us how many tickets you want: ");
		int count=scan.nextInt();
		if(count<=total)
		{
			int payable=count*210;
			System.out.println("Enter the amount: ");
			int amt=scan.nextInt();
			if(amt>=payable)
			{
				total-=count;
				System.out.println(count+" tickets has booked");
			}
			else 
			{
				System.out.println(count+" tickets hasn't booked due to insufficient pay");
			}
		}
		else 
		{
			System.out.println(count+" tickets not available since "+total);
		}
		*/
		
		/*
		System.out.println("Tell us budget of Yours to buy bean bag");
		int budget=scan.nextInt();
		
		if(budget>=5000)
		{
			System.out.println("STAR bean bags with 4.1 rating available");
		}
		else if(budget>=1500&&budget<=2000)
		{
			System.out.println("TURBO bean bags with 3.8 rating available");
		}
		else if(budget>2000&&budget<5000)
		{
			System.out.println("SpaceX bean bags with 4.0 rating available");
		}
		else
		{
			System.out.println("Bean bag not available");
		}
		*/
		
		System.out.println("Tell us your experience: ");
		int exp=scan.nextInt();
		
		if(exp>=12)
		{
			System.out.println("You can apply for Project Manager Role");
		}
		if(exp>=2)
		{
			System.out.println("You can become L2 developer role");
		}
		if(exp>=4)
		{
			System.out.println("Senior developer role");
		}
		if(exp>=7)
		{
			System.out.println("Consultant role");
		}
		else
		{
			System.out.println("You can't apply to any job");
		}
		
		scan.close();
	}
}
