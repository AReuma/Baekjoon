import java.util.Scanner;

public class Baekjoon_2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        int time = scanner.nextInt();

        H += (time + M)/60;
        M = (time + M) % 60;

        if(H >= 24){
            H = H -24;
        }
        if(M >= 60){
            M = 0;
        }
        System.out.println(H+" "+M);

    }
}
