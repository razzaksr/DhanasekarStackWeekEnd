package fullstack.java.sekar.DhanaSekarJava.oop;

import java.util.Arrays;

public class DemoMembers 
{
	public static void main(String[] args) 
	{
		Bundle bundle=new Bundle();
		Bundle.bikes[2]="Discover150";//bundle.bikes[2]="Discover150";
		//bundle.hello();
		//bundle.hai();
		Bundle.hai(bundle);
		Bundle dhana=new Bundle();
		dhana.items[0]="Tab";
		//dhana.hello();
		//dhana.hai();
		Bundle.hai(dhana);
		Bundle razak=new Bundle();
		//razak.hello();
		//razak.hai();
		Bundle.hai(razak);
		
	}
}

class Bundle
{
	String[] items= {"Laptop","Cloths","Umberla","Jerkin","Mobile","Charger","Shoes"};
	static String[] bikes= {"Avenger","FZ","Apache","Hunk","Dio"};
	public static void hai(Bundle obj)
	{
		System.out.println("Listing arrays using static block hai");
		System.out.println(Arrays.toString(bikes));
		//Bundle obj=new Bundle();
		System.out.println(Arrays.toString(obj.items));
	}
	public void hello()
	{
		System.out.println("Listing arrays using Non static block hello");
		System.out.println(Arrays.toString(items));
		System.out.println(Arrays.toString(bikes));
	}
}