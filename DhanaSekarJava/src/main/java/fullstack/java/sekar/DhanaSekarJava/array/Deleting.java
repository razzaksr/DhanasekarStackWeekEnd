package fullstack.java.sekar.DhanaSekarJava.array;

public class Deleting 
{
	public static void deleteOne(int[] aap,int pos)
	{
		if(pos<aap.length)
		{
			aap[pos]=0;
			System.out.println("value @ "+pos+" has reset/invalidated/deleted");
		}
		else
		{
			System.out.println(pos+" is invalid");
		}
	}
	
	public static void deleteMany(int[] baab,int max)
	{
		for(int index=0;index<baab.length;index++)
		{
			if(baab[index]>=max)
			{
				System.out.println(baab[index]+" getting invalidated");
				baab[index]=0;
			}
		}
	}
	
	public static void traverse(int[] queen)
	{
		for(int w:queen)
		{
			System.out.print(w+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		int[] poineer= {980,3545,13,890,134,765,89,87,65,345,67,654,56,7,654};// 0
		//Integer[] poineer= {980,3545,13,890,134,765,89,87,65,345,67,654,56,7,654};// null
		Deleting.traverse(poineer);
		Deleting.deleteOne(poineer, 10);
		Deleting.traverse(poineer);
		Deleting.deleteMany(poineer, 200);
		Deleting.traverse(poineer);
	}
}
