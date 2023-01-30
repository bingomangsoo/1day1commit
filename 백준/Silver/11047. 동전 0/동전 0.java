
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int [] arr = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[n-1];
        int count = 0;
        while (k!=0){
            for (int i=n-1; i>=0; i--){

                if (k-arr[i] <= min && k >= arr[i]){
                    min = arr[i];
                    break;
                }
            }
            count += k/min;
            k-= (k/min)*min;
        }
        System.out.println(count);

    }
}
