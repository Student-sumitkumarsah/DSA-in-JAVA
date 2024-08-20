package DSA.DAY9;
import java.util.*;
public class palindromOrNot {
    public static boolean ispalindrom(int n){
        int result=0;
        int check=n;
        while(n>0){
            int rem=n%10;
            result=(result*10)+rem;
            n=n/10;

        }
        if(check==result){
            return true;
        }
        else{
            return false;
        }
       
    }
    public static void main(String[] args) {
        //System.out.println(ispalindrom(121));
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n=sc.nextInt();
        if(ispalindrom(n)){
            System.out.print("Number is "+" "+n+" "+"Palindrom");
        }
        else{
            System.out.print("Number is "+" "+n+" "+"is Not Palindrom");
        }
        
        
    }
    
}
