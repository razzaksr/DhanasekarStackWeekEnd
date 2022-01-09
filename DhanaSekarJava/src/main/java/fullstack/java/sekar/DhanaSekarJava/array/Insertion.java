package fullstack.java.sekar.DhanaSekarJava.array;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion 
{
	public static void adding(int[] white)
	{
		Scanner scan=new Scanner(System.in);
		for(int index=0;index<white.length;index++)
		{
			System.out.println("Enter the value @ "+index);
			white[index]=scan.nextInt();
		}
		scan.close();
	}
	
	public static void traverse(int[] queen)
	{
		for(int w:queen)
		{
			System.out.println(w);
		}
	}
	
	public static void main(String[] args) 
	{
		int[] milages=new int[10];// created array of Integers
		Insertion.adding(milages);
		//System.out.println(Arrays.toString(milages));
		Insertion.traverse(milages);
	}
}
