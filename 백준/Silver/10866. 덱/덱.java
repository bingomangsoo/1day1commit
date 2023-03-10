
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> d = new ArrayDeque<>();
        for (int i =0; i<n; i++){
            String str = br.readLine();
            if (str.contains("push_back")){
                int num = Integer.parseInt(str.split(" ")[1]);
                d.addLast(num);
            } else if (str.contains("push_front")){
                int num = Integer.parseInt(str.split(" ")[1]);
                d.addFirst(num);
            } else if (str.equals("pop_front")){
                if (d.isEmpty()){
                    System.out.println("-1");
                } else {
                    System.out.println(d.poll());
                }
            } else if (str.equals("pop_back")){
                if (d.isEmpty()){
                    System.out.println("-1");
                } else {
                    System.out.println(d.pollLast());
                }
            } else if (str.equals("size")){
                System.out.println(d.size());
            } else if (str.equals("empty")){
                if (d.isEmpty()){
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (str.equals("front")){
                if (d.isEmpty()){
                    System.out.println("-1");
                } else {
                    System.out.println(d.getFirst());
                }
            } else if (str.equals("back")){
                if (d.isEmpty()){
                    System.out.println("-1");
                } else {
                    System.out.println(d.peekLast());
                }
            }
        }
    }
}
