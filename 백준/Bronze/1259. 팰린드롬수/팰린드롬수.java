import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            String x = sc.next();
            if (x.equals("0")){
                break;
            }

                int count = 0;
                for (int i =0; i<x.length()/2; i++){
                    if (x.charAt(i)== x.charAt(x.length()-i-1)){
                        count++;
                    }
                }if (count == x.length()/2){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }





    }
}
