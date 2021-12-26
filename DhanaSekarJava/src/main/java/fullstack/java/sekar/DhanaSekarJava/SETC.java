package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

public class SETC 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		for(double bus=8.00;bus<=8.45;bus+=0.15)
		{
			System.out.println("Arraived bus is "+bus);
			int noOfBooked=0;
			for(int seats=1;seats<=15;seats++)
			{
				System.out.println("Enter the amount: ");
				int amt=scan.nextInt();
				if(amt>=340)
				{
					System.out.println("Seat booked in "+seats+" @ bus timing "+bus);
					noOfBooked++;
				}
				else {
					System.out.println("Can't book the seat for "+bus);
				}
			}
			System.out.println(noOfBooked+" seats are booked @ "+bus);
		}
		
		scan.close();
	}
}
