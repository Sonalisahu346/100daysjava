package Formulas;
import java.util.*;
public class Equ_tr {
public static void main(String args[])
{
	Scanner sc=new Scanner (System.in);
	System.out.println("enter sides of a triangle:");
	float s=sc.nextFloat();
	float a=(1.73f*s*s)/4;
	System.out.println("Area of equilateral triangle="+a);
}
}
