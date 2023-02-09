
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        int n = sc.nextInt();
        String [] str = new String[n];

        for (int i= 0; i<n; i++){
            str[i] = sc.next();
        }

        int max = 0;
        String resultStr = str[0];
        for (int i=0; i<n; i++){
            int result = 0;
            int L = name.length() - name.replace("L","").length();
            int O = name.length() - name.replace("O","").length();
            int V = name.length() - name.replace("V","").length();
            int E = name.length() - name.replace("E","").length();
            for (int j=0;j<str[i].length(); j++){
                if (str[i].charAt(j) == 'L'){
                    L++;
                }
                if (str[i].charAt(j) == 'O'){
                    O++;
                }
                if (str[i].charAt(j) == 'V'){
                    V++;
                }
                if (str[i].charAt(j) == 'E') {
                    E++;
                }
            }
            result = (L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E)%100;
            if (result > max){
                max = result;
                resultStr = str[i];
            } else if (result == max) {
                if (resultStr.compareTo(str[i])>0){
                    resultStr = str[i];
                }
            }

        }
        System.out.println(resultStr);
    }
}
