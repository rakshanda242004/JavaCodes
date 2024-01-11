import java.util.*;
public class prob2{
    public static void main(String args[]) {
        //print numbers from 1 to n
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter range :");
        int range = sc.nextInt();
        int counter = 1;
        while (counter <= range) {
            System.out.println(counter);
            counter++;
        }
        System.out.println();
    }
}