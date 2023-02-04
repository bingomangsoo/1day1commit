
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(recall(b, 0, 0, 1) - recall(a, 0, 0, 1) + a(a, 1, 0));


    }

    public static int recall(int x, int sum, int cnt, int num) {
        if (cnt == x) {
            return sum;
        } else {
            for (int i = 0; i < num; i++) {
                sum += num;
                cnt++;
                if (cnt == x) {
                    break;
                }
            }
            num += 1;
            return recall(x, sum, cnt, num);
        }
    }

    public static int a(int x, int y, int cnt) {
        if (x == cnt) {
            return cnt;
        } else {
            for (int i = 0; i < y; i++) {
                cnt++;
                if (cnt == x) {
                    return y;
                }
            }
            y += 1;
            return a(x, y, cnt);
        }
    }
}
