/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
 	 System.out.print("Enter your a: ");
      int a = obj.nextInt();
     System.out.print("Enter your b: ");
      int b = obj.nextInt();
     
     int sum=a+b;
     int difference=a-b;
     int product=a*b;
     int quotient=a/b;
     
     System.out.println("sum="+sum);
     System.out.println("diff="+difference);

     System.out.println("product="+product);
     System.out.println("quotient="+quotient);


	}
}