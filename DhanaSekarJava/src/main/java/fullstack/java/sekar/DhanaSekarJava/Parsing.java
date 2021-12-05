package fullstack.java.sekar.DhanaSekarJava;

/*
 * Parsing:String to other formats
 * 
 * WrapperClass.parseType(String)
 * 
 */

public class Parsing 
{
	public static void main(String[] args) 
	{
		String hello="986";
		
		int hey=Integer.parseInt(hello);
		
		System.out.println(hey+4);
		
		hello="34.9";
		
		double earn=Double.parseDouble(hello);
		
		System.out.println(earn/2);
		
		hello="dhanasekar";
		
		boolean yet=Boolean.parseBoolean(hello);
		
		System.out.println(yet);
		
		hello="hai8734R";
		
		short undo=Short.parseShort(hello);
		
		System.out.println(undo+2);
	}
}
