package prgs3;
import java.util.*;
public class Sum_Digits {
	public static void main(String[] args) 
	{
	  Scanner obj = new Scanner(System.in);
	  System.out.println("enter number :");
	  int n = obj.nextInt();  // n= 1234
	  int sum = 0;
	  while( n!=0)  // 0 != 0  -> f
	  {
		  int rem = n%10;  // rem = 1%10 - >  .1
		  sum = sum + rem;  // sum =9+1 -> 10
		  n = n/10 ;  // n = 1/10 -> 0
	  }
		System.out.println("sum of digits = "+sum)	;  
	} }
