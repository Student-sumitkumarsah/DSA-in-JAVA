package DSA.DAY1;
import java.util.*;
public class arithmeticOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int a=sc.nextInt();
        System.out.print("Enter the second number = ");
        int b=sc.nextInt();
        System.out.println("Addition = " + (a+b));
        System.out.println("Multiplication = " + (a*b));
        System.out.println("Subtraction = " + (a-b));
        System.out.println("Division = " + (a/b));
        System.out.println("Modulo = " + (a%b));
    }
    
}
