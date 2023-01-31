import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(C(n)/(C(n-k)*C(k)));


    }
    public static int C(int x){
        int result = 1;
        for (int i =1; i<=x; i++){
            result *= i;
        }
        return result;
    }
}
