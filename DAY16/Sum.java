import java.util.*;

public class Sum {
    public static void array(int arr1[][],int r1,int c1){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void sumOfArray(int arr1[][],int r1,int c1,int arr2[][],int c2,int r2){
        if(r1!=r2 || c1!=r2){
            System.out.print("Addition not Possible Because: arr1!=arr2");
            return;
        }
        int add[][]=new int[r1][c1];
        for(int i=0;i<add.length;i++){
            for(int j=0;j<add.length;j++){
                add[i][j]=arr1[i][j]+arr2[i][j];
            }
           
        }
        System.out.println("Sum of Two array");
        array(add,r1,r2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Row number for arr1 = ");
        int r1=sc.nextInt();
        System.out.print("Enter the col number for arr1 = ");
        int c1=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        array(arr1,r1,c1);
       System.out.println("For second Matrix");

       System.out.print("Enter the Row number for arr2 = ");
        int r2=sc.nextInt();
        System.out.print("Enter the col number for arr2 = ");
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2.length;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        array(arr2,r2,c2);
        sumOfArray(arr1, r1, c1, arr2, c2, r2);
    }
    
}

