package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

public class StockClearance 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		int stock=25, day=1;double perStock=8999.5;
		double perDay=0.0, total=0.0;
		
		for(;day<=5&&stock>0;)
		{
			System.out.println("Tell us no os items sold: ");
			int qty=scan.nextInt();
			if(qty<=stock)
			{
				perDay=qty*perStock;
				System.out.println("Today Collection is: "+perDay+" @ day "+day);
				total+=perDay;
				perStock-=(perStock*0.075);
				stock-=qty;
				day++;
			}
		}
		
		System.out.println("Total collection of stock clearance sale: "+total+" and no stock left "+stock);
		
		scan.close();
	}
}
