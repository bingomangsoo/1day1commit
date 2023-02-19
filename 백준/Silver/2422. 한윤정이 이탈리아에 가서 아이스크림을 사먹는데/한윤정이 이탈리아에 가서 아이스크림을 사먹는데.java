
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int n = Integer.parseInt(str.split(" ")[0]);
        int m = Integer.parseInt(str.split(" ")[1]);

        int[] arr = new int[n];
        boolean[][] bad = new boolean[n+1][n+1];

        for (int i = 0; i < m; i++) {
            String no = br.readLine();
            int a = Integer.parseInt(no.split(" ")[0]);
            int b = Integer.parseInt(no.split(" ")[1]);
            bad[a][b] = true;
            bad[b][a] = true;
        }

        int cnt = 0;
        for (int i = 1; i<=n-2; i++){
            for (int j = i+1; j<=n-1; j++){
                if (bad[i][j]) continue;
                for (int k = j+1; k<=n; k++){
                    if (! bad[j][k] && !bad[k][i]){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);

    }
}
