package DSA.DAY5;
import java.util.*;
public class divisibleOrNot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number = ");
        int a=sc.nextInt();
        if(a%5==0 && a%11==0){
               System.out.println("Divisible by 5 and 11");
        }
        else{
            System.out.println("Not divisible by 5 and 11");
        }
    }
    

}
