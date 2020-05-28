package internit;
import java.util.Scanner;
public class Stringl117 {
    
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=ob.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            int j=x;
            if(x!=' ')
            {
                if((j>=65 && j<=90) && i%2==0)
                {
                    j=j+32;
                    System.out.print((char)j);
                }
                else if((j>=97 && j<=122)&& i%2==0)
                {
                    System.out.print(x);
                }
               else if((j>=65 && j<=90) && i%2!=0)
                {
                    System.out.print(x);
                }
                else if((j>=97 && j<=122)&& i%2!=0)
                {
                    j=j-32;
                    System.out.print((char)j);
                }
            }
            else
            {System.out.print(" ");
        }
    }
}
}
