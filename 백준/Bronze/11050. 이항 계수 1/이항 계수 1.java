import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(recall(n,k));


    }
    public static int recall(int n, int r){
        if (r == 0 || n==r){
            return 1;
        }else {
            return recall(n-1,r-1) + recall(n-1,r);
        }
    }
}