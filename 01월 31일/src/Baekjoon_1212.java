import java.util.Scanner;

public class Baekjoon_1212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int num1 = num;
        int result, sum = 0;
        int a = 0;

        while (num1 > 8) {
            a++;
            num1 = num1 / 8;
        }

        if (num != 0 || num / ((int) (Math.pow(10, a))) >= 1) {
            //System.out.println(a);

            for (int i = a; i >= 0; i--) {
                result = num / (int) (Math.pow(10, i));
                num %= (int) (Math.pow(10, i));
                //System.out.println(result);

                sum += result * (int) Math.pow(8, i);
            }
            //System.out.println(sum);

            String number = Integer.toBinaryString(sum);

            System.out.println(number);
        }else
            System.out.println(0);
    }
}
