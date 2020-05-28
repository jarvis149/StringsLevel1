
package internit;
import java.util.Scanner;
public class Stringl14 {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        int count=0,i;
        System.out.println("Enter a String:");
        String s=ob.nextLine();
        for(i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
            {
                count++;
            }
    }
        System.out.println("The Number of vowels in the string is: "+count);
    
}
}
