package pack2;
import java.util.*;
public class Circular_Prime {
static boolean isPrime(int n)
{
	boolean f=true;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			f=false;
			break;
		}
	}
	return f;
}
static boolean Circular(int n)
{
	int c=0,t=n;
	while(t>0)
	{
		c++;
		t=t/10;
	}
	int num=n;
	while(isPrime(num))
	{
		int rem=num%10;
		int div=num/10;
		num=(int)((Math.pow(10, c-1))*rem)+div;
		if(num==n)
			return true;
	}
	return false;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int n=sc.nextInt();
	if(Circular(n))
		System.out.println("Circular number="+n);
	else
		System.out.println("Not Circular number"+n);
}
}

