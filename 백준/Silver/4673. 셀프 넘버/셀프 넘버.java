
public class Main {
    public static void main(String[] args) {

        boolean [] arr = new boolean[10001];
        for (int i =1; i<=10000; i++){
            int sum = i;
            int a = i;
            while(a!=0){
                sum += a%10;
                a/=10;
            }
           if (sum <=10000) arr[sum] = true;
        }
        for (int i =1; i<=10000; i++){
            if (!arr[i]){
                System.out.println(i);
            }
        }
    }
}
