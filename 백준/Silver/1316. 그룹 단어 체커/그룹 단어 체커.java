import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력받을 단어의 개수
        sc.nextLine(); // 개행 문자 제거

        int cnt = 0; // 그룹 단어 개수 카운트

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            boolean[] check = new boolean[26]; // 알파벳 체크 배열

            // 첫 번째 글자 처리
            check[word.charAt(0) - 'a'] = true; // 첫 번째 글자를 true로 처리

            boolean isGroup = true; // 그룹 단어인지 확인하는 변수

            for (int j = 1; j < word.length(); j++) {
                char ch = word.charAt(j);

                // 이미 체크한 알파벳이고, 이전 알파벳과 다른 경우
                if (check[ch - 'a'] && word.charAt(j - 1) != ch) {
                    isGroup = false; // 그룹 단어가 아님
                    break;
                }

                check[ch - 'a'] = true; // 해당 알파벳을 true로 체크
            }

            if (isGroup) cnt++; // 그룹 단어이면 개수 증가
        }

        System.out.println(cnt);
    }
}