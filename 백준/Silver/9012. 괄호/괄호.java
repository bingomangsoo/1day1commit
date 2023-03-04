import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        while (T-- > 0) {
            String ps = sc.nextLine();
            Stack<Character> stack = new Stack<>();

            boolean isValid = true;
            for (int i = 0; i < ps.length(); i++) {
                char c = ps.charAt(i);
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.empty()) {
                        isValid = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (isValid && stack.empty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
