
package internit;
import java.util.Scanner;
public class Stringl15 {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        int count=0,i;
        System.out.println("Enter a String:");
        String s=ob.nextLine();
        for(i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x==' '){
                count++;
            }
    }
        System.out.println("The Number of words in the string is: "+(count+1));
    
}
    
}
