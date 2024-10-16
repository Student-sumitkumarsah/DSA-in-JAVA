import java.util.*;
public class checkAnagrams {
    public static void check(String str1,String str2){

        // String are change to the lower case
        str1.toLowerCase();
        str2.toLowerCase();

        // check the both String length equal or Not
        if(str1.length()==str2.length()){

            // String are convert t the Array
            char[] str1charArray=str1.toCharArray();
            char[] str2charArray=str2.toCharArray();

            // then both are sort using method
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            boolean result=Arrays.equals(str1charArray,str2charArray);
            if(result){
                System.out.println("this String is Anagrams");
            }
            else{
                System.out.println("this String is Not Anagrams");
            }
        }
        else {
            System.out.println("this String are not equal is length");
        }
       
    }
    public static void main(String[] args) {
        String str1="race";
        String str2="care";
        check(str1, str2);
        
        
    }
    
}
