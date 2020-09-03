package pack2;
import java.util.*;
public class Semi_Prime {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int num=sc.nextInt();
	int x=num;
	int c=0;
	for(int i=2;c<2 && i*i<=num;i++)
	{
		while(num%i==0)
		{
			num=num/i;
			++c;
		}
	}
	if(num>1)
	{
		++c;
	}
	if(c==2)
	System.out.println("Semiprime number"+x);
	else
		System.out.println("not a semiprime number"+x);
}
}
