import java.util.Scanner;

public class Baekjoon_1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        scanner.close();

        System.out.println((double) num1/num2);
    }
}
