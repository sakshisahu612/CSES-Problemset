import java.util.*;
public class MissingNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long a = 0;
        long b = (n*(n+1))/2;
        for(long i = 1; i<n; i++){
            long c = scn.nextLong();
            a  = a+c;
        }
        System.out.println(b-a);
        scn.close();
    }    
}
