package internit;
import java.util.Scanner;
public class Stringl124 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String country[]={"India","England","USA","France","Iran","Italy","Russia"};String wond[]={"Taj Mahal","Big Ben","Statue of liberty","Verdun","Castle","Pompeii","St petersburg"};
        String s;int i;
        System.out.println("The countries are:");
        for(i=0;i<country.length;i++){
            System.out.println(country[i]);
        }
        System.out.println("Enter a country name:");
        s=obj.nextLine();
        for(i=0;i<country.length;i++){
            if(s.equalsIgnoreCase(country[i])){
                System.out.println("Its Wonder is: "+wond[i]);
            }
        }
    }
}
