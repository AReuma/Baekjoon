import java.util.Scanner;

public class Baekjoon_10101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] angles = new int[3];
        int sameAngle = 0, check = 0;
        for (int i = 0; i < angles.length; i++) {
            angles[i] = scanner.nextInt();
            check += angles[i];
        }

        for (int i = 0; i < angles.length; i++) {
            for (int j = i; j < angles.length; j++) {
                if(i==j) {
                    continue;
                }else if(angles[i] == angles[j])
                    sameAngle ++;
            }
        }

        //System.out.println("sameAngle " + sameAngle);

        if(check == 180){
            switch (sameAngle){
                case 3:
                    System.out.println("Equilateral");
                    break;
                case 1:
                    System.out.println("Isosceles");
                    break;
                default:
                    System.out.println("Scalene");
            }
        }else
            System.out.println("Error");

    }
}
