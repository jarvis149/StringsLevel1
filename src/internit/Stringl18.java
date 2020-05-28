package internit;
import java.util.Scanner;
public class Stringl18 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=obj.nextLine();
        System.out.println("The converted string is:");
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x!=' ')
            {
                int a=x;
                if(a>=65 &&a<=90)
                {
                    a=a+32;
                   char y=(char) a;
                    System.out.print(y);
                }
                else if(a>=97 && a<=122)
                {
                    a=a-32;
                    char y=(char)a;
                    System.out.print(y);
                }
            }
            else
            {
                System.out.print(" ");
            }
        }
    }
}
