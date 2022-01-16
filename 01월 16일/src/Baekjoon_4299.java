import java.util.Scanner;

public class Baekjoon_4299 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int a = (num1+num2)/2;
        int b = (num1-num2)/2;

        if(num1 < num2){
            System.out.println(-1);
        }else{
            if(a+b == num1 && a-b == num2) {
                System.out.print(a+" ");
                System.out.print(b);
            }else
                System.out.println(-1);
        }

    }
}
