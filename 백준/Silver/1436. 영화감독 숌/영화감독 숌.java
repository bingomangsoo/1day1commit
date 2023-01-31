import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = 666;

        while (n>0){
            if (String.valueOf(num).contains("666")){
                n--;
            }
            num++;
        }
        System.out.println(num-1);


    }
}
