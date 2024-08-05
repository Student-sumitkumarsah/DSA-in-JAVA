package DSA.DAY2;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int a=sc.nextInt();
        System.out.print("Enter the second number = ");
        int b=sc.nextInt();
        System.out.print("Enter the operation = ");
        char operation=sc.next().charAt(0);
        switch(operation){
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;

        }
    }
    
}
