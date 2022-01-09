package fullstack.java.sekar.DhanaSekarJava.array;

import java.util.Arrays;
import java.util.Scanner;

public class Intro 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		// creation of array
		String[] team=new String[10];// array of Strings, index starts with 0-9
		System.out.println(team.length); // size of array
		//team[0]="Dhanasekar";team[1]="Victor";team[2]="Shanmugam";
		
//		team[0]=scan.nextLine();
//		team[1]=scan.nextLine();
//		team[2]=scan.nextLine();
//		team[3]=scan.nextLine();
		
		for(int index=0;index<team.length;index++)
		{
			team[index]=scan.nextLine();
		}
		
//		for(String tmp:team)
//		{
//			tmp=scan.nextLine();
//		}
		
		System.out.println(team);
		System.out.println(Arrays.toString(team));
		
//		System.out.println(team[0]);
//		System.out.println(team[1]);
//		System.out.println(team[2]);
//		System.out.println(team[3]);
//		System.out.println(team[4]);
		
//		for(int pos=0;pos<team.length;pos++)
//		{
//			System.out.println(team[pos]);
//		}
//		
//		for(String yet:team)
//		{
//			System.out.println(yet);
//		}
		scan.close();
	}
}
