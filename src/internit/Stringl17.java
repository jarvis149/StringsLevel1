package internit;
import java.util.Scanner;
public class Stringl17 {
     public static void main(String[] args){
         Scanner obj=new Scanner(System.in);
         String s,s2;int i;
         System.out.println("Enter the day name:");
          s=obj.nextLine();
         String a[]={"Mo","Tu","We","Th","Fr","Sa","Su"};
         s2=s.substring(0, 2);
         for(i=0;i<a.length;i++)
         {
             if(s2.compareToIgnoreCase(a[i])==0)
             {
                 System.out.println("The day number is: "+(i+1));
                 break;
             }
         }
     }
}
