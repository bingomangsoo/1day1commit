
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int n1 = n/10;
        int n2 = n%10;


        int sum;
        int result;
        int cnt = 0;
        while(true){
            sum = n1+n2;
            n1 = n2;
            n2 = sum%10;
            result = n1*10+n2;
            cnt++;
            if (result == n){
                break;
            }
        }
        System.out.println(cnt);

    }
}
