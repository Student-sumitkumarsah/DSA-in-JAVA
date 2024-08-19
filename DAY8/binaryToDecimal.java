package DSA.DAY8;

public class binaryToDecimal {
    public static void binToDec(int num){
        int pow=0;
        int decimal=0;
        while(num>0){
            int lastDigit=num%10;
            decimal=decimal+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            num=num/10;

        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        binToDec(1000);
        
    }
    
}
