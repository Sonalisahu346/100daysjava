package prgs7;
import java.util.*;
public class Duffinian {
	static int sum_div(int n)
	{
		int div=0;
		for(int i=1;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				div=div+i+(n/i);
			}
		}
		return div;
	}
	static int gcd(int a,int b)
	{
		int gcd=1;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
				gcd=i;
		}
		return gcd;
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr number:");
	int a=sc.nextInt();
	int b=sum_div(a);
	System.out.println("sum of divisors:"+b);
	int gcd=gcd(a,b);
	System.out.println("gcd="+gcd);
	if(gcd==1)
		System.out.println("Duffinian number");
	else
		System.out.println("Not Duffinian number");
}
}
