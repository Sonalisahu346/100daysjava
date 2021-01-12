package DS_Arrays;
import java.util.*;
public class Rearrange_Array1 {
	public static void Re_Array(int arr[],int n)
	{
		int[] temparr=new int[n];
		int evenpos=n/2;
		int oddpos=n-evenpos;
		
		for(int i=0;i<n;i++)
			temparr[i]=arr[i];
		Arrays.sort(temparr);
		
		int j=oddpos-1;
		for(int i=0;i<n;i+=2)
		{
			arr[i]=temparr[j];
			j--;
			
		}
		j=oddpos;
		for(int i=0;i<7;i+=2)
		{
			arr[i]=temparr[j];
			j++;
			
		}
		System.out.println("Rearranged array:");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]+" ");
		
		}

	public static void main(String[] args) {
		int[] arr=new int[7];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 7 values:");
		for(int i=0;i<7;i++)
			arr[i]=sc.nextInt();
		Re_Array(arr,7);

	}

}
