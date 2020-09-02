package Formulas;
import java.util.*;
public class Sphere {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius:");
	int r=sc.nextInt();
	double v=(4.0/3.0)*3.14*(r*r*r);
	System.out.println("Volume of sphere="+v);
}
}
