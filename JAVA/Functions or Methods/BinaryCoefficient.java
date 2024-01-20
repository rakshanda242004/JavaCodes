import java.util.*;
public class BinaryCoefficient{
    public static int binCoeff(int n, int r) {
    int fact_n = n!;
    int fact_r = r!;
    int fact_nmr = (n-r)!;

    int binCoeff = fact_n / (fact_r * fact_nmr);
    return binCoeff;
    }
    
    public static int main(String args[]){

    System.out.print(binCoeff(5,2));
    }
}