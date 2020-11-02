package Prgs8;
import java.util.*;
public class Palindrome_string {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String:");
	String str=sc.next();
	String rev="";
	int len=str.length();
	for(int i=len-1; i>=0; i--)
		rev=rev+str.charAt(i);
	if(str.equals(rev))
	System.out.println("Palindrome");
	else
		System.out.println("Not Palindrome");
	
}
}
