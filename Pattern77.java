package Patterns2;

public class Pattern77 {
	public static void main(String[] args) {
		int n = 4;
		int x= 1;
		for(int i = n; i>= -n; i--)
			
		{
			for(int j= 1; j <= Math.abs(i); j++) 
				System.out.print(" ");
			
			for(int k=n; k >= Math.abs(i); k--) 		
				System.out.print((char)(x+64)+" "); 
			
			System.out.println();
			     
			if(i>0)
			x = x+1;   
			else
				x=x-1; 
				
		}
		
	}}
