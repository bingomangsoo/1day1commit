import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            for (int j = 4; j <= n; j++) {
                dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1];
            }
            System.out.println(dp[n]);


        }
    }

    public static int func(int sum, int goal, int cnt) {
        if (sum == goal) {
            cnt++;
            return sum;
        } else if (sum > goal) {
            return sum;
        } else {
            for (int i = 1; i <= 3; i++) {
                func(sum + i, goal, cnt);
            }
        }
        return cnt;
    }
}
