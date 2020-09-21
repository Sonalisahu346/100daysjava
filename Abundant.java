package Prgs6;
import java.util.*;
public class Abundant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		if(display(n)>n)
			System.out.println("Abundant number");
		else
			System.out.println("Not Abundant number");
	}
	static int display(int n)
	{
		int sum=0;
		for(int i=1;i<=(Math.sqrt(n));i++)
				{
			if(n%1==0)
			{
				sum=sum+i+(n/i);
			}
				}
		sum=sum-12;
		return sum;
	}

}
