package fullstack.java.sekar.DhanaSekarJava.array;

public class CLDemo 
{
	// sink local to hai
	public static void hai(Double sink)// arg without return
	{
		System.out.println(sink);
		sink-=2;
		System.out.println(sink);
	}
	public static void affect(Integer yet)
	{
		yet=yet+100;
		System.out.println("Value @ affect method "+yet);
	}
	public static void heyThere(int[] acc)
	{
		acc[0]=987;
		System.out.println(acc[0]+" @ heyThere");
	}
	public static void main(String[] args) // args, milages, fine are the local variables to main
	{
		int[] milages=new int[10];// created array of Integers
		Double fine=9.2;
		System.out.println(fine);
		
		// call by value: while calling the function with arg, values are copied and no changes happen here 
		CLDemo.hai(fine);
		System.out.println(fine+" in main");
		
		Integer wet=145;
		CLDemo.affect(wet);
		System.out.println(wet+" in main");
		
		CLDemo.affect(milages[0]);
		System.out.println(milages[0]+" in main");
		
		// call by reference: while calling the function with array, address are shared between two functions local variables
		CLDemo.heyThere(milages);
		System.out.println(milages[0]+" in main");
	}
}
