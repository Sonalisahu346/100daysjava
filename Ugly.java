package Prgs5;
import java.util.*;
public class Ugly {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int n=sc.nextInt();int x=0;
	while(n!=1)
	{
		if(n%5==0)
			n=n/5;
		else if(n%3==0)
			n=n/3;
		else if(n%2==0)
			n=n/2;
		else
		{
			x=1;
			break;
		}
	}
	if(x==0)
		System.out.println("ugly number");
	else
		System.out.println("Not a Ugly number");
}
}
