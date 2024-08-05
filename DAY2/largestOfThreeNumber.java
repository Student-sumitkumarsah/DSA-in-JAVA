package DSA.DAY2;
import java.util.*;
public class largestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int a=sc.nextInt();
        System.out.print("Enter the second number = ");
        int b=sc.nextInt();
        System.out.print("Enter the third number = ");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.print("First number is largest = "+a);
        }
        else if(b>a && b>c){
            System.out.print("Second number is largest = "+b);
        }
        else{
            System.out.print("Third number is largest = "+c);
        }
    }
    
}
