package Formulas;
import java.util.*;
public class Ohms_Law {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String ch;
	float voltage,current,resistence,result;
	System.out.println("Ohms law");
	System.out.println("---------");
	System.out.println("1.calculate voltage");
	System.out.println("2.calculate current");
	System.out.println("3.calculate resistence");
	System.out.println("enetr choice[1,2,3]:");
	ch=sc.next();
	switch(ch)
	{
	case "1":
		System.out.println("enter current value:");
		current=sc.nextFloat();
		System.out.println("enter resistenec value:");
		resistence=sc.nextFloat();
		result=current*resistence;
		System.out.println("voltage="+result);
		break;
	case "2":
		System.out.println("enter voltage:");
		voltage=sc.nextFloat();
		System.out.println("enter resistence");
		resistence=sc.nextFloat();
		result=voltage/resistence;
		System.out.println("current="+result);
		break;
	case "3":
		System.out.println("enter current:");
		current=sc.nextFloat();
		System.out.println("enter voltage:");
		voltage=sc.nextFloat();
		result=voltage/current;
		System.out.println("resistence="+result);
		break;
	}
}
}
