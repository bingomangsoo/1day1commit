
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;

        while (n>2){
            if (n%5 !=0){
                n-=3;
                cnt++;

                if (n<5 && n%3 !=0){
                    cnt = -1;
                    n = 0;
                }
            }else {
                cnt += n/5;
                n = 0;
            }

        }
        System.out.println(cnt);

    }
}
