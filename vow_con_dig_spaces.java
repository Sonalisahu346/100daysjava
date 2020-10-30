package Prgs8;
import java.util.*;
public class vow_con_dig_spaces {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string:");
	String str=sc.nextLine();
	int vowels=0,cons=0,digits=0,spaces=0;
	str=str.toLowerCase();
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'o')
			vowels=vowels+1;
		else if(ch >='a' && ch <='z')
			cons=cons+1;
		else if(ch >= '0' && ch <= '9')
			digits = digits+1;
		else if(ch == ' ')
			spaces = spaces+1;
	}
	System.out.println("Vowels="+ vowels);
	System.out.println("Consonants="+ cons);
	System.out.println("Digits="+ digits);
	System.out.println("Spaces="+ spaces);
	
}
}
