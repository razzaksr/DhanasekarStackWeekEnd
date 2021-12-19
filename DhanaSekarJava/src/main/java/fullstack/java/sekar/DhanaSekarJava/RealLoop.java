package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

public class RealLoop 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Flipkart flash sale for iPhone 13");
		int stock=5;
		
		/*
		while(stock>0)
		{
			System.out.println("Tell us amount: ");
			int amt=scan.nextInt();
			if(amt>=78900)
			{
				System.out.println("You bought an iPhone 13 Pro");
				stock--;
			}
			else
			{
				System.out.println("Insufficient amoun to buy iPhone");
			}
//			stock--;
		}
		*/
		
		for(;stock>0;)
		{
			System.out.println("Tell us amount: ");
			int amt=scan.nextInt();
			if(amt>=78900)
			{
				System.out.println("You bought an iPhone 13 Pro");
				stock--;
			}
			else
			{
				System.out.println("Insufficient amoun to buy iPhone");
			}
		}
		
		scan.close();
	}
}
