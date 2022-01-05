import java.util.Scanner;

public class Baekjoon_10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()){
            // hasNextInt() -> 입력값이 정수일 경우 true 아닐 경우 바로 예외, 입력을 받지 않음.
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            System.out.println(num1 + num2);

        }
    }
}
