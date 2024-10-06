import java.util.*;
public class multiplicationtwoDArray {
    public static void print(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.println(); 
        }

    }

    public static void multiplication(int a[][],int r1,int c1,int b[][],int r2,int c2){
        if(c1!=r2){
            System.out.println("multiplication is not possible ; ");
            return;
        }
        int mult[][]=new int [r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    mult[i][j]+=a[i][k]*b[k][j];
                }
            }
            System.out.println();
        }
        print(mult);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first Matrix row Number = ");
        int r1=sc.nextInt();
        System.out.print("enter the first Matrix col Number = ");
        int c1=sc.nextInt();
        int a[][]=new int [r1][c1];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=sc.nextInt();
            } 
        }
        print(a);
        System.out.print("enter the Second Matrix row Number = ");
        int r2=sc.nextInt();
        System.out.print("enter the second Matrix col Number = ");
        int c2=sc.nextInt();
        int b[][]=new int [r2][c2];
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                b[i][j]=sc.nextInt();
            } 
        }
       
        print(b);
        multiplication(a,r1,c1,b,r2,c2);
        
        
        
       

        
    }
    
    
}
