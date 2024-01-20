import java.util.*;
public class maxsubarray3 {
    public static void max_subarray_sum_3(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i=0; i<numbers.length; i++) {
            cs = cs + numbers[i];
            if(cs<0) {
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }

        System.out.println("Our max subarray sum is : " +ms);
    }


    public static void main(String args[]) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        max_subarray_sum_3(numbers);
    }
}