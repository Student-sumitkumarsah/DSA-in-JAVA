package DSA.DAY5;
import java.util.*;
public class alphabetDigitOrSpecial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        //int num=sc.nextInt();
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            System.out.println("this is a character = "+ch);
        }
         else if(ch>='0' && ch<='9'){
            System.out.println("this is a number = "+ch);
        }
        else{
            System.out.println("this is a special character ");
        }
    }
    
}
