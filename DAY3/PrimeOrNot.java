package DSA.DAY3;
import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int n=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime);
        
    }
    
}
