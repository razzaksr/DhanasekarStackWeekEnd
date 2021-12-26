package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

public class Patterns 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tell us no of rows: ");
		int line=scan.nextInt();
		int value=line;
		
		// perfect square
		for(int row=1;row<=line;row++)
		{
			for(int data=1;data<=line;data++,value+=line)
			{
				System.out.print(value);
			}
			System.out.println();
		}
		
		// left upper floyd
		for(int row=1;row<=line;row++)
		{
			for(int data=1;data<=row;data++,value+=line)
			{
				System.out.print(value);
			}
			System.out.println();
		}
		
		// right upper floyd
		for(int row=1;row<=line;row++)
		{
			for(int space=line-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int data=1;data<=row;data++,value+=line)
			{
				System.out.print("$");
			}
			System.out.println();
		}
		
		// upper pascal
		for(int row=1;row<=line;row++)
		{
			for(int space=line-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int data=1;data<=row;data++,value+=line)
			{
				System.out.print("$ ");
			}
			System.out.println();
		}
		
		//pyramid upper
		int limit=1;
		for(int row=1;row<=line;row++)
		{
			for(int space=line-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int data=1;data<=limit;data++,value+=line)
			{
				System.out.print("$");
			}
			System.out.println();
			limit+=2;
		}
		scan.close();
	}
}
