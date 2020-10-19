package Patterns2;

public class Pattern78 {
	public static void main(String[] args) {
		int n = 4, j, x= 1;
		
		for(int i = n; i>= -n; i--)
			
		{
			for( j= 1; j <= Math.abs(i); j++) 
				System.out.print(" "); 
			
			x= (i>0) ?1:j;
			
	
			
			for(int k=n; k >= Math.abs(i); k--) 
			{
				System.out.print((char)(x+64)+" "); 
			     x = x+1 ; 
			}
			System.out.println();		     							
		}
	}
}
