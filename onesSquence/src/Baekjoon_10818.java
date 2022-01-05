import java.util.Scanner;

public class Baekjoon_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int max=0, min=0;

        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = scanner.nextInt();
        }

        int num1 = arr[0];

        for(int i =0; i < num; i++) {
            if(num1 < arr[i]){
                num1 = arr[i];
                max = i;
            }
        }

        for(int i = 0; i < num; i++){
            if(num1 > arr[i]) {
                num1 = arr[i];
                min = i;
            }
        }

        System.out.print(arr[min]+" "+arr[max]);
    }
}
