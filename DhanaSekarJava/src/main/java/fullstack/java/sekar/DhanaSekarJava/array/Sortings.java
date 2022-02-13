package fullstack.java.sekar.DhanaSekarJava.array;

import java.util.Arrays;

/*
 * O(n2)
 * Selection
 * Bubble
 */

public class Sortings 
{
	public static void bubble(float[] hai)
	{
		for(int times=0;times<hai.length-1;times++)
		{
			for(int pos=0;pos<hai.length-1-times;pos++)
			{
				if(hai[pos]>hai[pos+1])
				{
					hai[pos]*=hai[pos+1];
					hai[pos+1]=hai[pos]/hai[pos+1];
					hai[pos]/=hai[pos+1];
				}
			}
		}
	}
	
	public static void selection(String[] yet)
	{
		String third="";
		for(int select=0;select<yet.length;select++)
		{
			for(int com=select+1;com<yet.length;com++)
			{
				if(yet[select].compareTo(yet[com])>0)
				{
					third=yet[select];
					yet[select]=yet[com];
					yet[com]=third;
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		float[] weight= {45.9F,98.3F,67.1F,88.4F,65.1F,74.9F,56.9F,120.5F,35.8F};
		String[] mcu= {"Iron Man","Hulk","Iron Man2","Thor","Avengers","Iron Man3","Thor2","Avengers2","Thor3","Civil war","Infinity War","Home coming","End Game"};
		System.out.println(Arrays.toString(weight));
		Sortings.bubble(weight);
		System.out.println(Arrays.toString(weight));
		System.out.println(Arrays.toString(mcu));
		Sortings.selection(mcu);
		System.out.println(Arrays.toString(mcu));
	}
}
