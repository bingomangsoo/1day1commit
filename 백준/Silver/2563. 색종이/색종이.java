
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean [][] paper= new boolean[101][101];

        for (int i=0; i<n; i++){
            int w = sc.nextInt();
            int h = sc.nextInt();

            for (int j =w; j<w+10; j++){
                for (int k=h; k<h+10; k++){
                    paper[j][k] = true;
                }
            }
        }

        int cnt = 0;
        for (int i=0; i<=100; i++){
            for (int j=0; j<=100; j++){
                if (paper[i][j]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);


    }
}
