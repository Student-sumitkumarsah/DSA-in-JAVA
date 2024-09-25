package DSA.DAY15;

public class sumofAllArrayElement {
    public static void Sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,7,8};
        Sum(arr);
        
    }
    
}
