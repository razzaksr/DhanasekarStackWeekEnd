package fullstack.java.sekar.DhanaSekarJava.array;

public class FindMins 
{
	public static void main(String[] args) 
	{
		int[] price= {1800,4500,4100,2100,4000,5100,12900,4000,3400,6500,7200,1000,4100,45000,3100,820,1900};
		int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
		for(int index=0;index<price.length;index++)
		{
			if(min1>price[index])
			{
				min2=min1;
				min1=price[index];
			}
			else if(min2>price[index])
			{
				min2=price[index];
			}
		}
		
		System.out.println("Minimum budgets "+min1+" and "+min2);
	}
}
