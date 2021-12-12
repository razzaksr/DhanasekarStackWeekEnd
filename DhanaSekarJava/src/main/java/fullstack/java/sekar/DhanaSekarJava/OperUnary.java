package fullstack.java.sekar.DhanaSekarJava;

// Unary Operator: pre: SYM data,post: data SYM 
// ++ increment 
// -- decrement

public class OperUnary 
{
	public static void main(String[] args) 
	{
		double wet=18.9;
		char hash='D';//68
		
		System.out.println(wet+" "+hash);
		
		System.out.println(wet++ +" "+ --hash);
		
		System.out.println(wet+" "+hash);
		
		System.out.println(--wet +" "+ hash++);
		
		System.out.println(wet+" "+hash);
	}
}
