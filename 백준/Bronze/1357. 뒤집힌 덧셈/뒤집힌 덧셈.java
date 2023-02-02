
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int revX = rev(x);
        int revY = rev(y);

        System.out.println(rev(revX+revY));
    }
    public static int rev(int x){
        String str = "";
        while(x!=0){
            int y = x%10;
            str += String.valueOf(y);
            x/=10;
        }
        return Integer.parseInt(str);
    }
}
