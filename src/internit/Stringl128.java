package internit;
public class Stringl128 {
    public static void main(String[] args){
        String s="COMPUTER";int i,j;
        for(i=0;i<8;i++){
            for(j=i;j<8;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
