package DS_Arrays;
import java.util.*;
public class Binary_Search {
	static int binary_search(int arr[],int l,int h,int key)
	{
		if(l>h)
			return -1;
		int m=(l+h)/2;
		if(arr[m]==key)
			return m;
		if(arr[l]<=arr[m]){
			if(key>=arr[l] && key<=arr[m])
			{
				return binary_search(arr,l,m-1,key);
			}
		return binary_search(arr,m+1,h,key);
		}
	if(key >= arr[m] && key <= arr[h])
	{
		return binary_search(arr,m+1,h,key);
	}
	return binary_search(arr,l,m-1,key);
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 9 values:");
	int arr[]=new int[9];
	for(int i=0;i<9;i++)
	{
		arr[i]=sc.nextInt();
	}
	int n=9;
	int key=6;
	int i=binary_search(arr,0,n-1,key);
	if(i!=-1)
		System.out.println("position="+key);
	else
		System.out.println("key not found");
}
}
