import java.util.Scanner;

public class Baekjoon_2914 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(num1*(num2-1)+1);

        /*
        ex)
        곡의 갯수 : 38
        평균 : 24

        계산식
        적작권이 있는멜로디 개수/ 곡의 개수 = 평균
        * 평균값은 올림을 한다.

        24-1 < 평균 <= 24
        // 적어도 몇곡 = 최소는 몇곡일까
        저작권이 있는 멜로디 개수 => 38(24-1)
        -> 오름 해 주기전 멜로디 개수

        따라서
        38(34 -1) +1
         */
    }
}
