package DSA.DAY7;
import java.util.*;
public class sumOfTwoNum {
    public static int sumOfTwoNum(int num1, int num2 ){
        int sum=num1+num2;
       // System.out.println(sum);
       return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum= sumOfTwoNum(a,b);
        System.out.println(sum);
       
        
    }
    
}
