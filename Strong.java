package Prgs5;
import java.util.*;
public class Strong {
public static void maian(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	int fact,rem,sum=0,temp;
	temp=n;
	while(n!=0)
	{
		fact=1;
		int i=1;
		rem=n%10;
		while(i<=rem)
		{
			fact=fact*i;
			i++;
		}
		sum=sum+fact;
		n=n/10;
	}
	if(sum==temp)
		System.out.println(temp+"is strong number");
	else
		System.out.println(temp+"is not strong number");
}
}
