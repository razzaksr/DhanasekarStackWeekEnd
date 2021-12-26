package fullstack.java.sekar.DhanaSekarJava;

public class NestedLoop 
{
	public static void main(String[] args) 
	{
		for(int tab=1;tab<=5;tab++)
		{
			System.out.println("Table of "+tab);
			for(int num=1;num<=10;num++)
			{
				System.out.println(num+" X "+tab+" = "+(num*tab));
			}
		}
	}
}
