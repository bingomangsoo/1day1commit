
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int n1 = Integer.parseInt(str.split(" ")[0]);
        int n2 = Integer.parseInt(str.split(" ")[1]);
        int n3 = Integer.parseInt(str.split(" ")[2]);

        if (n1 == n2 && n2== n3){
            System.out.println(10000+n1*1000);
        } else if (n1==n2 && n2 != n3){
            System.out.println(1000+n1*100);
        } else if (n2==n3 && n1 != n2){
            System.out.println(1000+n2*100);
        } else if (n1==n3 && n2 != n3){
            System.out.println(1000+n1*100);
        } else {
            int max = Math.max(n1,n2);
            max = Math.max(max,n3);
            System.out.println(max*100);
        }
    }
}
