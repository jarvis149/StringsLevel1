package internit;
import java.util.Scanner;
public class Stringl19 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s,s1="";int i;
        System.out.println("Enter a String:");
        s=obj.nextLine();
        for(i=s.length()-1;i>=0;i--)
        {
            char x=s.charAt(i);
            s1=s1+x;
        }
        if(s.compareTo(s1)==0)
        {
            System.out.println("The string is palindrome");
        }
        else
        {
            System.out.println("The string is not palindrome");
        }
    }
}
