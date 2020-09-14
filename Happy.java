package Prgs6;
import java.util.*;
public class Happy {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number:");
	int num=sc.nextInt();
	int result=num;
	while(result!=1 && result!=4)
	{
		result=print(result);
	}
	if(result==1)
		System.out.println(num+"is a Happy number");
	else
		System.out.println(num+"is not happy number");
}
static int print(int num)
{
	int sum=0;
	while(num>0)
	{
		int rem=num%10;
		sum=sum+(rem*rem);
		num=num/10;
	}
	return sum;
}
}
