package DSA.DAY12;

public class fullShapeDiamond {
   public static void fullDiamond(int n){
    for(int i=1;i<=n;i++){
        //Space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
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
        fullDiamond(4);
        
    }

          
}
    

