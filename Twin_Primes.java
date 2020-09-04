package pack2;
import java.util.*;
public class Twin_Primes {
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
public static void main(String args[])
{
	int n1,n2;
	Scanner s=new Scanner(System.in);
	System.out.println("enter number1:");
	n1=s.nextInt();
	System.out.println("enter number2:");
	n2=s.nextInt();
	if(isPrime(n1)==true && isPrime(n2)==true && (n2-n1)==2)
		System.out.println("Twin prime number");
	else
		System.out.println("Not Twin prime number");
		
}
}

