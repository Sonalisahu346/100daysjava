package Patterns2;

public class Pattern74 {
public static void main(String args[])
{
int n = 3;
	
	for(int i = n; i >= -n; i--) // i = 3,2,1,0,-1,-2,-3 -> 7rows
	{
		for(int j=1; j <= Math.abs(i); j++) // j=1 <= 2
		  System.out.print(" "); // 3,2,1,0,1,2,3 spaces
		
		for(int k= n; k >= Math.abs(i); k--) // 3 >= 2
			 System.out.print("* "); // 1,2,3,4,3,2,1
		
		System.out.println();		
	}
}
}
