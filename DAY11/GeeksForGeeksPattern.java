public class GeeksForGeeksPattern {
    public static void pattern(int n){
        int a=3;
        int b=2;
        int c=1;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(b+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
            }
            System.out.println();
          
        }
    }
    public static void main(String[] args) {
        pattern(3);
        
    }
    
}
