package fullstack.java.sekar.DhanaSekarJava.oop;

import java.util.Arrays;

import fullstack.java.sekar.DhanaSekarJava.oop.Alpha.Zeta;

public class DemoNonStaticMember 
{
	public static void main(String[] args) 
	{
		System.out.println(Arrays.toString(Alpha.wankade));
		Alpha obj=new Alpha();
		obj.show(2, 5);
		obj.show(2, 15);
		Zeta zeta=obj.new Zeta();
		zeta.filter("Gambir", "Shami");
	}
}

class Alpha
{
	static String[] wankade= {"Sachin","Zahir","Harbajan","Arjun","Sewag","Gambir"};
	
	public void show(int start,int end)
	{
		if(start<=end&&end<wankade.length)
		{
			for(;start<end;start++)
			{
				System.out.print(wankade[start]+" ");
			}
			System.out.println();
		}
		else {
			System.out.println("Invalid boundry");
		}
	}
	class Zeta
	{
		public void filter(String old,String latest)
		{
			for(int index=0;index<wankade.length;index++)
			{
				if(wankade[index].equals(old))
				{
					wankade[index]=latest;
					System.out.println(latest+" kickouts "+old);
					return;
				}
			}
			System.out.println(old+" not matched with any player");
		}
	}
}