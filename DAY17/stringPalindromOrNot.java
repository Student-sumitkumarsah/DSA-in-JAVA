public class stringPalindromOrNot {
    public static boolean palindromornot(String name){
        int n=name.length();
       
        for(int i=0; i<n/2;i++){
            if(name.charAt(i)!=name.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name="racecar";
       
        
        if(palindromornot(name)==true){
            System.out.println("This String is Palindrom");
        }
        else{
            System.out.println("This String is Not Palindrom");
        }
    }
    
}
