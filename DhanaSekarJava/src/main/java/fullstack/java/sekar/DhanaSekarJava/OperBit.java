package fullstack.java.sekar.DhanaSekarJava;

/*
 * Bitwise: int char boolean : & | ^ >> <<
 * 
 * 50
 * 
 * 2048 1024 512 256 128 64 32 16 8 4 2 1
 *    0    0   0   0   0  1  0  0 1 1 0 0  >> 76
 *    
 *    
 *    0    0   0   0   0  1  0  1 1 0 0 1  >> 89
 *    0    0   0   1   0  1  1  0 0 1 0 0  >> 356
 *    
 *    0    0   0   0   0  0  0  1 1 1 1 0  >>  30
 *    0    0   0   1   0  0  1  1 0 1 1 1  >> 311
 *    0    0   0   1   0  0  1  0 1 0 0 1  >> 297
 *    
 *    0    1   0   0   1  1  0  0 0 0 0 0  >> 1216
 *    0    0   0   1   0  0  1  0 1 0 1 0  >> 298
 *    0    0   0   0   0  0  1  0 0 1 0 1  >> 37
 *    0    0   0   0   0  0  1  1 0 0 1 0  >> 50
 *    0    0   1   1   1  0  0  1 0 0 0 0  >> 912
 *    0    0   1   1   0  1  1  0 1 1 0 0  >> 876>>fine
 *    0    0   0   0   1  1  1  1 1 1 0 0  >> 252
 *    
 *    0    0   0   0   0  1  1  1 1 0 1 0  >> 122>> 'z'
 *    0    0   1   1   0  1  1  1 1 1 1 0  >> 
 *    
 *    0    0   0   0   0  1  0  0 0 1 0 1  >>  69>> 'E'
 *    0    0   0   0   0  1  0  0 0 0 0 0  >>  64
 * 
 */

public class OperBit 
{
	public static void main(String[] args) 
	{
		char prac='z';int fine=876;
		System.out.println(prac+" "+fine);
		
		System.out.println(prac&'E');
		
		System.out.println(fine|prac);
		
		System.out.println(Integer.toBinaryString(fine));
		
		System.out.println(fine^912);
		
		int delta=98,eclairs=120;
		
		System.out.println("Delta: "+delta+" Eclairs: "+eclairs);
		
		delta^=eclairs;
		eclairs^=delta;
		delta^=eclairs;
		
		System.out.println("Delta: "+delta+" Eclairs: "+eclairs);
		
		int donut=76, froyo=298;
		System.out.println(donut+" "+froyo);
		
		System.out.println(froyo>>3);
		
		System.out.println(donut<<4);
	}
}
