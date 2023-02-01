
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i =0; i<t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int max = Math.max(n,m);
            int min = Math.min(n,m);


            System.out.println(C(max).divide(C(max-min).multiply(C(min))));

        }
    }
    public static BigInteger C(int x){
        BigInteger sum = BigInteger.valueOf(1);
        for (int i =x; i>=1; i--){
            sum = sum.multiply(BigInteger.valueOf(Integer.valueOf(i)));
        }
        return sum;
    }
}
