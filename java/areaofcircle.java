/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
 	 System.out.print("Enter your radius: ");
      Float r = obj.nextFloat();
    
     
     Float circle=3.14f*r*r;
     
     
     System.out.println("area of the circle="+circle);
     

	}
}