package Prgs6;
import java.util.*;
public class Digital_Root {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int root=0;
		while(n>0 || root>9)
		{
			if(n==0)
			{
				n=root;
				root=0;
			}
			int rem=n%10;
			root=root+rem;
			n=n/10;
		}
		System.out.println(root);

	}

}
