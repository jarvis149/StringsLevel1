package internit;
import java.util.Scanner;
public class Stringl125 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s,name[],temp2;int i,j,marks[],temp;
        name=new String[5];
        marks=new int[5];
        System.out.println("Enter The name of the five students:");
        for(i=0;i<5;i++){
            name[i]=obj.nextLine();
        }
        System.out.println("Enter The marks of the five students:");
        for(i=0;i<5;i++){
            marks[i]=obj.nextInt();
        }
        for(i=0;i<4;i++){
            for(j=0;j<4-i;j++){
                if(marks[j]>marks[j+1]){
                    temp=marks[j];
                    temp2=name[j];
                    marks[j]=marks[j+1];
                    name[j]=name[j+1];
                    name[j+1]=temp2;
                    marks[j+1]=temp; 
                }
            }
        }System.out.println("The merit list is:");
        System.out.println("Name: \t Marks:");
        for(j=4;j>=0;j--){
            System.out.println(name[j]+" \t "+marks[j]);
        }
    }
}
