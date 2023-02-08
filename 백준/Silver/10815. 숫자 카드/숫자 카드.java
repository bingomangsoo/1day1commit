
import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        StringTokenizer stN = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++){
            set.add(stN.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        String strM = br.readLine();
        StringTokenizer stM = new StringTokenizer(strM);

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<m; i++){
            if (set.contains(stM.nextToken())){
                bw.write("1 ");
            }else{
                bw.write("0 ");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();



    }
}
