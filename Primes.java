package pack2;
import java.util.*;
public class Primes {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 2 numbers");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	String p="";
	for(int i=n1+1;i<2;i++)
	{
		int c=0;
		for(int n=i;n>=1;n--)
		{
			if(i%n==0)
			{
				c=c+1;
			}
		}
		if(c==2)
			p=p+i+" ";
	}
	System.out.println(p);
}
}
