
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String stu [][] = new String[n][2];

        sc.nextLine();
        for (int i =0; i<n; i++){
            String [] str = sc.nextLine().split(" ");
            stu[i][0] = str[0];

            String zero = "0";
            if (str[2].length() ==1 ){
                str[2] = zero + str[2];
            }
            if (str[1].length() ==1 ){
                str[1] = zero + str[1];
            }
            stu[i][1] = str[3]+str[2] + str[1];

        }

        int max = 0;
        String young ="";
        int min = Integer.parseInt(stu[0][1]);
        String old = "";
        for (int i = 0; i<n; i++){
            if(Integer.parseInt(stu[i][1]) > max){
                max = Integer.parseInt(stu[i][1]);
                young = stu[i][0];
            }
            if(Integer.parseInt(stu[i][1]) < min){
                min = Integer.parseInt(stu[i][1]);
                old = stu[i][0];
            }
        }

        System.out.println(young);
        System.out.println(old);
    }
}
