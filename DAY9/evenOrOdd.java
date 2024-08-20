package DSA.DAY9;
import java.util.*;
public class evenOrOdd {
    public static boolean isEven(int n){
        boolean result=true;
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n=sc.nextInt();
        if(isEven(n)){
            System.out.println("Number is Even ");
        }
        else{
            System.out.println("Number is odd");
        }
        
        
    }
    
}
