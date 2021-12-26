package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

public class Chats 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		String chart="";
		for(int row=1;row<=7;row++)
		{
			for(int seat=1;seat<=4;seat++)
			{
				System.out.println("Enter the amount: ");
				int fare=scan.nextInt();
				if(fare>=380)
				{
					System.out.println(seat+" has booked @ "+row);
					chart+="$";
				}
				else {
					System.out.println(seat+" hasn't booked");
					chart+="#";
				}
				if(seat==2)
					chart+=" ";
			}
			chart+="\n";
		}
		
		System.out.println("Chart for the ticket booking process is:\n"+chart);
		scan.close();
	}
}
