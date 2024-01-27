import java.util.*;
public class factorial{
    public static int findFactorial(int n){
        if(n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    public static void main(String args[]) {
        int n = 5;
        System.out.println(findFactorial(n));
    }
}