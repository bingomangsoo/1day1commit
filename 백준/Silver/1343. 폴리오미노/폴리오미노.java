
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String[] arr = str.split("\\.");

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() % 2 == 1) {
                arr[0] = "-1";
            } else {
                if (arr[i].length() % 4 == 0) {
                    sb.append("AAAA".repeat(arr[i].length() / 4));
                } else if (arr[i].length() % 4 == 2) {
                    sb.append("AAAA".repeat(arr[i].length() / 4) + "BB");
                }
            }
            sb.append(".");

        }
        if (!str.contains("X")) {
            sb = new StringBuilder(str);
        }



        else if (arr[0].equals("-1")){
            sb = new StringBuilder("-1");
        }

        else if (str.charAt(str.length()-1) != '.'){
            sb = new StringBuilder(sb.substring(0, str.length()));
        }
        else if (str.substring(str.lastIndexOf('X')+1,str.length()).equals(".".repeat(str.length()-1-str.lastIndexOf('X')))){
            String jum =".".repeat(str.length()-2-str.lastIndexOf('X'));
            sb.append(jum);
        }

        System.out.println(sb);
    }
}
