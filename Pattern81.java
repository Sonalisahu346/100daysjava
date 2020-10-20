package Patterns2;

public class Pattern81 {
	public static void main(String[] args) {
	int n = 5;
	int x = n; 
	int y = n; 
	
	for(int i = 5; i >=  1; i--) 
	{
		for(int j= 1; j<= (n*2)-1; j++)
		{
			if(j==x || j==y)
				System.out.print(i);  
			else
				System.out.print(" ");
		}
		System.out.println();
		x = x-1; 
		y = y+1;
	}
	}
}
