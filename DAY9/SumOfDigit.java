package DSA.DAY9;
import java.util.*;
public class SumOfDigit {
    public static int sumOfDigitNum(int n){
        int result=0;
        while(n>0){
            int lastDigit=n%10;
            result+=lastDigit;
            n=n/10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n=sc.nextInt();
        int finalNum=sumOfDigitNum(n);
       System.out.println(finalNum);

        
    }
    
}
