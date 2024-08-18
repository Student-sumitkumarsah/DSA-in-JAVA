package DSA.DAY7;

public class binomialCoeff {
    public static int factorial(int n){
    int f=1;
    for(int i=1;i<=n;i++){
        f=f*i;
    }
    return f;
}


    public static int binocoeff(int n, int r){
        int fac_n=factorial(n);
        int fac_r=factorial(r);
        int fac_nmr=factorial(n-r);

        int binocoeff=fac_n/(fac_r*fac_nmr);

        return binocoeff;
    }
    public static void main(String[] args) {
       System.out.print(binocoeff(5, 2));
        
    }
    
}
