import java.util.*;
public class Repetitions{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int count = 1;
        int counter = 1;
        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i-1)==str.charAt(i)){
                count++;
                counter = Math.max(count,counter);
            }
            else{
                count = 1;
            }
        }
        System.out.println(counter);

    }
}
