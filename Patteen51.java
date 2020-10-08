package Patterns;

public class Patteen51 {
	public static void main(String[] args) {
		int n =4;
		int stars=n*2-1;
		int space=n-1;
		
		for(int i=n; i<=1; i--) 
		{
		 for(int j =space; j>= i; j--) 	
			System.out.print(" ");
									
		 for(int k=1; k <= stars; k++)  
			System.out.print((char)(i+64)); 			
		System.out.println();	
		stars=stars-2;
		}
}
}
