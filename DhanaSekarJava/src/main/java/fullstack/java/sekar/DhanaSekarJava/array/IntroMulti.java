package fullstack.java.sekar.DhanaSekarJava.array;

import java.util.Arrays;

/*
 * Multidimentional:every row may have balanced columns
 * type[][] var={{v1,v2,v3},{v1,v3,v5},{.....}}
 * type[][] var=new type[row][col];
 * 
 * Jagged:every row may have im-balanced columns
 *  
 */

public class IntroMulti 
{
	public static void list(Object[][] wind)
	{
		// O(n) using forEach
//		for(double[] row:wind)
//		{
//			System.out.println(Arrays.toString(row));
//		}
		// O(n) using for
//		for(int index=0;index<wind.length;index++)
//		{
//			System.out.println(Arrays.toString(wind[index]));
//		}
		
		// O(n2) using forEach
//		for(double[] row:wind)
//		{
//			for(double col:row)
//			{
//				System.out.print(col+" ");
//			}
//			System.out.println();
//		}
		// O(n2) using for
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
		Double[][] yet= {{9.2,4.5,7.1},{6.9,4.7,12.1},{6.6,1.9,0.2}};
		Integer[][] hai= {{98,23,12,67,4},{8,2,4,65,12,89,56,4,2,50},{91,23,6}};
		IntroMulti.list((Object[][])yet);
		IntroMulti.list((Object[][])hai);
	}
}
