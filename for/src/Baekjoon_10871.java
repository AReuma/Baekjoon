import java.util.Scanner;

public class Baekjoon_10871 {
    public static void main(String[] args) {
        // n개로 이뤄진 수열 a
        // 정수 x // 수열 a에서 x보다 작은것 출력.

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int[] num3 = new int[num1];
        for(int i = 0; i < num1; i++){ // num1개의 수열
            num3[i] = scanner.nextInt();

        }

        for(int i =0; i < num1; i++){
            if(num3[i] < num2){
                System.out.print(num3[i]+" ");
            }
        }
    }
}
