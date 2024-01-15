import java.util.*;
public class hollowrect {
    public static void hollow_rectangle(int totRows, int totCols) {
        for(int i = 1; i<=totRows; i++) {
            //inner loop - columns
            for(int j = 1; j<=totCols; j++) {
                //cell - (i,j)
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    //boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollow_rectangle(4,5);
    }
}