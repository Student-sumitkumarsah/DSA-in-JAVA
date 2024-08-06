package DSA.DAY3;
import java.util.*;
public class printNumber1to10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range = ");
        int a=sc.nextInt();
        int num=1;
        while(num<=a){
            System.out.println(num);
            num++;
        }
    }
    
}
