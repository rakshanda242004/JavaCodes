import java.util.*;
public class prob8 {
    public static void main (String args[]) { 
        //display all the numbers entered by the user except multiples of 10
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your number : ");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                continue;
            }
            System.out.println("Number was : " + n);
        }while (true);
    }
}