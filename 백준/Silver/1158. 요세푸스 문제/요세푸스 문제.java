
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int n = Integer.parseInt(str.split(" ")[0]);
        int k = Integer.parseInt(str.split(" ")[1]);

        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=n; i++){
            q.add(i);
        }

        sb.append("<");

        for (int i =1; i<n; i++){
            for (int j=0; j<k-1; j++){
                q.add(q.poll());
            }
            sb.append(q.poll()+", ");
        }
        sb.append(q.poll()+">");
        bw.write(String.valueOf(sb));
        bw.flush();


    }
}
