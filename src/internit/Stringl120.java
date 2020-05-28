package internit;
import java.util.Scanner;
public class Stringl120 {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=ob.nextLine();
        String string[]=s.split(" ");
        int i,len;
        System.out.println("The words whose length is greater than 5 are:");
        for(i=0;i<string.length;i++){
            String s1=string[i];
            len=s1.length();
            if(len>5){
                System.out.println(s1);
            }
        }
}
}
