
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int m = Integer.parseInt(str.split(" ")[1]);

        Deque<Integer> d = new LinkedList<>();

        for (int i =1; i<=n; i++){
            d.add(i);
        }

        String str2 = br.readLine();
        int cnt = 0;
        for (int i =0; i<m; i++){
            int num = Integer.parseInt(str2.split(" ")[i]);
            while (true){
                if (d.peekFirst() == num) {
                    d.pollFirst();
                    break;
                } else {
                    ArrayList<Integer> arr = new ArrayList<>(d);
                    if (arr.indexOf(num) <= d.size()/2) {
                        d.addLast(d.pollFirst());
                        cnt++;
                    } else {
                        d.addFirst(d.pollLast());
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
