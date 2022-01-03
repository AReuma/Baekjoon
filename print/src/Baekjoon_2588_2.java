import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon_2588_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        String B = scanner.next();

        scanner.close();

        // ex B = 123;
        // 1  2  3
        //[0]

        System.out.println(A * (B.charAt(2) - 48));
        //여기서 왜 '0'을 뺄까..?
        // 문자열 -> 문자로 변경함.
        // 문자에 숫자가 들어가 있음.
        // 숫자는 0 ~ 9는 아스키코드로 48 ~ 57에 해당함.
        // 시작점을 맞추기 위해서 -'0'을 함.
        System.out.println(A * (B.charAt(1) - '0'));
        System.out.println(A * (B.charAt(0) - '0'));

        System.out.println(A * Integer.parseInt(B));

    }
}
