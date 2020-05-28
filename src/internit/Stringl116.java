package internit;
import java.util.Scanner;
public class Stringl116 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s[];
        s = new String[5];
        System.out.println("Enter 5 Words:");
        for(int i=0;i<5;i++){
            s[i]=obj.nextLine();
        }
        for(int i=0;i<5;i++)
        {
            char x=s[i].charAt(0);
            if(x=='A'||x=='E'||x=='I'||x == 'O'||x == 'U'||x=='a'||x == 'e'||x == 'i'||x == 'o'||x == 'u')
            {
                System.out.println("The word is: "+s[i]);
            }
        }
    }
}
