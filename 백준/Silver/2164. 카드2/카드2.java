
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for (int i =1; i<=n; i++){
            q.add(i);
        }

        int i = 1;
        while (q.size()!=1){
            if (i%2==0){
                q.add(q.poll());
            }else {
                q.poll();
            }
            i++;
        }

        System.out.println(q.peek());
    }
}
