import java.util.Scanner;

public class Baekjoon_3046 {
    // 점수 하나와, 두 점수의 평균을 알고 있다. 나머지의 점수를 찾아라

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int avg = scanner.nextInt();

        int num2 = avg*2 -num1;

        System.out.println(num2);
        // 점수 + 점수 / 갯수 -> 평균
        // 점수 + 점수 = 평균 * 갯수
        // 점수 = 평균 * 갯수 -점수
    }
}
