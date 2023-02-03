import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int res = 0;
		int ct = 0;
		int llen = str.length();
		if (llen != 1) {
			while (true) {
				int len = str.length();
				if (len == 1)
					break;
				res = 0;
				for (int i = 0; i < len; i++) {
					char ch = str.charAt(i);
					res += Integer.parseInt(String.valueOf(ch));
				}
				str = String.valueOf(res);
				ct++;
			}
		}else{
			res = Integer.parseInt(str);
		}
		System.out.println(ct);
		if(res % 3 == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}
}