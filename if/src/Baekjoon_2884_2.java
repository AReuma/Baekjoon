import java.util.Scanner;

public class Baekjoon_2884_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int m = in.nextInt();
        in.close();

        if(m < 45) {
            h--;
            h= 60 - (45 - m);
            if(h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        }
        else {
            System.out.println(h + " " + (m - 45));
        }
    }
}
