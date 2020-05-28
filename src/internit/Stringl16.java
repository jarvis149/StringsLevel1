package internit;
import java.util.Scanner;
public class Stringl16 {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=ob.nextLine();
        System.out.println("Enter the second String:");
        String s2=ob.nextLine();
        int x=s.compareToIgnoreCase(s2);
        if(x==0)
        {
            System.out.println("The two strings are equal");
        }
        else if(x>0)
        {
            System.out.println("The first string is greater  than the second one");
        }
         else if(x<0)
        {
            System.out.println("The second string is greater  than the first one");
        }
    
}
    
}
