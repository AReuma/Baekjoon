import java.util.Scanner;

public class Baekjoon_2752 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[3];

        int tmp = 0;

        for(int i = 0; i< 3; i++)
            num[i] = scanner.nextInt();

        for(int i = 0; i < 3; i++){
            for(int j = i+1; j < 3; j++){
                if(num[i] < num[j]){
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
            //System.out.println(num[i]);
        }

        for(int i = 2; i >= 0; i--)
            System.out.print(num[i]+" ");
    }
}
