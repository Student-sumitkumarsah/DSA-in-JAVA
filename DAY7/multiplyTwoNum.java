package DSA.DAY7;
import java.util.*;
public class multiplyTwoNum {
    public static int multyplyTwoNum(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int a=sc.nextInt();
        System.out.print("Enter the second number = ");
        int b=sc.nextInt();
        int product=multyplyTwoNum(a, b);
        System.out.println(product);
        
    }
    
}
