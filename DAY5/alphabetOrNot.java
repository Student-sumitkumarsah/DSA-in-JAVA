package DSA.DAY5;
import java.util.*;
public class alphabetOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            System.out.println("This character are Alphabet = "+ch );

        }
        else{
            System.out.println("This character are Not Alphabet = "+ch);
        }
    }
    
}
