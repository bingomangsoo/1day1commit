
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String n = sc.next();


        eachsum(n,0);

    }
    public static void eachsum(String n, int cnt){

        int sum = 0;
        int len = n.length();
        if (len ==1){
            System.out.println(cnt);
            if (Integer.parseInt(n)%3==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            for (int i=0; i<String.valueOf(n).length(); i++){
                sum+= Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));
            }
            cnt++;
            eachsum(String.valueOf(sum),cnt);
        }
    }
}
