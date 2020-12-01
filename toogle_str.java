package Strings_prgs;
import java.util.*;
public class toogle_str {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string:");
	String str=sc.nextLine();
	String words[]=str.split("\\s");
	String toggle = "";
	for(String w: words)
	{
		String first = w.substring(0,1);
		String afterfirst = w.substring(1);
		toggle=toggle+first.toLowerCase()+afterfirst.toUpperCase()+" ";
		
	}
	System.out.println(toggle);
}
}
