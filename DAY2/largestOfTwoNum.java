package DSA.DAY2;
import java.util.*;
public class largestOfTwoNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int a=sc.nextInt();
        System.out.print("Enter the second number = ");
        int b=sc.nextInt();
        if(a>=b){
            System.out.print("First number  is the largest value = "+a);
        }
        else{
            System.out.print("Second number is the largest value = "+b);
        }
    }
    
    
}
