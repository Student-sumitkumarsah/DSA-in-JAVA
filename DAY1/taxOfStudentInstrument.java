package DSA.DAY1;
import java.util.*;
public class taxOfStudentInstrument {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the cost of one pencil = ");
        float a=sc.nextFloat();
        System.out.print("Enter the cost of one pen = ");
        float b=sc.nextFloat();
        System.out.print("Enter the cost of one eraser = ");
        float c=sc.nextFloat();
        float total=a+b+c;

        //Add on with 18% tax

        float newTotal=total+(0.18f*total);
        System.out.println("Bill with 18% tax = "+ newTotal);
        
    }
    
}
