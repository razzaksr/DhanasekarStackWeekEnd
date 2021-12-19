package fullstack.java.sekar.DhanaSekarJava;

public class DemoLoops 
{
	public static void main(String[] args) 
	{
		// series of even numbers
		int start=9,end=99;
		
		/*
		while(start<=end)
		{
			if(start%2==0) {
				System.out.println(start);
			}
			start++;// iter
		}
		*/
		
		/*
		for(start=1;start<=end;start++)
		{
			if(start%2==0) {
				System.out.println(start);
			}
		}
		*/
		
		start=100;
		do
		{
			if(start%2==0) {
				System.out.println(start);
			}
			start++;
		}while(start<=end);
	}
}
