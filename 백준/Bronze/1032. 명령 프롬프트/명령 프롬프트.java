
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String [] str = new String[n];

        for (int i=0; i<n; i++){
            str[i] = sc.next();
        }
        String result = str[0];

        for (int i=0; i<result.length(); i++){
            for (int j=0; j<n; j++){
                if (str[j].charAt(i) != result.charAt(i)){
                    result = result.substring(0,i) + "?" + result.substring(i+1);
                }
            }
        }

        System.out.println(result);

    }
}
