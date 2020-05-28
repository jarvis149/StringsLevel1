package internit;
import java.util.Scanner;
public class Stringl112 {
     public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        String s,s2="";
        String s1[]={"Mr.","Mrs.","Miss.","Kumari"};
         System.out.println("Enter your Name:");
        s=ob.nextLine();
        s=s+" ";
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x==' ')
            {
                if(s2.compareTo(s1[0])==0)
                {
                    System.out.println("The gender is Male.");
                    break;
                }
                else if(s2.compareTo(s1[1])==0)
                {
                    System.out.println("The gender is Married Female.");
                    break;
                }
                else if(s2.compareTo(s1[2])==0)
                {
                    System.out.println("The gender is Female.");
                    break;
                }
                else if(s2.compareTo(s1[3])==0)
                {
                    System.out.println("The gender is Female.");
                    break;
                }
                else if(i==s.length()-1)
                {
                    System.out.println("Cannot Determine");
                }
                s2="";
            }
            else
            {
            s2=s2+x;
            }
            
        }
        
    }
}
