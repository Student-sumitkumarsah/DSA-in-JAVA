package DSA.DAY2;
import java.util.*;
public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the marks = ");
        int marks=sc.nextInt();
        
        String status=(marks>=33)?"pass":"fail";
        System.out.print(status);
    }
    
}
