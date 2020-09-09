package Prgs6;
import java.util.*;
public class Neon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int sq=n*n;
		int sum=0;
		while(sq>0)
		{
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if(sum==n)
			System.out.println("Neon Number");
		else
			System.out.println("Not Neon Number");

	}

}
