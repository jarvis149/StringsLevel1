package internit;
import java.util.Scanner;
public class Stringl113 {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        String s,s2;
        System.out.println("Enter a String:");
        s=ob.nextLine();
        System.out.println("Enter the Second String:");
        s2=ob.nextLine();
        if(s.compareToIgnoreCase(s2)>0)
        {
            System.out.println("The String 1: "+s+"\t"+"comes before the string: "+s2);
        }
        else if(s.compareToIgnoreCase(s2)<0)
        {
            System.out.println("The String 2: "+s2+"\t"+"comes before the string: "+s);
        }
        if(s.compareToIgnoreCase(s2)==0)
        {
            System.out.println("Both the Words are Equal");
        }
        
    }
}
