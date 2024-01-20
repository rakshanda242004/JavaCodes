import java.util.*;
public class linearsearch {
    public static int Linear_Search(int numbers[], int key) {
        for (int i=1; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = Linear_Search(numbers, key);
        if(index == -1) {
            System.out.println("NOT found");
        }else {
            System.out.println("The key is at : " + index);
        }
    }
}