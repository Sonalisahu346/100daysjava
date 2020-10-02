package prgs7;

public class Pattern18
{
	public static void main(String args[])
	{
	
	for(int i='A'; i<='E';i++) 
	{
		for(int j= 'E';j>=i; j--) 
		{
			System.out.print((char)i+" "); 
		}
		System.out.println(); 
	}
} 
}
