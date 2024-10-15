public class shortestPathDisplacement {
    public static float shortest(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='W'){
                x=x-1;
            }
            else if(path.charAt(i)=='N'){
                y=y+1;
            }
            else if(path.charAt(i)=='E'){
                x=x+1;
            }
            else if(path.charAt(i)=='S'){
                y=y-1;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
   public static void main(String[] args) {
    String path="WNEENESENNN";
    float finalResult=shortest(path);
    System.out.println(finalResult);
    
   }
    
    
}