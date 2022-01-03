import java.util.Scanner;

public class Baekjoon_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int a = num2 % 10;
        System.out.println(num1 * a);

        int b = num2/10;
        int c;
        c = b%10;
        System.out.println(num1 * c);

        b = b/10;
        System.out.println(num1 * b);

        System.out.println(num1*num2);
    }
}
