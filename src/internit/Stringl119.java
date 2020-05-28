package internit;
import java.util.Scanner;
public class Stringl119 {
    
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=ob.nextLine();
        String string[]=s.split(" ");
        int i,j;
        for( i=0;i<string.length;i++){
            String str=string[i];
            char x=str.charAt(0);
            int n=x;
            if(n>=65 && n<=90){
            System.out.print(str+" ");
            }
            else
            {
                n=n-32;
                System.out.print((char)n+str.substring(1)+" ");
            }
        }
        
    }
}
