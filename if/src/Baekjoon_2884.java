import java.util.Scanner;

public class Baekjoon_2884 {
    public static void main(String[] args) {
        // 원래 알람시간보다 45분 먼저 울리게하기.

        // 입력 시, 분 (24시간 표현)

        // 계속 틀렸다고함.. 틀린이유는 모르겠다..

        final int HOUR = 60;
        final int SETTIME = 45;

        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if( m < 60) {
            if (h == 0) {
                h = 24;
            }

            int addnum = h * HOUR + m - SETTIME;

            h = addnum / HOUR;
            m = addnum % HOUR;

            System.out.println(h);
            System.out.println(m);

        }

    }
}
