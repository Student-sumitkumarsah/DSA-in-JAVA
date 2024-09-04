package DSA.DAY10;

public class rotateHalfPyramid {
    public static void rotate_Half_Pyramid(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
        }
        
    }
    public static void main(String[] args) {
        rotate_Half_Pyramid(4);
        
    }
    
}
