
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        for (int i =0; i<n; i++){
            String str = br.readLine();
            if (str.contains("push")) {
                int num = Integer.parseInt(str.split(" ")[1]);
                q.add(num);
            } else if (str.equals("pop")) {
                if (q.isEmpty()){
                    System.out.println("-1");
                }else {
                    System.out.println(q.poll());
                }
            }else if ( str.equals("size")) {
                System.out.println(q.size());
            } else if (str.equals("empty")){
                if (q.isEmpty()){
                    System.out.println("1");
                }else {
                    System.out.println("0");
                }
            } else if (str.equals("front")){
                if (q.isEmpty()){
                    System.out.println("-1");
                }else {
                    System.out.println(q.peek());
                }
            } else if (str.equals("back")) {
                if (q.isEmpty()){
                    System.out.println("-1");
                }else {
                    Stack<Integer> s = new Stack<>();
                    Iterator iterator = q.iterator();
                    while (iterator.hasNext()){
                        s.push((Integer) iterator.next());
                    }
                    System.out.println(s.peek());
                }
            }
        }
    }
}
