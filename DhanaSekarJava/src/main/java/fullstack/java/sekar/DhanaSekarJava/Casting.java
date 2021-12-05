package fullstack.java.sekar.DhanaSekarJava;

/*
 * Type Conversion:
 * a. casting: between data types
 * (Type)data
 * b. parsing: String to other formats
 * 
 */

public class Casting 
{
	public static void main(String[] args) 
	{
		int hai=90;
		char yet='\0';
		yet=(char)hai;// casting from int to char
		System.out.println(yet);
		
		int fuel=32;
		float kms=456.9F;
		
		System.out.println((int)kms/fuel);
		
		System.out.println(fuel/kms);
		
		System.out.printf("Taken fuel for 1km in ml:%.2f\n",(fuel/kms));
		
		
		Character spell='R';
		Integer dig=0;
		
		//dig=(Integer)spell;
		
		dig=(int)spell;
		
		System.out.println(dig);
	}
}
