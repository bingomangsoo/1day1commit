
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nm = br.readLine();

        int n = Integer.parseInt(nm.split(" ")[0]);
        int m = Integer.parseInt(nm.split(" ")[1]);

        int [] bundle = new int[m];
        int [] single = new int[m];

        for (int i =0; i<m; i++){
            String str = br.readLine();
            bundle[i] = Integer.parseInt(str.split(" ")[0]);
            single[i] = Integer.parseInt(str.split(" ")[1]);
        }
        Arrays.sort(bundle);
        Arrays.sort(single);

       int count = 0;
       while(n !=0) {
           if (n > 6) {
               if (bundle[0] > single[0]*6){
                   count+= single[0]*6;
               }else {
                   count += bundle[0];
               }
               n -= 6;
           }else{
               if (bundle[0] < single[0]*n){
                   count += bundle[0];
               }else {
                   count += single[0] * n;
               }
               n = 0;
           }
       }
        System.out.println(count);
    }
}
