package fullstack.java.sekar.DhanaSekarJava.oop;

import java.util.Arrays;

public class DemoStaticMember 
{
	public static void main(String[] args) 
	{
		System.out.println(West.hai.length);
		West west=new West();
		west.display();
		West.Delta.haiThere();
		West.Delta del=new West.Delta();
		del.find(5);
	}
}

class West
{
	static int[] hai= {34,89,12,98,4,23,1,45,23,54,1,34,5,21};
	public void display()
	{
		System.out.println(Arrays.toString(hai));
	}
	static class Delta
	{
		public static void haiThere()
		{
			for(int index=hai.length-1;index>=0;index--)
			{
				System.out.print(hai[index]+" ");
			}
			System.out.println();
		}
		public void find(int condition)
		{
			for(int index=0;index<hai.length;index++)
			{
				if(hai[index]<=condition)
					System.out.print(hai[index]+" ");
			}
			System.out.println();
		}
	}
}