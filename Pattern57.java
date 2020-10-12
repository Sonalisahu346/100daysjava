package Patterns;

public class Pattern57 {
	public static void main(String[] args) {
		int n = 3;
					
		for(int i=n; i >= -n; i--) 
			{
				for(int j= Math.abs(i); j <= n ; j++)
				System.out.print((char)(j+65)+" ");  
						
				System.out.println();					
			}
	}
}
