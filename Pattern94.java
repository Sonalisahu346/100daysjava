package Patterns2;

public class Pattern94 {
	public static void main(String[] args) {
		int n = 5;
		int x = n;
		int y = n;
		
		for(int i=1; i<= n; i++) 
		{
			for(int j=1; j < n*2; j++) 
			{
				if(j > x && j <y)
					System.out.print(" ");
				else
					System.out.print("*"); 
			}
			System.out.println();
			x= x-1; 
			y= y+1; 
		}
	}
}
