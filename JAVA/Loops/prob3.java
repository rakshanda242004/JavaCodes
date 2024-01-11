import java.util.*;
public class prob3{
    public static void main(String args[]) {
        //print sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range :");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum +=i;
            i++;
        }
        System.out.println("The sum is : " + sum);
    }
}