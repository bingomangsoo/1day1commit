
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[][] arr = new String[n][4];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            arr[i][0] = str.split(" ")[0];
            arr[i][1] = str.split(" ")[1];
            arr[i][2] = str.split(" ")[2];
            arr[i][3] = str.split(" ")[3];
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[1].equals(o2[1])){
                    if (o1[2].equals(o2[2])){
                        if (o1[3].equals(o2[3])){
                            return o1[0].compareTo(o2[0]);
                        }
                        return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]);
                    }
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                }
                return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
            }
        });

        for (String x[] : arr) {
            bw.write(x[0]+"\n");
        }
        bw.flush();
        bw.close();

    }
}
