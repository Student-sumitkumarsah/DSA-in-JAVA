package DSA.DAY14;
import java.util.*;
public class traversingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n=sc.nextInt();
       int arr[]=new int [n];
       for(int i=0;i<=arr.length-1; i++){
        System.out.print("Enter the Element = ");
          arr[i]=sc.nextInt();
       }

       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       
    }
    
}
