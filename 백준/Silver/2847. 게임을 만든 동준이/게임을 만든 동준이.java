
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr= new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i =n-1; i>=1; i--){
            if (arr[i] - arr[i-1] <= 0){
                int prev = arr[i-1];
                arr[i-1] = arr[i]-1;
                cnt += prev-arr[i-1];
            }
        }
        System.out.println(cnt);
    }
}
