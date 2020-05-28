
package internit;
import java.util.Scanner;
public class Stringl13 {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        int count=0,i;
        System.out.println("Enter a String:");
        String s=ob.nextLine();
        for(i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            int a=x;
            if(a>=65 && a<=90)
            {
                count++;
            }
    }
        System.out.println("The Number of cap letters in the string is: "+count);
    
}
}
