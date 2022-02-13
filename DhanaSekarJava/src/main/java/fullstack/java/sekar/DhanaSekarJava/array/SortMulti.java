package fullstack.java.sekar.DhanaSekarJava.array;

import java.util.Arrays;

public class SortMulti 
{
	public static void selection(String[][] old)
	{
		String third="";
		for(int row=0;row<old.length;row++)
		{
			for(int select=0;select<old[row].length;select++)
			{
				for(int com=select+1;com<old[row].length;com++)
				{
					if(old[row][select].compareTo(old[row][com])<0)
					{
						third=old[row][select];
						old[row][select]=old[row][com];
						old[row][com]=third;
					}
				}
			}
			System.out.println(Arrays.toString(old[row]));
		}
	}
	public static void main(String[] args) 
	{
		String[][] mcu= {{"IronMan","Thor","EndGame"},{"CivilWar","Eternals","Avengers"},{"FarFromHome","InfinityWar"}};
		SortMulti.selection(mcu);
	}
}
