package DSA.DAY7;

public class factorial {
    public static int factorial(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return result;

    }
    public static void main(String[] args) {
        int n=5;
        int factorial=factorial(n);
        System.out.println(factorial);
        
    }
    
}
