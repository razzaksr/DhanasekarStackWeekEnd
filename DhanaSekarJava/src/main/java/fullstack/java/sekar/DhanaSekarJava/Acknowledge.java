package fullstack.java.sekar.DhanaSekarJava;

public class Acknowledge 
{
	public static void main(String[] args) 
	{
		Shapes shape=new Shapes();
		String hai=shape.pyramid(8);
		System.out.println(hai);
		/*
		 * double d=Shapes.role("r"); System.out.println(d);
		 */
		System.out.println(Shapes.role("r"));
		
		System.out.println(Shapes.west());
	}
}

class Shapes
{
	public String pyramid(int row)
	{
		String tmp="";int limit=1;
		for(int mine=1;mine<=row;mine++)
		{
			for(int space=row-1;space>=mine;space--)
			{
				tmp+=" ";
			}
			for(int data=1;data<=limit;data++)
			{
				tmp+="$";
			}
			tmp+="\n";
			limit+=2;
		}
		return tmp;
	}
	
	public static double role(String skill)
	{
		skill=skill.toLowerCase();
		if(skill.equals("java")||skill.equals("java script"))
		{
			return 5.9;
		}
		else if(skill.equals("python")||skill.equals("r"))
		{
			return 4.2;
		}
		return 0.0;
	}
	
	public static int west()
	{
		String word="FAT2FIT2FAT";
		String users="2";
		
		if(word.contains(users))
		{
			return word.indexOf(users);
		}
		
		return -1;
	}
}