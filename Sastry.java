package prgs7;
import java.util.*;
public class Sastry {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int n=sc.nextInt();String str=Integer.toString(n)+Integer.toString(n+1);
	int num=Integer.valueOf(str);
	double sr=Math.sqrt(num);
	if((sr-Math.floor(sr))==0)
		System.out.println("Sastry Number");
	else
		System.out.println("Not Sastry Number");
}
}
