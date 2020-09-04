package Prgs5;
import java.util.*;
public class Spy_Number {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number:");
	int n=sc.nextInt();
	int num=n;
	int sum=0,mul=1;
	while(num>0)
	{
		int r=num%10;
		sum=sum+r;
		mul=mul*r;
		num=num/10;
	}
	if(mul==sum)
		System.out.println(n+"is spy number");
	else
		System.out.println(n+"is not spy number");
}
}
