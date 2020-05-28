package internit;
import java.util.Scanner;
public class Stringl111 {
     public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        String s,s1="";
         System.out.println("Enter a String:");
         s=ob.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
            {
                s1=s.substring(i)+s.substring(0, i)+"ay";
                break;
            }
        }
         System.out.println("The generated piglatin format is: "+s1);
    }
}
