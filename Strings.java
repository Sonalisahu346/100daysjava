package Prgs8;
import java.util.*;
public class Strings {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 strings:");
	String a=sc.next();
	String b=sc.next();
	System.out.println("Before swapping");
	a=a+b;
	b=a.substring(0,a.length() - b.length());
	a=a.substring(b.length());
	System.out.println("After swapping a="+a+"and b ="+b);
}
}
