package fullstack.java.sekar.DhanaSekarJava;

// Bracket Unary Div Mul Add Sub

/*
 * 4096 2048 1024 512 256 128 64 32 16 8 4 2 1
 *    1    0    0   0   0   0  0  1  0 1 1 0 0 >> 4140
 *    0    0    0   1   0   0  0  0  0 0 1 0 1 >> 517
 */

public class Precedence 
{
	public static void main(String[] args) 
	{
		int delta=89,cosmo=312;
		System.out.println((delta<<=2)+(cosmo--)*(cosmo^=30));
		// 356+312*297
		
		int jane=128, cane=230;
		System.out.println((cane*=18)*(jane/=4)/(cane>>=3)+(jane-=4)/(jane/=2));
		
	}
}
