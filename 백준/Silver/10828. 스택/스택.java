
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i =0; i<n; i++){
            String str = br.readLine();
            if (str.contains("push")){
                int num = Integer.parseInt(str.split(" ")[1]);
                stack.push(num);
            }else if (str.equals("top")) {
                if (stack.empty()){
                    System.out.println("-1");
                }else {
                    System.out.println(stack.peek());
                }
            }else if (str.equals("size")){
                System.out.println(stack.size());
            }else if (str.equals("empty")){
                if (stack.isEmpty()){
                    System.out.println("1");
                }else {
                    System.out.println("0");
                }
            }else if (str.equals("pop")){
                if (stack.empty()){
                    System.out.println("-1");
                }else {
                    System.out.println(stack.pop());
                }
            }

        }
    }
}
