import java.util.*;
public class incometax {
public static void main (String args[]) {
    //Income tax Calculator
    Scanner sc = new Scanner(System.in);
    int income = sc.nextInt();
    int tax;
    if(income < 500000) {
        tax = 0; //0% tax
    }
    else if(income >= 500000 && income < 1000000) {
        tax = (int) (income*0.2); //20% tax
    }
    else {
        tax = (int) (income*0.3); //30% tax
    }
    System.out.println("Your tax is :" +tax);
   }
}