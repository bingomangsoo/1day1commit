import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int max = n1>n2?n1:n2;
        int min = n1<=n2?n1:n2;

        int a= 0;
        for (int i =1; i<=max; i++){
            if (max%i==0){
                for (int j=1; j<=min; j++) {
                    if (min % j == 0) {
                        if (i == j && a<i) {
                            a = i;
                        }
                    }
                }

            }
        }


        System.out.println(a);
        System.out.println(n1*n2/a);
    }
}
