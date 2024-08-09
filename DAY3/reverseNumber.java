package DSA.DAY3;

public class reverseNumber {
    public static void main(String[] args) {
        int num=10853;
        int revers=0;
        while(num>0){
            revers=num%10;
            System.out.print(revers);
            num=num/10;
        }
        }
    }
    

