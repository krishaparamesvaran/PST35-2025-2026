import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
 	 System.out.print("Enter your number: ");
 	 int a = obj.nextInt();
 	 
 	 if(a>0)
 	    {
 	        System.out.println("This number is postive");
 	    }
 	    if (a==0)
 	    {
 	        System.out.println("This number is zero");
 	    }
 	    
 	    
      else
      {
        System.out.println("This number is negative "); 
      }
      
      
	}  
      

	
}
