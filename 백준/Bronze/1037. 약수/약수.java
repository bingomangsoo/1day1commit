
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] yak = new int[n];
        for (int i=0; i<n; i++){
            yak[i] = sc.nextInt();
        }

        Arrays.sort(yak);
        System.out.println(yak[0]*yak[n-1]);
    }
}
