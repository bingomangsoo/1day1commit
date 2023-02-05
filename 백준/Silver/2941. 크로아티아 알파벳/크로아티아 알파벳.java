
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String [] dict = {"c-", "c=", "dz=", "d-","lj","nj","s=","z="};

        int cnt =0;
        for (int i=0; i<dict.length; i++){
            if (str.contains(dict[i])){
                str = str.replace(dict[i],"a");
            }
        }
        System.out.println(str.length());
    }
}
