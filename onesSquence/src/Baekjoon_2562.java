import java.util.Scanner;

public class Baekjoon_2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[9];

        for(int i = 0; i < 9; i++){
            arr[i] = scanner.nextInt();
        }

        int index=0;
        int num = arr[0];
        for (int i = 0; i < 9; i++){
            if(num < arr[i]){
                num = arr[i];
                index = i;
            }
        }

        System.out.println(arr[index]+" "+(index+1));
    }
}
