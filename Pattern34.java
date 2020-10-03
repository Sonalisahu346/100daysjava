package prgs7;

public class Pattern34 {
		public static void main(String[] args) {
			int stars = 1;
			int n = 5;  // rows
			int space = n-1; // space = 4
			
			for(int i=1; i<=n;i++) // 5 rows
			{
				for(int j=space; j>=i;j--)// 4>=1			
					System.out.print(" ");
				
				for(int k =1;k<=stars;k++) // 1<=3
					System.out.print("*"); // *
				
				System.out.println();
					stars=stars+2;//  3,5,7,9,11
			}	
		}
}
