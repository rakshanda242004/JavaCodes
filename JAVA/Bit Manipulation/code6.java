import java.util.*;
public class code6 {
    public static boolean isPowerOfTwo(int n) {
        return (n&(n-1)) == 0;
    }

    public static void main(String args[]) {
        System.out.println(isPowerOfTwo(8));
    }
}