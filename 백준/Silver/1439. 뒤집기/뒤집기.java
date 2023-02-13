
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        StringTokenizer st0 = new StringTokenizer(str,"0");
        StringTokenizer st1 = new StringTokenizer(str,"1");

        System.out.println(Math.min(st0.countTokens(), st1.countTokens()));
    }
}
