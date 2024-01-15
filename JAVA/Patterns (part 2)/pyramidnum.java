import java.util.*;
public class pyramidnum {
    public static void inverted_half_pyramid_withNumbers(int n) {
        for(int i=1; i<=n; i++)  {
            //inner numbers
            for(int j=1; j<=n+1-i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        inverted_half_pyramid_withNumbers(7);
    }
}