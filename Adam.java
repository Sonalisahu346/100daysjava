package Prgs5;
import java.util.*;
public class Adam {
	static int square(int num)
	{
		return(num*num);
	}
	static int rev(int num)
	{
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	int a=square(num);
	int b=square(rev(num));
	if(a==rev(b))
		System.out.println("Adam Number");
	else
		System.out.println("Not Adam Number");
}
}
