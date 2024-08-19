package DSA.DAY8;
import java.util.*;
public class PrimeOrNot {
    public static boolean primeOrNot(int n){

        if(n==2){
            return true;
        }

        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                 return false;
               
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int n=sc.nextInt();
        System.out.println(primeOrNot(n));
    }
    
}
