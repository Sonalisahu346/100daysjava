package Patterns2;

public class Pattern70 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = n ; i >= 1; i--) 
		{
			for(int j = n-1;  j >= i; j--) 
				System.out.print(" "); 
			for(int k = i; k >= 1; k--) 
				System.out.print((char)(i+64)+" "); 
			
			System.out.println();			
		}
	}
}
