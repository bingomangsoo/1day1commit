
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i =0; i<t; i++) {
            String[] strs = br.readLine().split(" ");
            int n = Integer.parseInt(strs[0]);
            int m = Integer.parseInt(strs[1]);

            int [][] arr = new int[m+1][n+1];


            bw.write(Long.toString(recall(m,n,arr))+"\n");
            bw.flush();

        }
    }
    public static int recall(int m, int n,int [][]arr){

        if (arr[m][n] > 0) {
            return arr[m][n];
        }

        if (n==m || n==0){
            return arr[m][n] = 1;
        }else{
            return arr[m][n] = recall(m-1,n-1,arr)+recall(m-1,n,arr);
        }
    }
}
