package fullstack.java.sekar.DhanaSekarJava;

import java.util.Scanner;

/*
 * Short hand: += -= *= /= %=
 * alpha=alpha+10
 * alpha+=10
 * Operation left var and assigning var should be same
 * Cosmo=100-Cosmo;
 */

public class OperShort 
{
	public static void main(String[] args) 
	{
		Scanner yet=new Scanner(System.in);
		System.out.println("Swap in short");
		
		char moscow=yet.next().charAt(0);
		char los=yet.next().charAt(0);
		
		System.out.println("Moscow "+moscow+" LA "+los);
		
		moscow+=los;// moscow=moscow+los
		los=(char)(moscow-los);
		moscow-=los;
		
		System.out.println("Moscow "+moscow+" LA "+los);
		
		yet.close();
	}
}
