
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        Integer [] arr = new Integer[n.length()];
        for (int i=0; i<n.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(n.charAt(i)));
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int x : arr){
            System.out.print(x);
        }
    }
}
