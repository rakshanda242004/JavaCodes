public class binarystr{
    public static int binary_strings(int n, int lastPlace, String str){
        //work
        // if(lastPlace == 0){
        //     //sit 0 on chair n
        //     binary_strings(n-1, 0, str.append("0"));
        //     binary_strings(n-1, 1, str.append("1"));
        // }else{
        //     binary_strings(n-1, 0, str.append("0"));
        // }
        //base case
        if(n == 0){
            System.out.println(str);
        }
        //kaam
        binary_strings(n-1, 0, str+"0");
        if(lastPlace == 0){
            binary_strings(n-1, 0, str+"1");
        }
        return 0;
    }
    public static void main(String args[]){
        binary_strings(3, 0, "");
    }
}