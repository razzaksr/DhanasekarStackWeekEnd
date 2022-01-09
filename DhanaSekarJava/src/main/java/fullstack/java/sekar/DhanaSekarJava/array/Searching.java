package fullstack.java.sekar.DhanaSekarJava.array;

import java.util.Arrays;

public class Searching 
{
	public static int linear(short[] hai,short data)// arg>> data with return>> position
	{
		for(int index=0;index<hai.length;index++)
		{
			if(hai[index]==data)
			{
				return index;
			}
		}
		return -1;// indicates that element not found anywhere
	}
	
	public static int binary(short[] arr,int start,int end,short data)
	{
		if(end>=start)
		{
			int mid=(end+start)/2;
			if(arr[mid]==data)
				return mid;
			else if(arr[mid]<data)
				return binary(arr, mid+1, end, data);
			else
				return binary(arr, start, mid, data);
		}
		else
			return -1;
	}
	
	public static void main(String[] args) 
	{
		short[] prices= {870,1530,980,4500,12900,5400,1200,410,3200,10000};
		
		System.out.println(Searching.linear(prices, (short) 980));
		System.out.println(Searching.linear(prices, (short) 66666));
		
		Arrays.sort(prices);
		System.out.println(Arrays.toString(prices));
		System.out.println(Searching.binary(prices, 0, prices.length-1, (short) 410));
		System.out.println(Searching.binary(prices, 0, prices.length-1, (short) 12900));
		System.out.println(Searching.binary(prices, 0, prices.length-1, (short) 4500));
		System.out.println(Searching.binary(prices, 0, prices.length-1, (short) 410000));
	}
}
