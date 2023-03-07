
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean [][] arr = new boolean[n][m];


        int min = 64;
        for (int i =0; i<n; i++){
            String str = sc.next();
            for (int j =0; j<m; j++){
                if (str.charAt(j) == 'W'){
                    arr[i][j] = true;
                }else {
                    arr[i][j] = false;
                }
            }
        }

        int rowN = n-7;
        int rowM = m-7;

        for (int i=0; i<rowN; i++){
            for (int j =0; j<rowM; j++){

                int cnt = 0;
                int endN = i+8;
                int endM = j+8;

                boolean first = arr[i][j];

                for (int x = i; x<endN; x++){
                    for (int y = j; y<endM; y++){
                        if (arr[x][y]!= first){
                            cnt++;
                        }
                        first = !first;
                    }
                    first = !first;
                }

                cnt = Math.min(cnt, 64-cnt);
                min = Math.min(cnt, min);
            }
        }

        System.out.println(min);

    }
}
