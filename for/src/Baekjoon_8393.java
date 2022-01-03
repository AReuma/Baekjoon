import java.util.Scanner;

public class Baekjoon_8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int result =0;
        for(int i =1; i <= num1; i++){
            result += i;
        }

        System.out.println(result);
    }
}
