package Formulas;
import java.util.*;
public class Octagon {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length of the side:");
	float s=sc.nextFloat();
	float a=(float)(2*(1+Math.sqrt(2))*s*s);
	System.out.println("Area of octagon="+a);
}
}
