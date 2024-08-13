package DSA.DAY5;
import java.util.*;
public class vowelOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i'  || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.print("This character are vowel = "+ch);
        }
        else{
            System.out.print("this character are not vowel = "+ch);
        }
    }
    
}
