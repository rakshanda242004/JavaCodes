public class friends{
    public static int friends_pairing(int n) {
        if(n == 1 || n == 2){
            return n;
        }
        //choice
        //single
        int fnm1 = friends_pairing(n-1);

        //pair
        int fnm2 = friends_pairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totWays
        int totWays = fnm1 + pairWays;
        return totWays;
    }
    public static void main(String args[]) {
       System.out.println(friends_pairing(3)); 
    }
}