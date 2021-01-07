package DS_Arrays;
import java.util.*;
public class Arangement {
	static void rearrange(int arr[],int n)
	{
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(arr[j]==i)
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					break;
				}
			}
		}
		for(int i1=0;i<n;i++)
		{
			if (arr[i]!=i)
				arr[i]=-1;
		}
		System.out.println("rearranged data:");
		for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	System.out.println("enter 10 numbers:");
	for(int i=0;i<10;i++)
		arr[i]=sc.nextInt();
	int n=10;
	rearrange(arr,n);
}
}
