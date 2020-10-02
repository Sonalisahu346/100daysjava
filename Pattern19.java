package prgs7;

public class Pattern19 {
public static void main(String args[])
{
	for(int i='E'; i>='A';i--) // 5 rows
	{
		for(int j= 'A';j<=i; j++) // 5,4 cols
		{
			System.out.print((char)j+" "); // A A A A A 
		}
		System.out.println(); //nextline
	}
} }


