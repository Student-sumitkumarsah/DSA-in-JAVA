package DSA.DAY3;
import java.util.*;
public class sumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range = ");
        int range=sc.nextInt();
        int a=1;
        int sum=0;
        while(a<=range){
            sum+=a;
            a++;
        }
        System.out.println(sum);
    }
    
}
