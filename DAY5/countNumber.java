package DSA.DAY5;
import java.util.*;
public class countNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int possitive=0;
        int negative=0;
        int zero=0;
        char choice;
        do{
            System.out.print("Enter the number = ");
            int num=sc.nextInt();
            if(num>0){
                possitive++;
            }
            else if(num<0){
               negative++;
            }
            else{
                zero++;
            }
            System.out.println("Do you want to continue click Capital Y else don't continue then click any alphabet but not click capital y ");
            choice=sc.next().charAt(0);
        }while(choice=='Y');
        System.out.println("Possitive  "+possitive);
        System.out.println("Negative "+negative);
        System.out.println("Zero"+zero);

    }
    
}
