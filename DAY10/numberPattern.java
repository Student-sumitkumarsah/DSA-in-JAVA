package DSA.DAY10;

public class numberPattern {
    public static void numberPattern(int n){
        for( int i=1;i<=4;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        numberPattern(5);
        
    }
    
}
