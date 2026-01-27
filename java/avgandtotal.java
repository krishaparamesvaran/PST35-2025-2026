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
 	 System.out.print("Enter your mark 1: ");
      int a = obj.nextInt();
      System.out.print("Enter your mark 2: ");
      int b = obj.nextInt();
      System.out.print("Enter your mark 3: ");
      int c = obj.nextInt();
      
      
      System.out.println("average:"+((a+b+c)/3));
      System.out.println("Total marks:"+(a+b+c));
      

	}
}