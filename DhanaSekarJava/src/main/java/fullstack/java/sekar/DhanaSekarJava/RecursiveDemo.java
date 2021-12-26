package fullstack.java.sekar.DhanaSekarJava;

public class RecursiveDemo 
{
	public static void main(String[] args) 
	{
		Facting fac=new Facting();
		System.out.println(fac.facts(7));
		fac.hell(3);
	}
}


class Facting
{
	
	public void hell(int step)
	{
		if(step<10)
		{
			System.out.println("Hello there!");
			step++;
			hell(step);// recursive
		}
		return;
	}
	
	int factorial=1;
	public int facts(int number)
	{
		if(number>0)
		{
			factorial*=number;
			facts(number-1);
		}
		return factorial;
	}
}