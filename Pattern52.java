package Patterns;

public class Pattern52 {
	public static void main(String[] args) {
		
		int n=4;
		int chars = n*2-1; 
		int space= n-1; 
				
		for(int i = n; i >= 1; i--)  
		{
			for(int j = space; j >= i; j--)
				System.out.print(" ");  
					
			for(int k= 1; k<= chars; k++) 
				System.out.print((char)(k+64)); 
						
			System.out.println();
		chars = chars-2;  		
		}
	}
}
