import java.util.*;
public class ternary {
    public static void main (String args[]) {
        int n = 4;
         
        //ternary operator
        String type = ((n % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}