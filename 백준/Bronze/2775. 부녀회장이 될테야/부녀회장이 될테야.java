import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i =0; i<t; i++){
            int k = sc.nextInt();
            int n = sc.nextInt();

            int [][] arr = new int [k+1][n+1];

            for (int l=1; l<=n; l++){
                arr[0][l] = l;
            }
            for (int j=1; j<arr.length; j++){
                arr[j][1] = 1;
                for (int h=2; h<arr[j].length; h++){
                    arr[j][h] = arr[j][h-1] + arr[j-1][h];
                }
            }


            System.out.println(arr[k][n]);
        }
    }
}
