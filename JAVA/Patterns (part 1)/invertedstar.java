import java.util.*;
public class invertedstar{
    public static void main(String args[]) {
        //Inverted Star Pattern
        for(int line =1; line<= 4;line++){
            for(int star=1; star<=4-line+1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}