package Prgs6;
import java.util.*;
public class Smith {
	static int sumdigits(int n)
	{
		int s=0;
		while(n>0)
		{
			int rem=n%10;
			s=s+rem;
			n=n/10;
		}
		return s;
	}
	static int sumprimefactors(int n)
	{
		int i=2,sum=0;
		while(n>1)
		{
			if(n%i==0)
			{
				if(n%i==0)
				{
					sum=sum+sumdigits(i);
					n=n/i;
				}
				else
					i++;
			}
			return sum;
		}
		static boolean Composite(int n)
		{
			int c=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					c++;
				}
			}
			if(c>2)
				return true;
			else
				return false;
		}
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number");
			int n=sc.nextInt();
			if(Composite(n)==false)
				System.out.println("Enter Composite number");
			else
			{
				int a=sumdigits(n);
				int b=sumprimefactors(n);
				System.out.println("sum of digits="+a);
				System.out.println("sum of prime factors="+b);
				if(a==b)
					System.out.println(n+"is a smith number");
				else
					System.out.println(n+"is not smith number");
			}
		}
	}