public class half1Butterfly {
    public static void half1Butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        half1Butterfly(4);
        
    }
    
}
