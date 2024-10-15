import java.util.*;
public class stings {
    public static void sumu(String name){
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the your name = ");
        String name=sc.nextLine();
        System.out.println(name);
        sumu(name);
        
    }
    
}
