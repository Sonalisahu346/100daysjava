package Prgs8;
import java.util.*;
public class word_char_count {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int word=0;
	System.out.println("Enter string:");
	String str=sc.nextLine();
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		String s=" ";
		while(i<ch.length && ch[i] != ' ')
			
		{
			s=s+ch[i];
			i++;
		}
		word=word+1;
		if(s.length() > 0)
			System.out.println(s +"=" + s.length());
	}
}
}
