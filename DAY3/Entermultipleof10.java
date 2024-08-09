package DSA.DAY3;
import java.util.*;
public class Entermultipleof10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // System.out.print("Enter the number = ");
        do{
            System.out.print("Enter the number = ");
            int a=sc.nextInt();
            if(a%10==0){
                break;
            }
            System.out.print(a);

        }while(true);
        
    }
}