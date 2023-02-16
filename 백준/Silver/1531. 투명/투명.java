
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr [][] = new int[101][101];

        for (int i =0; i<n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int j =x1; j<=x2; j++){
                for (int k = y1; k<=y2; k++){
                    arr[j][k]++;
                }
            }
        }


        int cnt = 0;
        for (int j =1; j<=100; j++){
            for (int k =1; k<=100; k++){
                if (arr[j][k] > m){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
