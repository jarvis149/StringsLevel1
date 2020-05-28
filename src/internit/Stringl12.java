
package internit;
import java.util.Scanner;
public class Stringl12 {
    public static void main(String[] args)
    {
        
    
    Scanner obj=new Scanner(System.in);
    System.out.println ("Enter your first Name:");
    String fi= obj.nextLine();
    System.out.println ("Enter your Last Name:");
    String la= obj.nextLine();
    System.out.println("The User Name is: "+fi+" "+la);
     System.out.println("The short name of the user is: "+fi.charAt(0)+"."+la.charAt(0));
    
    }
}
