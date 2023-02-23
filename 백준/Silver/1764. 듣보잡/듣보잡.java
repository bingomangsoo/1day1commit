
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nm = br.readLine();

        int n = Integer.parseInt(nm.split(" ")[0]);
        int m = Integer.parseInt(nm.split(" ")[1]);



        Set<String> hash =new HashSet();

        for (int i =0; i<n; i++){
            hash.add(br.readLine());
        }

        List<String> arr = new ArrayList<>();

        for (int i =0; i<n; i++){
            String str = br.readLine();
            if (hash.contains(str)){
                arr.add(str);
            }
        }

        System.out.println(arr.size());
        Collections.sort(arr);
        for (String x : arr){
            System.out.println(x);
        }

    }
}
