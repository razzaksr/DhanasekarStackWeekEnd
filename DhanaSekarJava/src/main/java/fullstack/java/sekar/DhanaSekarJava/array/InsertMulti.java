package fullstack.java.sekar.DhanaSekarJava.array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertMulti 
{
	static Scanner scan=new Scanner(System.in);
	public static void copy(String[] one,String[][] two)
	{
		int col=0;
		
		for(int floor=0,index=0;floor<two.length;floor++)
		{
			System.out.println("Tell us no of cols @ "+floor);
			col=scan.nextInt();
			two[floor]=new String[col];// initialize each row col size
			for(int home=0;home<two[floor].length&&index<one.length;home++,index++)
			{
				two[floor][home]=one[index];
			}
			//System.out.println(Arrays.toString(two[floor]));
		}
	}
	public static void iterate(Object[][] wind)
	{
		for(int row=0;row<wind.length;row++)
		{
			for(int col=0;col<wind[row].length;col++)
			{
				System.out.print(wind[row][col]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		String[] mcu= {"Iron Man","Hulk","Iron Man2","Thor","Avengers","Iron Man3","Thor2","Avengers2","Thor3","Civil war","Infinity War","Home coming","End Game"};
		String[][] mov= {};// initialize
		int row=0;
		System.out.println("Tell us no of row:");
		row=scan.nextInt();
		mov=new String[row][];
		InsertMulti.copy(mcu, mov);
		//System.out.println(mov.length);
		InsertMulti.iterate((Object[][])mov);
	}
}
