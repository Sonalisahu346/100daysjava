package Patterns;

public class Patteren45 {
	public static void main(String[] args) {
		int n =5;
		int x=1;
		int m=1;
		
	for(int i=1; i<=n; i++) 
	{
		for(int j =n-1; j>= i; j--) 	
				System.out.print(" "); 
					
		for(int k=1; k <= x; k++ ) 
			System.out.print((char)(Math.abs(k-m)+65)); 
				
		System.out.println();
		x= x+2; 		
	}
	}
}
