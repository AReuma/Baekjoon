import java.util.Scanner;

public class Baekjoon_5522 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;
        for(int i = 0; i < 5; i++){
            num += scanner.nextInt();
        }
        System.out.println(num);
    }
}
