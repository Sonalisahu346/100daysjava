package prgs7;

public class Pattern27 {
	public static void main(String[] args) {	
		
		for(int i='A'; i <= 'E' ; i++)// 5 rows
		{
			for(int j= 'E'-1; j >= i ; j--)// j=68 	>= 65 	
				System.out.print(" "); // 4,3,2,1,0 - > spaces
			
			for(int k='A'; k <= i; k++) // A <= A -> 1 repeating
				System.out.print((char)i); // A
			
			System.out.println();			
		}
}
}