package DSA.DAY8;


public class decimalToBinary {
    public static void DecToBinary(int num){
        int bin=0;
        int pow=0;
        while(num>0){
            int rem=num%2;
            bin=bin+rem*((int)Math.pow(10,pow));
            pow++;
            num=num/2;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        DecToBinary(5);
       
    }
    
    
    
}
