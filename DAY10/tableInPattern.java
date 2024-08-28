package DSA.DAY10;

public class tableInPattern {
    public static void main(String[] args) {
        int table=2;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(table+" ");
                table=table+2;
                
            }
            System.out.println();
        }
    }
    
}
