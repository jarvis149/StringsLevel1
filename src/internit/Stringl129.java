package internit;
public class Stringl129 {
    public static void main(String[] args){
        String s="JAVA";int i,j,count;
        for(i=0;i<5;i++){
            count=i;
            for(j=0;j<4;j++){
                if(count>3){
                    count=0;
                }
                System.out.print(s.charAt(count));
                count++;
            }
            System.out.println();
        }
    }
}
