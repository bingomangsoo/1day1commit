
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = {64,32,16,8,4,2,1};

        int sum = 0;
        int cnt = 0 ;

        for (int i =0; i<arr.length; i++){
            if (arr[i]<=n){
                sum+=arr[i];
                cnt++;
            }
            if (sum == n){
                break;
            }
            if(sum!=n && sum>n){
                sum-=arr[i];
                cnt--;
            }
        }
        System.out.println(cnt);
    }
}
