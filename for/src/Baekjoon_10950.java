import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Baekjoon_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 , num3;

        for(int i = 0; i < num1; i++){
            num2 = scanner.nextInt();
            num3 = scanner.nextInt();

            System.out.println(num2+num3);
        }
    }
}
