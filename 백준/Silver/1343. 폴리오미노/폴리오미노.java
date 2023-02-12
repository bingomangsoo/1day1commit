
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        str = str.replace("XXXX","AAAA");
        str = str.replace("XX","BB");

        if (str.contains("X")){
            System.out.println(-1);
        }else{
            System.out.println(str);
        }

    }
}
