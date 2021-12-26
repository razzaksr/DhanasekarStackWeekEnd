package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

public class LoopSeries 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Tell us count you want: ");
		int count=scan.nextInt(); 
		/*
		// fibonacci: 0 1 1 2 3 5 8 .............
		int num1=0,num2=1, sum=0;
		if(count>=2)
		{
			System.out.println(num1+"\n"+num2);
			count-=2;
			while(count>0)
			{
				sum=num1+num2;
				System.out.println(sum);
				num1=num2;
				num2=sum;
				count--;
			}
		}
		*/
		
		/*
		System.out.println("Prime series between 2 and "+count);
		
		for(int each=2;each<=count;each++)
		{
			if(each==2 || each==3 || each==5 || each==7 || each%2!=0 && each%3!=0 && each%5!=0 && each%7!=0)
			{
				System.out.println(each);
			}
		}
		*/
		
		// factorial: 5=> 5x4x3x2x1 = 120
		int fact=1;
		while(count>0)
		{
			fact*=count;
			count--;
		}
		System.out.println("factorial is: "+fact);
		scan.close();
	}
}
