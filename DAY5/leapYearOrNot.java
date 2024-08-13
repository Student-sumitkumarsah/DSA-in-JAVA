package DSA.DAY5;
import java.util.*;
public class leapYearOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        boolean result=false;
        if(year%400==0){
            result=true;
        }
        else if(year%100==0){
            result=false;
        }
        else if(year%4==0){
            result=true;
        }
        else{
            result=false;
        }
        

        if(result){
            System.out.println("year"+" " +year+" "+ "is a leap year ");
        }
        else{
            System.out.println("year"+year+"is a not leap year");
        }
    }
    
}
