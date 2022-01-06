import java.util.Scanner;

public class Baekjoon_3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = scanner.nextInt();
            arr[i] %= 42;
        }
        // 나머지가 42개인데.. 그걸 하나하나씩 하는건..ㅠ
        // 다른 방법을 찾아보겠습니다...
    }
}
