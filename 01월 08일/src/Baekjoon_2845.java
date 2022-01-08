import java.util.Scanner;

public class Baekjoon_2845 {
    // 입력
    // 1m^2 당 사람수
    // 넓이
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int[] B1 = new int[5];
        for(int i =0; i < 5; i++){
            B1[i] = scanner.nextInt();
        }

        for(int i = 0; i < 5; i++){
            System.out.print(B1[i]-num1*num2+" ");
        }
    }
}
