package internit;
import java.util.Scanner;
public class Stringl110 {
     public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
         System.out.println("Enter a string");
        String s1=ob.nextLine();
        System.out.println("The substring of the above string is: "+ s1.substring(3));
    }
}
