package Strings_prgs;
import java.util.*;
public class Anagrams {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two string:");
	String str1=sc.next();
	String str2=sc.next();
	String s1=str1.replaceAll("\\s","");
	String s2=str2.replaceAll("\\s","");
	boolean status=true;
	if(s1.length() != s2.length())
	{
		status=false;
	}
	else
	{
		char[] Arrays1=s1.toLowerCase().toCharArray();
		char[] Arrays2=s2.toLowerCase().toCharArray();
		Arrays.sort(Arrays1);
		Arrays.sort(Arrays2);
		status=Arrays.equals(Arrays1,Arrays2);
	}
	if(status)
		System.out.println(s1 + "and" + s2 + "are anagrams");
	else
System.out.println(s1 +" and "+ s2 + " are not anagrams");
}
}