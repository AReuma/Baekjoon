import java.util.Scanner;

public class Baekjoon_11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();

        for(int i = 0; i < num1; i++){
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            System.out.printf("Case #%d: %d + %d = %d\n", i+1, num2, num3, (num2+num3));
        }
    }
}
