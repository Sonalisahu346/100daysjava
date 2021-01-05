package DS_Arrays;
import java.util.*;
public class Pair {
	static int pairs(int arr[],int n,int x)
	{
		int i;
		for(i=0;i<n-1;i++)
			if(arr[i] > arr[i+1])
				break;
		int r=i;
		int l=(i+1)%n;
		int cnt=0;
		while(l != r)
		{
			if(arr[l] + arr[r] == x)
			{
				cnt++;
			//to terminate the loop
			if(l == (r-1+n)%n)
				return cnt;
		
			l=(l+1)%n; //move to left
			r=(r-1+n%n); //move to right
			
		}
			//sum is less
		else if(arr[l]+arr[r] < x)
		l=(l+1)%n;
		//sum is more
		else
			r=(n+r-1)%n;
	}
	return cnt;
}
public static void main(String args[])
{
	int arr[]=new int[6];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 6 values:");
	for(int i=0;i<6;i++)
		arr[i]=sc.nextInt();
	int n=6;
	int sum=16;
	System.out.println(pairs(arr,n,sum)+"paiirs");
}
}
