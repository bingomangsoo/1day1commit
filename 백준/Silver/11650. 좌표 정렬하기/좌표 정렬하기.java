import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int xy [][] = new int[n][2];
        for (int i =0; i<n; i++){
            String str = br.readLine();
            xy[i][0] = Integer.parseInt(str.split(" ")[0]);
            xy[i][1] = Integer.parseInt(str.split(" ")[1]);
        }

        Arrays.sort(xy, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }else{
                    return o1[0] - o2[0];
                }
            }
        });
        for (int x[] :xy){
            for (int y:x){
                bw.write(y+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}