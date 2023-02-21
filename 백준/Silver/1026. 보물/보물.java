
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String a = br.readLine();
        String[] arr = a.split(" ");

        String b = br.readLine();
        String [] brr = b.split(" ");

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1)-Integer.parseInt(o2);
            }
        });
        Arrays.sort(brr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o2)- Integer.parseInt(o1);
            }
        });

        int s = 0;
        for (int i =0; i<n; i++){
            s += Integer.parseInt(arr[i])*Integer.parseInt(brr[i]);
        }
        System.out.println(s);

    }
}
