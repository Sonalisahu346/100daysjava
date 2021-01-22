package DS_Arrays;
import java.util.*;
public class File1 {
	static void Traverse(int arr[],int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
			if(arr[i]!=0)
				arr[count++]=arr[i];
		
		while(count<n)
			arr[count++]=0;
	}
	public static void main(String args[])
	{
		int arr[]=new int[12];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 12 values:");
		for(int i=0;i<12;i++)
		
			arr[i]=sc.nextInt();
			int n=12;
			Traverse(arr,n);
			System.out.println("Traverse data:");
			for(int i=0;i<n;i++)
				System.out.print(arr[i]+" ");
	}

}
