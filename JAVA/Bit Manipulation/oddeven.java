import java.util.*;
public class oddeven {
    public static void Odd_Even(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            //even number
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }
    }
    public static void main(String args[]) {
        Odd_Even(3);
        Odd_Even(11);
        Odd_Even(14);
    }
}