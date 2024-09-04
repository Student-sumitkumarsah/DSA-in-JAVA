package DSA.DAY12;

public class lowerDiamondShapepattern {
    public static void lowerDiamond(int n){
        for(int i=n;i>=1;i--){
            //Space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // Star
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        lowerDiamond(4);
        
    }
    
}
