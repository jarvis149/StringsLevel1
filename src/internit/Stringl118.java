package internit;
import java.util.Scanner;
public class Stringl118 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=obj.nextLine();
        int i,j;
        int[] freq=new int[s.length()];
        char string[]=s.toCharArray();
        for(i=0;i<s.length();i++)
        {
            freq[i]=1;
            for(j=i+1;j<s.length();j++)
            {
                if(string[i]==string[j]){
                    freq[i]++;
                    string[j]='0';
                }
            }
        }
        System.out.println("Characters And their frequencies are:");
        for(i=0;i<freq.length;i++)
        {
            if(string[i]!='0' && freq[i]!=' ')
            {
                    System.out.println(string[i]+"-"+freq[i]);
        }
        }
    }
}
        
        
