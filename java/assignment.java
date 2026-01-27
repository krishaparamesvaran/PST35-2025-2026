/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int num1=14;
		int num2=20;
		//System.out.println("2 values equal:"+ (num1=num2));
		System.out.println("add 2 values :"+ (num1+=num2));
		System.out.println(" mul 2 values :"+ (num1*=num2));
		System.out.println("sub 2 values:"+ (num1-=num2));
		System.out.println("div 2 values :"+ (num1/=num2));
		System.out.println(" mod 2 values :"+ (num1%=num2));
		
	}
}	
