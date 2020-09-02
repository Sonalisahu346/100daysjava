package Formulas;
import java.util.*;
public class Pentagon {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter side values:");
	int s=sc.nextInt();
	System.out.println("Enter apothem length:");
	int a=sc.nextInt();
	float area=(float)(s/2)*s*a;
	System.out.println("Area of pentagon="+area);
}

}
