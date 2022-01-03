import java.util.Scanner;

public class Baekjoon_11021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner. nextInt();

        for(int i = 1; i <= num1; i++){
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            System.out.printf("Case #%d: %d\n",i,(num2+num3));
        }
    }
}
