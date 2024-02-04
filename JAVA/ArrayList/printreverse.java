import java.util.ArrayList;
public class printreverse {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<> ();

        //Add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());

        //print the reverse arraylist
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}