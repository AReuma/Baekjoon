import java.util.Scanner;

public class Baekjoon_3003 {
    public static void main(String[] args) {
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] num = new int[6];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 6; i++){
            num[i] = scanner.nextInt();

            System.out.print(chess[i] - num[i] + " ");
        }
    }
}
