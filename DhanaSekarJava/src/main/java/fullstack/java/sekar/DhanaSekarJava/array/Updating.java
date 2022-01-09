package fullstack.java.sekar.DhanaSekarJava.array;

public class Updating 
{
	public static void traverse(float[] tmp)
	{
		for(float t:tmp)
		{
			System.out.print(t+" ");
		}
		System.out.println();
	}
	
	public static void updateOne(float[] got,int pos,float dest)
	{
		if(pos<got.length)
		{
			got[pos]=dest;
			System.out.println(got[pos]+" has updated @ "+pos);
		}
		else
		{
			System.out.println(dest+" can't update @ "+pos);
		}
	}
	
	public static void updateMulti(float[] cos, int percentage)
	{
		for(int index=0;index<cos.length;index++)
		{
			cos[index]-=(cos[index]*percentage)/100;
			System.out.println(index+" value has updated");
		}
	}
	
	public static void main(String[] args) 
	{
		float[] weight= {45.9F,98.3F,67.1F,88.4F,65.1F,74.9F,56.9F,120.5F,35.8F};
		Updating.traverse(weight);
		Updating.updateMulti(weight,5);
		Updating.traverse(weight);
		
		Updating.updateOne(weight, 4, 0.0F);
		Updating.traverse(weight);
	}
}
