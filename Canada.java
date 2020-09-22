package prgs7;
import java.util.*;
public class Canada {
	static int sum_sq(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem*rem;
			n=n/10;
		}
		return sum;
	}
	static int sum_div(int n)
	{
		int div=0;
		for(int i=1;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				div=div+i+n/i;
		}
		return(div-1-n);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		if(sum_sq(n) == sum_div(n))
			System.out.println("canada number");
		else
			System.out.println("not canada number");

	}

}
