package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

public class Denominations 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int c_2000s=5,c_500s=10,c_200s=50,c_100s=50, reqCount=0;
		int total=(c_2000s*2000)+(c_500s*500)+(c_200s*200)+(c_100s*100);
		
		String receipt="";
		
		System.out.println("Tell us amount to withdraw: ");
		int cash=scan.nextInt();
		if(cash<=total)
		{
			// cash can be dispensed find out combinations
			
			// check for 2000s currency can be dispensed or not
			if(cash/2000!=0 && c_2000s>0)
			{
				//check for how many currency gonna provided
				reqCount=cash/2000;// 4000/2000 = 2; 20000/2000 = 10
				if(reqCount<=c_2000s) // 2 <= 5 ; 10 <= 5
				{
					cash-=(reqCount*2000);// 4000-(2*2000)
					c_2000s-=reqCount;// 5-2=3
					receipt+="2000 X "+reqCount+"\n";
				}
				else
				{
					cash-=(c_2000s*2000);
					receipt+="2000 X "+c_2000s+"\n";
					c_2000s=0;
				}
			}
			
			// check for 500s currency can be dispensed or not
			if(cash/500!=0 && c_500s>0 && cash>0)
			{
				//check for how many currency gonna provided
				reqCount=cash/500;// 4000/2000 = 2; 20000/2000 = 10
				if(reqCount<=c_500s) // 2 <= 5 ; 10 <= 5
				{
					cash-=(reqCount*500);// 4000-(2*2000)
					c_500s-=reqCount;// 5-2=3
					receipt+="500 X "+reqCount+"\n";
				}
				else
				{
					cash-=(c_500s*500);
					receipt+="500 X "+c_500s+"\n";
					c_500s=0;
				}
			}
			
			if(cash/200!=0 && c_200s>0 && cash>0)
			{
				//check for how many currency gonna provided
				reqCount=cash/200;// 4000/2000 = 2; 20000/2000 = 10
				if(reqCount<=c_200s) // 2 <= 5 ; 10 <= 5
				{
					cash-=(reqCount*200);// 4000-(2*2000)
					c_200s-=reqCount;// 5-2=3
					receipt+="200 X "+reqCount+"\n";
				}
				else
				{
					cash-=(c_200s*200);
					receipt+="200 X "+c_500s+"\n";
					c_200s=0;
				}
			}
			
			if(cash/100!=0 && c_100s>0 && cash>0)
			{
				//check for how many currency gonna provided
				reqCount=cash/100;// 4000/2000 = 2; 20000/2000 = 10
				if(reqCount<=c_100s) // 2 <= 5 ; 10 <= 5
				{
					cash-=(reqCount*100);// 4000-(2*2000)
					c_100s-=reqCount;// 5-2=3
					receipt+="100 X "+reqCount+"\n";
				}
				else
				{
					cash-=(c_100s*100);
					receipt+="100 X "+c_100s+"\n";
					c_100s=0;
				}
			}
			
			System.out.println("Required cash dispensed by\n"+receipt);
		}
		else
		{
			System.out.println(cash+" cann't dispensed due to unavailable cash in machine");
		}
		
		scan.close();
	}
}
