
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] arr= new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int cnt = 0;
        int s = 0;
        int e = n-1;

        while (s < e){
            int sum = arr[s]+arr[e];
            if (sum > m){
                e--;
            }else if (sum < m) {
                s++;
            }
            if (sum == m){
                e--;
                s++;
                cnt++;
            }
        }
        System.out.println(cnt);



    }
}
