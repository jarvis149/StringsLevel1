package internit;
import java.util.Scanner;
public class Stringl115 {
    public static void main(String[] args){
      Scanner obj=new Scanner(System.in);
        System.out.println("Write a word with space on both the sides:");
        String s=obj.nextLine();
        s=s.trim();
        System.out.println("The String after changes is: "+s);
    }
}
