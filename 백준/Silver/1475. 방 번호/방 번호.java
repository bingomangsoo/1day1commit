
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        int [] arr = new int[10];

        for (int i=0; i<num.length(); i++){
            arr[Integer.parseInt(String.valueOf(num.charAt(i)))]++;
        }

        int max = 0;
        arr[6] = (int) Math.ceil((arr[6]+arr[9])/(double)2);
        arr[9] = arr[6];


        for (int x : arr){
            if (x>max){
                max = x;
            }
        }

        System.out.println(max);
    }
}
