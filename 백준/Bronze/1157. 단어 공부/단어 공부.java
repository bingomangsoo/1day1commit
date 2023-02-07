
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        str = str.toUpperCase();

        int [] arr = new int[26];
        int [] cnt = new int[26];

        for (int i=0; i<26; i++){
            arr[i] = 65+i;
        }

        for (int i=0; i<str.length(); i++){
            for (int j=0; j<arr.length; j++){
                if (str.charAt(i) == (char)arr[j]){
                    cnt[j]++;
                }
            }
        }

        int max = 0;
        int index = 0;
        int result = 0;
        for (int i=0; i<cnt.length; i++){
            if (cnt[i]>max){
                max = cnt[i];
                index = i;
                result = arr[index];
            }
        }

        for (int i=0; i<cnt.length; i++){
            if (i != index && cnt[i]==max){
                result = 63;
            }
        }

        System.out.println((char)result);

    }
}
