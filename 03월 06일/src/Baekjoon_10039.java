import java.util.Scanner;

public class Baekjoon_10039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] students = new int[5];
        int avg = 0;
        for (int i = 0; i < students.length; i++) {
            students[i] = scanner.nextInt();

            if(students[i] < 40){
                students[i] = 40;
            }

            avg += students[i];
        }

        System.out.println(avg/students.length);

    }
}
