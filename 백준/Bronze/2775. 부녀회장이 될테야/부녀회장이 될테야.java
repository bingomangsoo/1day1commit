import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i =0; i<t; i++){
            int k = sc.nextInt();
            int n = sc.nextInt();

            int [][] arr = new int [k+1][n+1];

            for (int l=0; l<=n; l++){
                arr[0][l] = l;
            }
            for (int j=1; j<arr.length; j++){
                for (int l =0; l<arr[j].length; l++){
                    for (int b = 0; b<=l; b++){
                        arr[j][l] += arr[j-1][b];
                    }
                }
            }


            System.out.println(arr[k][n]);
        }
    }
}
