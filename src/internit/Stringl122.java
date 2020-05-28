package internit;
import java.util.Scanner;
public class Stringl122 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s,s1[],s2;int i,j;
        System.out.println("Enter a String:");
        s=obj.nextLine();
        s1=s.split(" ");
        System.out.println("The double sequence words are:");
        for(i=0;i<s1.length;i++){
            s2=s1[i];
            if(s2.length()>1)
            {
                for(j=0;j<s2.length()-1;j++){
                    if(s2.charAt(j)==s2.charAt(j+1)){
                        System.out.println(s2);
                        break;
                    }
                }
            }
        }
    }
}
