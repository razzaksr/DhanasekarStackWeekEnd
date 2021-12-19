package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

public class BusBooking 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		float time=0.0F;int amt=0;
		System.out.println("-----------------Welcome to Dhana Travels------------------");
		System.out.println("Choose destination: ");
		String dest=scan.next();
		dest=dest.toLowerCase();
		switch(dest)
		{
		case "cochin":
			System.out.println(dest+" available in evening");break;
		case "chennai":
			System.out.println(dest+" available in 24hrs");break;
		case "hyderabad":
			System.out.println(dest+" available in night");break;
		case "banglore":
			System.out.println(dest+" available in morning and afternoon");
			System.out.println("Tell us timing of travel to "+dest);
			time=scan.nextFloat();
			if(time>=6.00&&time<=10.00)
			{
				System.out.println("Semi Sleepers are available to "+dest+" in "+time);
			}
			else if(time>=10.00&&time<=12.00)
			{
				System.out.println("A/C Seater are available to "+dest+" in "+time);
			}
			else if(time>=12.01&&time<=15.20)
			{
				System.out.println("A/C Sleeper are available to "+dest+" in "+time);
				System.out.println("Enter the amount to travel "+dest+" in "+time);
				amt=scan.nextInt();
				if(amt>=600)
				{
					System.out.println("Ticket booked in A/C Sleeper to "+dest+" in "+time);
				}
				else
				{
					System.out.println("Ticker couldn't booked to "+dest+" in "+time+" of A/C Sleeper due to less pay");
				}
			}
			else
			{
				System.out.println(time+" not match for "+dest);
			}
			
			break;
		default:System.out.println("Service to "+dest+" not available");
		}
		
		scan.close();
	}
}
