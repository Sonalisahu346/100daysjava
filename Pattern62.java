package Patterns;

public class Pattern62 {
	public static void main(String[] args) {
		int n = 3;
		for(int i = n; i >= -n; i--) // i= 3,2,1,0,-1,-2,-3
		{
			for(int j=1; j<=Math.abs(i); j++)// j = 1<=0
			 System.out.print(" "); // 3,2,1,0,1,2,3 spaces
			
			for(int k=n; k>=Math.abs(i) ;k--)// k= 0<= 3
				System.out.print((char)(k+65)); // 1,2,3,4,3,2,1 star
				
				System.out.println();
		}
}
}
