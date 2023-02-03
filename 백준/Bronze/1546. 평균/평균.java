
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int max = arr[n-1];

        double sum = 0;
        for (int i=0; i<n; i++){
            double t = (double)arr[i]/max*100;
            sum += t;
        }
        System.out.println(sum/n);
    }
}
