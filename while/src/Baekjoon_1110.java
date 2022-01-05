import java.util.Scanner;

public class Baekjoon_1110 {
    public static void main(String[] args) {
        // 26
        // 2 + 6 = 8  ----- 1
        // 6 + 8 = 14
        // 8 + 4 = 12
        // 4 + 2 = 6
        // 2 + 6 = 8  ----- 2
        // 처음 값과 마지막 값이 같아야함.

        Scanner scanner= new Scanner(System.in);

        int num = scanner.nextInt();

        int A = num / 10;
        int B = num % 10;

        //System.out.println(A + " "+ B);

        int B1 = B;
        int C = A + B;
        int result1;
        int cnt = 1;

        result1 = C % 10;
        while( !(A == B1 && B == result1)){

            C = B1 + result1;
            B1 = result1;
            result1 = C % 10;

            cnt++;
        }

        System.out.println(cnt);
    }
}
