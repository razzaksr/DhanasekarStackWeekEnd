package fullstack.java.sekar.DhanaSekarJava.array;

import java.util.Arrays;
import java.util.Scanner;

public class Transactions 
{
	public static void main(String[] args) 
	{
		int[] trans=new int[10];
		
		Scanner scan=new Scanner(System.in);
		
		for(int index=0;index<trans.length;index++)
		{
			System.out.println("Tell us balance @ "+index+" time ");
			trans[index]=scan.nextInt();
		}
		int count=0;
		for(int index=1;index<trans.length;index++)
		{
			if(trans[index]<trans[index-1])
			{
				count++;
			}
		}
		
		count-=3;
		
		if(count>0)
		{
			count*=20;
			trans[trans.length-1]-=count;
			System.out.println("Available balance after charges "+count+" deducted: "+trans[trans.length-1]);
		}
		else
		{
			System.out.println("No charges deducted");
		}
		System.out.println(Arrays.toString(trans));
		scan.close();
	}
}
