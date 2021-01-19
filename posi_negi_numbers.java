package DS_Arrays;
import java.util.*;
public class posi_negi_numbers {
	static void rearrange(int arr[],int n)
	{
		int temp=0;
		int i=-1;
		
		for(int j=0;j<n;j++)
		{
			if(arr[j] < 0)
			{
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		for(int k=0;k<n;k++)
		System.out.print(arr[k]+" ");
		System.out.println();
		int neg=0;
		int pos=i+1;
		
		while(pos < n && neg < pos && arr[neg] < 0)
		{
			temp=arr[neg];
			arr[neg]=arr[pos];
			arr[pos]=temp;
			pos++;
			neg=neg+2;
		}
	}
	static void print(int arr[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
public static void main(String args[])
{
	int arr[]=new int[9];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 9 values:");
	for(int i=0;i<9;i++)
		arr[i]=sc.nextInt();
	rearrange(arr,9);
	System.out.println("Rearranged data:");
	print(arr,9);
}
}
