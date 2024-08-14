package DSA.DAY5;
import java.util.*;
public class allEvenNumSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int even=0;
        int odd=0;
        System.out.print("Enter the number = ");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(i%2==0){  
                even=even+i;
            }
            else{
               odd=odd+i;
            }
        }
        System.out.println("Sum of all even number = "+even);
        System.out.println("Sum of all odd number = "+odd);
       
        
    }
    
}
