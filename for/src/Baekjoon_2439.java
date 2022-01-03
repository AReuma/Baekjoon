import java.util.Scanner;

public class Baekjoon_2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        char ch = ' ';

        for (int i = 0; i < num1; i++){
            for(int a = 1; a < num1-i; a++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
