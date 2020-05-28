package internit;
public class Stringl127 {
    public static void main(String[] args){
        String s="iLoVeJava";int i,j,count=0;
        for(i=0;i<9;i++){
            for(j=i+1;j<9;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print(s.charAt(j));
            }
            if(i!=0)
            {
            for(j=count;j>=0;j--){
                System.out.print(s.charAt(j));
            }
            count++;
            }
            System.out.println();
        }
    }
}
