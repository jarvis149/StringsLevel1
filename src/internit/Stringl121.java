package internit;
import java.util.Scanner;
public class Stringl121 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s,s1[],s2,s3="";int i,j;
        System.out.println("Enter a string");
        s=obj.nextLine();
        s1=s.split(" ");
        System.out.println("The palindrome words are:");
        for(i=0;i<s1.length;i++)
        {
            s2=s1[i];
            if(s2.length()>1)
            {
                for(j=s2.length()-1;j>=0;j--)
                             {
                               char x=s2.charAt(j);
                               s3=s3+x;
                               }
                       if(s2.compareTo(s3)==0)
                         {
                           System.out.println(s2);
                          }
                       s3="";
                               }
            }
        }
    }

