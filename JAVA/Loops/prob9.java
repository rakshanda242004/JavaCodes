import java.util.*;
public class prob9 {
    public static void main(String args[]) {
        //Check if the number entered is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i<=n-1; i++) {
           if(n % i == 0){
            isPrime = false;
           }
        }
       if(isPrime ==true) {
    System.out.println("n is Prime");
       } 
       else{
        System.out.println("n is not Prime");
       }
    }
}