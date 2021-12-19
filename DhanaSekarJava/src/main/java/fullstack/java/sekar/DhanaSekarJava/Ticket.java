package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

public class Ticket 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the amount: ");
		int amt=scan.nextInt();
		if(amt>=240)
		{
			System.out.println("Ticket booked");
		}
		else
		{
			System.out.println("Ticket couldn't booked");
		}
		scan.close();
	}
}
