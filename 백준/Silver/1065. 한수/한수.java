
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String num = String.valueOf(i);

            if (num.length() > 2){
                int m = Integer.parseInt(String.valueOf(num.charAt(0)))-Integer.parseInt(String.valueOf(num.charAt(1)));
                int count =0;
                for (int j=0; j<num.length()-1; j++){
                    if (Integer.parseInt(String.valueOf(num.charAt(j))) - Integer.parseInt(String.valueOf(num.charAt(j+1))) == m){
                        count++;
                    }
                }
                if (count == num.length()-1){
                    cnt++;
                }
            }else{
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
