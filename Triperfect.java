package Prgs6;
import java.util.*;
public class Triperfect {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int sum=1+n;
		int i=2;
		while(i*i<=n)
		{
			if(n%i==0)
			{
				if(n/i==i)
					sum=sum+i;
				else
					sum=sum+i+n/i;
			}
			i=i+1;
		}
		if(sum==3*n)
			System.out.println(n+"is Triperfect number");
		else
			System.out.println(n+"is Not Triperfect number");

	}

}
