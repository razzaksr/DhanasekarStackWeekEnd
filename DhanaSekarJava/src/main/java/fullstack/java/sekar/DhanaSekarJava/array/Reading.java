package fullstack.java.sekar.DhanaSekarJava.array;

import java.util.Scanner;

public class Reading 
{
	static Scanner scan=new Scanner(System.in);
	public static void findOne(char[] ate)
	{
		System.out.println("Tell us which index value you want: ");
		int position=scan.nextInt();
		if(position<ate.length)
		{
			System.out.println(ate[position]+" is the data available @ "+position);
		}
		else
		{
			System.out.println(position+" is not valid");
		}
	}
	
	public static void findMany(char[] way)
	{
		System.out.println("Tell us max character value : ");
		char mine=scan.next().charAt(0); // "REVERT"
//		for(int index=0;index<way.length;index++)
//		{
//			if(way[index]<=mine)
//			{
//				System.out.println(way[index]);
//			}
//		}
		for(char t:way)
		{
			if(t<=mine)
			{System.out.println(t);}
		}
	}
	
	public static void main(String[] args) 
	{
		char[] versions= {'O','Z','E','A','U','L','S'};// array of characters, 0-6
		System.out.println(versions.length);
		Reading.findOne(versions);
		Reading.findMany(versions);
	}
}
