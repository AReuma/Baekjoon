import java.util.Scanner;

public class Baekjoon_2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int result = num1 * num2 * num3;

        //System.out.println(result);

        int na, cnt=0;

        int result1 = result;
        while (result1 !=0){
            result1 /= 10;

            cnt++;
            //System.out.println(result1);
        }
        //System.out.println(cnt);

        int[] arr = new int[cnt];
        for(int i = 0; i < cnt; i++){
            arr[i] = result%10;
            result /= 10;
        }

        int zero = 0, one=0 ,two=0 ,three=0 ,four=0 ,five=0 ,six=0 ,seven=0 ,eight=0 ,nine=0;
        for(int i = 0; i < cnt; i++){
            switch (arr[i]){
                case 0:
                    zero++;
                    break;
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
                case 7:
                    seven++;
                    break;
                case 8:
                    eight++;
                    break;
                case 9:
                    nine++;
                    break;
            }
        }
        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);
    }
}
